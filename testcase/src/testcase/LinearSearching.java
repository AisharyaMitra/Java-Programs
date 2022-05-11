package testcase;

public class LinearSearching {

	public static void main(String[] args) {
		int[] arr = {7,4,6,2,9,3,5,1};
		int i,search=9;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println(arr[i]+" at index"+ " "+ (i+1) );
			}
		}
	}

}
