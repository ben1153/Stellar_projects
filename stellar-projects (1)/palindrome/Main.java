import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuffer s1 = new StringBuffer(s.nextLine());
		System.out.println(s1);
	  if(s1.toString().equals((s1.reverse().toString()))){
		System.out.println("it is a palindrome");
		
	}
	else{
	  System.out.println("it is not a palindrome");
	}
}
}
