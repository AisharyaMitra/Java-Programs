package series;

public class Series3 {

	public static void main(String[] args) {
		int n=5,i,val=10;
		for(i=1;i<=n;i++) {
			
			
			if(i!=n) {
			System.out.print((val*i)+" "+","+" ");
			}else {
				System.out.print(val*i);
			}
		}

	}

}
