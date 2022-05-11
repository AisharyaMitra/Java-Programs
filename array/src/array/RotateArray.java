package array;

public class RotateArray {

	public static void main(String[] args) {
		int a[]= {5,9,2,3,8},temp=0,n=1;
		int total_length[]= new int[a.length+n];
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i = a.length-n;i<=a.length-1;i++) {
			total_length[temp++]=a[i];
		}
		 temp=n;
			for(int i=0;i<a.length-1;i++) {
				total_length[temp++]=a[i];
				System.out.println(a[i]+" "+total_length[temp]);
			}
			for(int i = 0;i<a.length;i++) {
				System.out.print(total_length[i]+" ");
			}
	}

}
