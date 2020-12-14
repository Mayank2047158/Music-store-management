package MayankNew;       //package defined

import java.util.Scanner;

class LoginException extends Exception{	//userdefined exception
  	 
    String message;
    
    public LoginException(String message)
    {
        super(message);		// call the constructor of parent Exception
        this.message = message;
    }
} 

public class Login{
   
    public void login()		//function login
	{
		Scanner sc = new Scanner(System.in);

        try
		{
		
		String pass;
		String user;

		System.out.println("Enter user name: ");
		user=sc.next();
		System.out.println("Enter password: ");
		pass =sc.next();

		if(user.equals("BlackNirvana") && pass.equals("2047158"))
		{
 			System.out.println("Credential Accepted ");
			int i = 3;
			while (i>0)
			{
			System.out.println("Logging in " + i + " seconds");
			try
			{
				i--;
				Thread.sleep(1000L);	//thread implementation
			 }
			catch (InterruptedException e) {}

			}
		}
		else
		{
			throw new LoginException("Wrong username and password!");		// Throw an object of user defined exception 
			
		}
		}
		catch (LoginException e)
		{
			System.out.println("" + e + "Exception");		// Print the message from CustomException object
			System.out.println("Enter 0 to exit and 1 to continue: ");
			int ex = sc.nextInt();
			if (ex == 0)
			{
				System.exit(0);
			}
			else
				login();
		}
	
	}
}