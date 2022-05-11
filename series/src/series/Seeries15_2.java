package series;
import java.util.Scanner;
public class Seeries15_2 {

	public static void main(String[] args) {
	
		        Scanner sc= new Scanner(System.in);
		        int a=sc.nextInt();
		        int n=sc.nextInt();
		       double sum=1; 
		       int start=1;
		       System.out.print(1);
		        for(int i=2;i<=n;i++)
		        {double res= Math.pow(i,i)/Math.pow(a,start);

		        if(i%2==0)
		        {
		        sum=sum-res;
		        System.out.print(" - "+i+"^"+i+"/"+a+"^"+start);
		        }
		        else
		        {
		        sum=sum+res;
		System.out.print(" + "+i+"^"+i+"/"+a+"^"+start);
		        }

		start++;
		        } 
		        System.out.println();
		        System.out.println("  sum is:"+sum);
		     }
		

	}


