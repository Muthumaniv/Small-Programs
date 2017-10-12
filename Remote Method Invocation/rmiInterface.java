import java.rmi.*;
public interface rmiInterface extends Remote
 {
    int multiply(int x,int y) throws RemoteException;
 }
