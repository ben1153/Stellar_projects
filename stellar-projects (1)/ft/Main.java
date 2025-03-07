import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b =s.nextInt();
	int c =s.nextInt();
	int d = a + b + c;
	if( d == 180){
	    if(a==90||b==90||c==90){
	        System.out.println("prize 2");
	    }
	    else if(a!=b|| b!=c||c!=a){
	        System.out.println("prize3");
	    }
	    else if (a==b&&b==c){
	        System.out.println("prize 1");
	    }
	    
	}
	else{
	    System.out.println("no prize");
	}
	}
}
