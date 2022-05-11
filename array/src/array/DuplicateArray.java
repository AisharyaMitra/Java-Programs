package array;

public class DuplicateArray {

	public static void main(String[] args) {
		int arr[]= {25,14,10,25,29,10};
		int i,j;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		
		}
	}

}
