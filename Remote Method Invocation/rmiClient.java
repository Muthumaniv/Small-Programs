import java.io.*;
import java.net.*;
import java.rmi.*;

public class rmiClient
   {
  public static void main(String args[]) throws Exception
      {
       
       rmiInterface m= (rmiInterface)Naming.lookup("rmi://"+args[0]+"/rmiServer");

       System.out.println("No. of times purchased "+args[1]);
       int a= Integer.parseInt(args[1]);

       System.out.println("Unit price  "+args[2]);
       int b= Integer.parseInt(args[2]);

       System.out.println("Total :  "+m.multiply(a,b));

      }
    }
