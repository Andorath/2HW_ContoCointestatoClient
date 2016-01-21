package clientapplication;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Damiano Di Stefano, Marco Giuseppe Salafia
 */
public class Coordinator1 implements Coordinator
{

    public Coordinator1() { }
            
    @Override
    public void deposita(String username)
    {
        double cifra;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci la somma da versare: ");
        
        cifra = s.nextDouble();
        
        deposit(username, cifra);
        
        while(getWriteResult() == null)
        {
            System.out.print(".");
            try
            {
                Thread.sleep(500);
            } 
            catch (InterruptedException ex)
            {
                Logger.getLogger(Coordinator1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(getWriteResult() == true)
            System.out.println("\nDeposito effettuato.");
        else
            System.out.println("\nErrore durante il deposito.");
    }

    @Override
    public void preleva(String username)
    {
        double cifra;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci la somma da prelevare: ");
        
        cifra = s.nextDouble();
        
        withdraw(username, cifra);
        
        while(getWriteResult() == null)
        {
            System.out.print(".");
            try
            {
                Thread.sleep(500);
            } 
            catch (InterruptedException ex)
            {
                Logger.getLogger(Coordinator1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(getWriteResult() == true)
            System.out.println("\nPrelievo effettuato.");
        else
            System.out.println("\nErrore durante il prelievo.");
    }

    @Override
    public void leggi(String username)
    {
        read(username);
        while(getReadResults().equals(""))
        {
            System.out.print(".");
            try
            {
                Thread.sleep(500);
            } catch (InterruptedException ex)
            {
                Logger.getLogger(Coordinator1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("\n" + getReadResults());
    }

    private static void deposit(java.lang.String userID, double operationValue)
    {
        conto.webservice.WebService service = new conto.webservice.WebService();
        conto.webservice.WebServices port = service.getWebServicesPort();
        port.deposit(userID, operationValue);
    }

    private static void withdraw(java.lang.String userID, double operationValue)
    {
        conto.webservice.WebService service = new conto.webservice.WebService();
        conto.webservice.WebServices port = service.getWebServicesPort();
        port.withdraw(userID, operationValue);
    }  

    private static void read(java.lang.String userID)
    {
        conto.webservice.WebService service = new conto.webservice.WebService();
        conto.webservice.WebServices port = service.getWebServicesPort();
        port.read(userID);
    }
    
    private static Boolean getWriteResult()
    {
        conto.webservice.WebService service = new conto.webservice.WebService();
        conto.webservice.WebServices port = service.getWebServicesPort();
        return port.getWriteResult();
    }  

    private static String getReadResults()
    {
        conto.webservice.WebService service = new conto.webservice.WebService();
        conto.webservice.WebServices port = service.getWebServicesPort();
        return port.getReadResults();
    }   
}
