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
        do {
            System.out.println("\n\n       Menu");
            System.out.println("--------------------------------------");
            System.out.println("1-View The Cars");
            System.out.println("2-Make offer for car");
            System.out.println("3-View the cars that I own");
            System.out.print("\nSelect a Menu Option: ");
        try {
            int input = myObj.nextInt(); // Get user input from the keyboard 


            switch (input) {
            case 1:  System.out.println("You have choosen 1");
                     break;
            case 2:  // do something
                     break;
          
           }
          } catch (NumberFormatException e) {  }

        }
        while(true); // Display the menu until the user closes the program
      
        
    }
}
