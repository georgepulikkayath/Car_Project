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
   
        System.out.println("Do you have an account?if yes press y otherwise press N");
        char c=myObj.next().charAt(0);
        if((c=='y')||(c=='Y')) {
        	System.out.println("it matches");
        	Login();
        }
       
      
       
        else if((c=='n')||(c=='N')) {
        	System.out.println("Create an account");
        }
        
       
    }
    public static void Login() {
		// TODO Auto-generated method stub
    	String UserName;
    	String Runame="admin";
    	  Scanner myObj = new Scanner(System.in);
		System.out.println("Enter username");
		UserName=myObj.nextLine();
		System.out.println("The username is:"+UserName);
		System.out.println("Enter the password");
		String pswd=myObj.nextLine();
		System.out.println("The password is"+pswd);
		
		if(UserName.equals(Runame)) {
			System.out.println("Go to admin menue");
		}
		
	}

	
}

