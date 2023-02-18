
import java.rmi.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MyClient{
    public static void main(String args[]){
        try{
            Prime stub=(Prime) Naming.lookup("rmi://localhost:5000/sonoo");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int number=scanner.nextInt();
            int no=stub.Primeno(number);
            if(no==1)
            System.out.println("It is prime number");
            else
                System.out.println("It is not prime number");

        }catch(Exception e){}
    }
}