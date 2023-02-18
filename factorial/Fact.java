
import java.rmi.*;
public interface Fact extends Remote{
     int fact(int x)throws RemoteException;
}