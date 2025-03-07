import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  String email = s.nextLine();
	  if(email.contains("com")|| email.contains("in")||email.contains("net")||email.contains("org")){ 
	    System.out.println("valid email address");
	    
	  }
	  else{
	  System.out.println("it is not a valid mail id");
	  }
	
	}
}
