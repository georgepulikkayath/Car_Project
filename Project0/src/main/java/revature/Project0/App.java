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
    	while(true) {
        System.out.println("Main Menu\n");
        System.out.println("-----------------");
        Scanner myObj = new Scanner(System.in);
   
        System.out.println("Do you have an account?if yes press y otherwise press N");
        
        char c=myObj.next().charAt(0);
        char check=Character.toLowerCase(c);
        switch(check) {
        case 'y':Login();
       
        break;
        case 'n':createAccount();
        break;
        default:System.out.println("Invalid choice");
        break;
    
        }
    	}
       
    }
  
	public static void createAccount() {
		// TODO Auto-generated method stub
    	
    	Scanner myobj=new Scanner(System.in);
    	
    	System.out.println("Registeration Page");
    	System.out.println("Enter your email id:");
    	String emailId=myobj.nextLine();
    	System.out.println("Enter your username:");
    	String uname=myobj.nextLine();
    	System.out.println("Enter a password:");
    	String pswd=myobj.nextLine();
      Check(emailId,uname,pswd);
    	  
    
    	
		
	}
	
	

	public static  void Check(String emailId,String uname,String pswd) {
	  	String check="";
  	  String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if(emailId.equals(check)||(uname.equals(check))||(pswd.equals(check))){
    		System.out.println("fill the fields");
    		createAccount();
    	}
    	
    	else if(emailId.matches(regex)==false) {
    		System.out.println("email is not valid");
    		createAccount();
    	}
    	else {
    		System.out.println("It is  a valid entry");
    		Login();
    	}
    	
	}
	public static void Login() {
		// TODO Auto-generated method stub
    	String UserName;
    	String Runame="admin";
    	  Scanner myObj = new Scanner(System.in);
    	  System.out.println("Login page");
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

