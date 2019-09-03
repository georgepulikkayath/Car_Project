package revature.Project0;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("First Project\n");
        System.out.println("-----------------");
        Scanner myObj = new Scanner(System.in);
        String userName;
        System.out.println("Enter username\n"); 
        userName = myObj.nextLine();   
           
        System.out.println("Username is: " + userName);  
        System.out.println("Enter the password\n");
        String pswd;
        pswd=myObj.nextLine();
        System.out.println("The password is"+pswd);
        System.out.println("\n1.View the cars");
        System.out.println("\n2.Make offer");
        System.out.println("\n3.View the cars that you own");
        System.out.println("\n4.View Payments");
        System.out.println("Enter your option");
        int opt=myObj.nextInt();
        System.out.println("The option is"+opt);
      
        
    }
}
