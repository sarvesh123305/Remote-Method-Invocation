
import java.rmi.*;
import java.rmi.server.*;
public class FactRemote extends UnicastRemoteObject implements Fact{
    FactRemote()throws RemoteException{
        super();
    }
    public int fact(int x){
        int facto=1;
        for(int i=1;i<=x;i++)
        {
            facto=facto*i;
        }
        return  facto;
    }
}