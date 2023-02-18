import java.rmi.*;
public class MyServer{
    public static void main(String[] args){
        try{
            Fact stub=new FactRemote();
            Naming.rebind("rmi://localhost:5000/sonoo",stub);
        }catch(Exception e){System.out.println(e.getMessage());}
    }
}