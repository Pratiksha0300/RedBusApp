package redbus.com;

public class Account 
{
	   String accname;
	   String userid;
	   String  pass;
	   long cno;
	   
			public Account(String accname, String userid, String pass, long cno) 
			{
				
				this.accname = accname;
				this.userid = userid;
				this.pass = pass;
				this.cno = cno;
			} 
			
			public String toString()
			{
				String data="";
				data=data+"Name: " + accname +"\n" +"User Id "+userid+ "\n "+ " Contact No: "+cno ;
				
			    return data;
			}
}
