package redbus.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class RedBus
{ 
	List l= new ArrayList();
	List l1= new ArrayList();
	Scanner sc= new Scanner(System.in);
	
	public void signUp()
   {
	   
	   System.out.println("Enter your name:");
	   String accname=sc.next();
	   System.out.println("Enter user id:") ;  
	   String userid=sc.next(); 
	   System.out.println("Enter Password:") ;  
	   String pass=sc.next(); 
	   System.out.println("Enter your Contact No:") ;  
	   long cno =sc.nextLong(); 
	   
	   Account a = new Account( accname, userid, pass, cno); 
	   
	   
		     if(l.add(a))
		     {
		     System.out.println("Account created successfully!!!"); 
		    
		     } 
		     else 
		     {
		     System.out.println("Create Account first"); 
		     }
		     
		    
   }     
	     
   
	
	public void login()
   {
		System.out.println("Enter your User id : ");
		String uid=sc.next();
		System.out.println("Enter your password: ");
		String pass1=sc.next(); 
		
		
		 for(int i=0;i<l.size();i++) 
		   {
			 Account a1=(Account)l.get(i);
			 
			 if((a1.userid.equals(uid))&&(a1.pass.equals(pass1))) 
					 {
				       System.out.println("Login Successful!!! ");
				       
//				       System.out.println("You want to logout press 1");
//				       int ans=sc.nextInt();
//				       if(ans==1) 
//				       {
//				    	   logout();
//				       }
				   } 
			 else 
			 {
				 System.out.println("Incorrect Credentials!");
				// login();
			 }
			
		   }  
		
		
   } 
   
   public void logout()
   {
	   //System.out.println("Logout successfull!!");
	   System.out.println("enter userid");
		String id=sc.next();
		for(int i=0;i<l.size();i++)
		{
			Account a1=(Account)l.get(i);
				if(a1.userid.equals(id))
				{
					
					System.out.println("Logout successfull!!");
					return;
				} 
				else 
				{ 
					System.out.println("Login First");
					login();
				}
	    }
		
		
	   
   } 
   
   public void bookTicket()
   {
	    System.out.println("enter userid");
		String id=sc.next();
		for(int i=0;i<l.size();i++)
		{
			Account a1=(Account)l.get(i);
				if(a1.userid.equals(id))
				{
				   System.out.println("Enter your starting loc:");
				   String from=sc.next();
				   System.out.println("Enter destination:") ;  
				   String dest=sc.next(); 
				   System.out.println("Enter date:") ;  
				   String date=sc.next(); 
				     Ticket t = new Ticket(from,dest,date);
				     
				     System.out.println("Enter number of tickets:"); 
				     int ticket=sc.nextInt();
				     
				     for(int j=0;j<ticket;j++)
				     {
				     l1.add(t);
				     
				     }
				     System.out.println( ticket +" Tickets booked"); 
				} 
				else 
				{
					System.out.println("Enter Your correct User Id");	
				}
		}
	     
   } 
   
   public void removeTicket()
   {
	   System.out.println("Enter Your User Id");
	   String uid=sc.next();
		for(int i=0;i<l.size();i++)
		{
			Account a1=(Account)l.get(i);
			if(a1.userid.equals(uid))
				{
					for(int j=0;j<l1.size();j++)
					{
					Ticket t1=(Ticket)l1.get(j);
					l1.remove(t1);
					System.err.println("Ticket is cancelled");
					}
					
					return;
				} 
			else 
			{
				System.out.println("Enter Your correct User Id");	
			}
		}
		
   } 
   
   public void changeDate()
   {
	   System.out.println("Enter Your User Id");
	   String uid=sc.next();
		for(int i=0;i<l.size();i++)
		{
			Account a1=(Account)l.get(i);
			if(a1.userid.equals(uid))
				{
					for(int j=0;j<l1.size();j++)
					{
					Ticket t1=(Ticket)l1.get(j);
					System.out.println("Enter new Date");
					t1.date=sc.next();
					System.out.println("Date is changed");
					}
					
					
				} 
			else 
			{
				System.out.println("Enter Your correct User Id");	
			}
		}  
	   
   } 
   
   public void showTicket()
   {
	   System.out.println(l);
	   System.out.println();
	   System.out.println("Ticket Details:");
	   System.out.println(l1);
   } 
}