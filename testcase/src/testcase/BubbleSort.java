package testcase;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {7,4,6,2,9,3,5,1};
		int i,j,temp=0;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		for(i=0;i<arr.length-1;i++) {
			for(j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
