package redbus.com;

public class RedBusDriver {

	public static void main(String[] args) 
	{
		 
			  RedBus r = new RedBus();
			  System.out.println("***WELCOME TO REDBUS***");
			  System.out.println("Please Choose from below options");
			  
			  
			  for(;;)
				{
				  System.out.println("1.SignUp 2.Login 3.Logout 4.Book Ticket 5.Remove Ticket 6.Change Date 7.Show Ticket 8.exit");
				  
				   int choice=r.sc.nextInt();
				    switch(choice)     
				    {
				    case 1:
				    	r.signUp();
				    	break;
				    case 2:
				    	r.login();
				    	break;
				    case 3:
				    	r.logout();
				    	break;
				    case 4:
				    	r.bookTicket();
				    	break;
				    case 5:
				    	r.removeTicket();
				    	break;
				    case 6:
				    	r.changeDate();
				    	break;
				    case 7:
				    	r.showTicket();
				    	break;
				    case 8:
				    	System.err.println("application is closed");
				    	System.exit(1);
				    	break;

				    }
				}
			  
	}

}
