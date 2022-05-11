package testcase;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {4,8,12,24,56,78,90,98};
		int i,lb=0,ub=(arr.length-1),search=90;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		while(lb!=ub) {
			int mid=(lb+ub)/2;
			if(arr[mid]==search) {
				System.out.println(mid+1);
				break;
			}
			if(arr[mid]<search) {
				lb=mid+1;
				
				
			}
			if(arr[mid]>search) {
				ub=mid-1;
			
				
			}
		}
		

	}

}
