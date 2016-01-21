package clientapplication;


/**
 *
 * @author Damiano Di Stefano, Marco Giuseppe Salafia
 */
public interface Coordinator
{
    public void deposita(String username);
    
    public void preleva(String username);
    
    public void leggi(String username);
}
