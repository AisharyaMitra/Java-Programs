package series;

public class Series10 {

	public static void main(String[] args) {
		int n=5,i,f=1,l=2,s=0;
		for(i=1;i<=n;i++) {
			s=s+(f*l);
			if(i!=n) {
			System.out.print("("+f+"*"+l+")"+" "+"+"+" ");
			}else {
				System.out.print("("+f+"*"+l+")");
			}
			f++;l++;
		}
		System.out.println();
		System.out.println(s);

	}

}
