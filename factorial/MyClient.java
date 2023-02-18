
import java.rmi.*;
public class MyClient{
    public static void main(String args[]){
        try{
            Fact stub=(Fact)Naming.lookup("rmi://localhost:5000/sonoo");
            System.out.println(stub.fact(5));
        }catch(Exception e){}
    }
}