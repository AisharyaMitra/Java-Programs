package college;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Celsius = sc.nextDouble();
		double Fahrenheit;
        Fahrenheit =((Celsius*9)/5)+32;  
        System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
 

	}

}
