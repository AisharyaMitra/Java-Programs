package testcase;

public class GreatestArray {

	public static void main(String[] args) {
		int arr[]= {25,14,10,34,29,17};
		int i,max,j;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				max = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=max;
			}
			}
		
		}
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Second largest is"+" "+arr[i-2]);
		System.out.println("Second smallest is"+" "+arr[1]);
			}

}
