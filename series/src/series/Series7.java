package series;
import java.util.Scanner;
public class Series7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s=0;
		//System.out.print("1"+" ");
		for(int i = 1; i<=n;i++) {
			s=1+(s*10);
			System.out.print(s+" ");
		}
	}

}
