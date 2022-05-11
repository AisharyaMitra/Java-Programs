package array;
import java.util.Scanner;

public class DeleteDuplicate {
//	public static void main(String[] args) {
//		int arr[]= {25,14,10,25,29,10,56,89,65,56};
//		int i,j,temp,c=0,max;
//		for(i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//		for(i=0;i<arr.length;i++) {
//			for(j=i+1;j<arr.length-1;j++) {
//				if(arr[i]==arr[j]) {
//					arr[i]=arr[j];
//					arr[j]=arr[j+1];
//					c++;
//				}
//			}
//		}
//			for(i=0;i<arr.length-c;i++) {
//				System.out.print(arr[i]+" ");
//			}
//	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,2,4,4,1,5,6};
        int j=0;

       removeEleFun(arr);
    }


    public static void removeEleFun(int[] arr){
        int j=0;
        bSort(arr);
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i] != arr[i+1]){
                arr[j] = arr[i];
                j++;
            }

        }
        arr[j] = arr[arr.length-1];
        for (int i = 0; i <= j; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void swap( int[] nums , int i , int j ) {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
    public static void bSort(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length -1; i++) {
            swapped=false;
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j+1]<nums[j]){
                    swap(nums,j+1,j);
                    swapped=true;
                }

            }
            if (!swapped)break;
        }

    }
}
