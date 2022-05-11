package series;

public class Series14 {

	public static void main(String[] args) {
		int n=5,i,j=5;
		for(i=1;i<=n;i++) {
			if(i!=n) {
			System.out.print((j*j)-1+",");
			}else {
				System.out.print((j*j)-1);
			}
			j=j+5;
		}
	}

}
