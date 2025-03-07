import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int pre = 0;
		int cur = 0;
		int nex = 1;
		int temp=0;
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
		    System.out.println(pre);
		    temp = pre+cur+nex;
		    pre=cur;
		    cur=nex;
		    nex=temp;
		}

	}
}

