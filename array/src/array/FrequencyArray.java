package array;

public class FrequencyArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,2,2,1,3,1,2,5,6};
		int b[]= new int[a.length];
		int i,j;
		int index = 0;
			for(i = 0 ; i< a.length; i++) {
				boolean flag = false;
				int count = 1;
					for(j = 0 ; j< b.length; j++) {
						if(a[i] == b[j]) {
							flag = true;
							break;
						}
					}
				if(flag == false) {
					for(j = i+1 ; j< a.length; j++) {
						if(a[i] == a[j]) {
							count++;
						}
					}
					b[index++] = a[i];
					System.out.println(a[i]+" "+"occurs"+" "+count+" "+"times");
				}
		}
	}
}
