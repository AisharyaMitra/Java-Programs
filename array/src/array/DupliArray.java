package array;

public class DupliArray {

	public static void main(String[] args) {
		int arr[]= {3,2,5,3,4,5,8,2};
		int brr[]= new int[arr.length],i,j;
		brr[0]=arr[0];
		int index=1 , d=0;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(i=1;i<arr.length;i++) {
			int c=0;
			for(j=0;j<brr.length;j++) {
			if(arr[i]!=brr[j]) {
				c=1;
			}
			}
		if(c==0) {
			brr[index++]=arr[i];
			d++;
			System.out.println(arr[i]+" "+brr[index]);
		}
		}
		for(i=0;i<d+1;i++) {
			//System.out.print(brr[i]+" ");
		}
	}

}
