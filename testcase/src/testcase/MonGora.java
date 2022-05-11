package testcase;

public class MonGora {

	public static void main(String[] args) {
		 int n=34576,rev=0,r,t;
		 while(n>0) {
			 r =n%10;
			 n=n/10;
			 rev=(rev*10)+r;
		 }
//		 System.out.println(rev);
//		 System.out.println();
	n=0;
	 while(rev>0) {
		 t =rev%10;
		 rev=rev/10;
		 System.out.println(t+" ");
	 }
	 }

}
