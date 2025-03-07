import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  String s1 = s.nextLine();
	  int length = s1.length();
	  int mid = length/2;
	  if(length % 2 == 0 ){
	    System.out.println(s1.charAt(mid-1)+" "+s1.charAt(mid));
	  }
	  else{
	    System.out.println(s1.charAt(mid));
	  }
	}
}
