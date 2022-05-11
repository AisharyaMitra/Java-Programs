package testcase;

class Bank1{  
	float RateOfInterest(){return 0;}  
	 public final float RateOffd(){return 8.0f;}  
	}  
class HDFC1 extends Bank1{  
	float RateOfInterest(){return 5.0f;}
	 // public float RateOffd(){return 8.0f;} 
	}  
class SBI1 extends Bank1{  
	float RateOfInterest(){return 15.0f;}  
	}  
class AXIS1 extends Bank1{  
	float RateOfInterest(){return 50.0f;}  
	}  
public class Testing {
	

	public static void main(String[] args) {
		Bank1 b;  
		b=new HDFC1();  
			System.out.println("HDFC Rate of Interest: "+b.RateOfInterest());  
		
	}

}
