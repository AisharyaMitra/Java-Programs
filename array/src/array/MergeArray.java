package array;

public class MergeArray {

	public static void main(String[] args) {
		int arr[]= {12,54,32};
		int brr[]= {16,84,62};
		int total_length[]= new int[arr.length+brr.length];
		int i;
		int index=0;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(i=0;i<brr.length;i++) {
			System.out.print(brr[i]+" ");
		}
		for(i=0;i<arr.length;i++) {
			total_length[index++]=arr[i];
		}
		for(i=0;i<brr.length;i++) {
			total_length[index++]=brr[i];
		}
		System.out.println();
		for(i=0;i<total_length.length;i++) {
			System.out.print(total_length[i]+" ");
		}
	}

}
