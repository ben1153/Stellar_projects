import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int a[][] = new int[n][n];
		for (int i=0;i<n;i++)
		{
		    for (int j =0;j<n;j++){
		        a[i][j]=s.nextInt();
		    }
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(a[i][j]);
		    }System.out.println();
		}
			
	}	
}
