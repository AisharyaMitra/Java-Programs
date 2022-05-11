package testcase;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {7,4,6,2,9,3,5,1};
		int i,j,temp=0;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
