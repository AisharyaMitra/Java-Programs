package series;

public class Series12 {

	public static void main(String[] args) {
		double n=6.0,i,j=3.0,s=0.0;
		System.out.print("1"+"+"+" ");
		for(i=2;i<=n;i++) {
		s=s+(1.0/j);
		if(i!=n) {
		System.out.print("1"+"/"+(int)j+"+"+" ");
		}else {
			System.out.print("1"+"/"+(int)j);
		}
		j=j+2;
		}
		System.out.println();
		System.out.println(1.0+s);
	}

}
