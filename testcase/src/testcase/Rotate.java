package testcase;

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        int n = sc.nextInt();
	        int c=0;
	        int r= (int)(num%(Math.pow(10,n)));
	        int temp= (int)(num/(Math.pow(10,n)));
	        while(num > 0 ){
	            num=num/10;
	            c++;
	        }
	        num = (int)(r*(Math.pow(10,c-n)))+temp;
	        System.out.println(num);

	}

}
//45789
//2
//89457