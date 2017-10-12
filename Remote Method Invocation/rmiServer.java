import java.rmi.*;
import java.rmi.server.*;
public class rmiServer extends UnicastRemoteObject implements rmiInterface
{
	public rmiServer() throws RemoteException
	{
	}
	
	public static void main(String args[]) throws Exception
	{
	   System.out.println("In Server : ");
	   rmiServer s =  new rmiServer();
	   Naming.rebind("rmiServer",s);
        }

   public int multiply(int x1,int y1)
    {
       return x1*y1;
    }
}
