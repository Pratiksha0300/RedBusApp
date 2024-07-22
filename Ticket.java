package redbus.com;

public class Ticket
{
	String from;
	  String dest;
	  String date;
	  
			public Ticket(String from, String dest, String date) 
			{
				
				this.from = from;
				this.dest = dest;
				this.date = date;
			} 
			
			
			public String toString()
			{
				String data1="";
				data1=data1+"From: " + from +"\n" +"Destination: "+dest+ "\n "+ "Date: "+date ;
				
			    return data1;
			}
}
