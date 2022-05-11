package series;

public class Series4 {

	public static void main(String[] args) {
		int n=6,i,c=3,sum=1;
		System.out.print("1"+" "+","+" ");
		for(i=1;i<=n;i++) {
			sum=sum+c;
			if(i!=n) {
				System.out.print(sum+" "+","+" ");
			}else {
				System.out.print(sum);
			}
			c=c+2;
		}

	}

}
