package series;

public class Series16 {

	public static void main(String[] args) {
		int n= 5,temp,i,j=1;
		temp=n;
		for(i=n;i>=1;i--) {
			int r=(temp*j)-n;
			if(i!=1) {
			System.out.print(r+",");
			}else {
				System.out.print(r);
			}
			j++;
			temp=temp+j;
			n--;
		}
	}

}
