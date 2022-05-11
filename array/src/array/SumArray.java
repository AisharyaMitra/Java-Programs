package array;

public class SumArray {

	public static void main(String[] args) {
		int temp=0,b=0;
		int a1[]= {3,9,6,5};
		int a2[]= {7,3,8};
		if(a1.length>a2.length) {
			 b=a1.length;
			}
		else {
			 b= a2.length;
			}
		int a3[]= new int[b];
		
		for(int i = 0; i<a1.length;i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		for(int i = 0; i<a2.length;i++) {
			System.out.print(a2[i]+" ");
		}
		for(int i = 0; i<a3.length;i++) {
			if(i >= a1.length) {
			a3[temp++]=0+a2[i];
			} else if (i >= a2.length) {
			a3[temp++]=a1[i]+0;
			} else {
			a3[temp++]=a1[i]+a2[i];
			}
			}
		System.out.println();
		for(int i = 0; i<a3.length;i++) {
			System.out.print(a3[i]+" ");
		}
	}

}
