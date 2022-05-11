package series;

public class Series2 {

	public static void main(String[] args) {
		int n=7,i,sum=1,c=1;
		System.out.print("1"+" "+","+" ");
		for(i=1;i<=n;i++) {
			sum=sum+c;
			if(i!=n) {
			System.out.print((sum)+" "+","+" ");
			}else {
				System.out.print(sum);
			}
			c++;
		}

	}

}
