package clientapplication;

import java.util.Scanner;

/**
 *
 * @author Damiano Di Stefano, Marco Giuseppe Salafia
 */
public class ClientApplication 
{
    private static String username;
    private static Coordinator coordinator;
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException
    {
        setCoordinator(getCoordinator());
        
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        
        System.out.println("Inserisci nome utente: ");
        username = scanner.nextLine();
        
        while (true)
        {
            printMenu();
            choice = scanner.nextInt();
            switch(choice)
            {
                case 1:
                    coordinator.preleva(username);
                    break;
                case 2:
                    coordinator.deposita(username);
                    break;
                case 3:
                    coordinator.leggi(username);
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Comando non contemplato!");
            }
        }
    }
 
    public static void printMenu()
    {
        System.out.println("Benvenuto, " + username + "\n");
        System.out.println("--------------MENU--------------");
        System.out.println("\n\t1) Preleva");
        System.out.println("\t2) Deposita");
        System.out.println("\t3) Leggi Storico");
        System.out.println("\t9) Esci");
        System.out.println("--------------------------------");
        System.out.println("\nInserisci il comando:");
    }  
    
    private static void setCoordinator(String c)
    {
        switch(c)
        {
            case "COO1":
                        System.out.println("Mi sta gestendo il Coordinator 1");
                        coordinator = new Coordinator1();
                        break;
            case "COO2":
                        System.out.println("Mi sta gestendo il Coordinator 2");
                        coordinator = new Coordinator2();
                        break;  
               
        }
    }

    private static String getCoordinator()
    {
        conto.webservice.LoadBalancerWebService_Service service = new conto.webservice.LoadBalancerWebService_Service();
        conto.webservice.LoadBalancerWebService port = service.getLoadBalancerWebServicePort();
        return port.getCoordinator();
    }
    
    
}
