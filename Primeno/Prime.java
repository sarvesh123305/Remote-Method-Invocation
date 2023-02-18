
import java.rmi.*;
public interface Prime extends Remote{
     int Primeno(int x)throws RemoteException;
}