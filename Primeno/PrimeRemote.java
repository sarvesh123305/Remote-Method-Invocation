
import java.rmi.*;
import java.rmi.server.*;
public class PrimeRemote extends UnicastRemoteObject implements Prime{
    PrimeRemote()throws RemoteException{
        super();
    }
    public int Primeno(int x) {
        int flag=0;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                flag=0;
                break;
            } else
                flag=1;

        }
        return flag;
    }
}