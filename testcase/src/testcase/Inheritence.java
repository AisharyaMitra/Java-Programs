package testcase;


	class Bank{  
			float RateOfInterest(){return 0;}  
			}  
	class HDFC extends Bank{  
			float RateOfInterest(){return 5.0f;}  
			}  
	class SBI extends Bank{  
			float RateOfInterest(){return 15.0f;}  
			}  
	class AXIS extends Bank{  
			float RateOfInterest(){return 50.0f;}  
			}  
	public class Inheritence { 
		public static void main(String args[]){  
			Bank b;  
				b=new HDFC();  
					System.out.println("HDFC Rate of Interest: "+b.RateOfInterest());  
//				b=new SBI();  
//					System.out.println("SBI Rate of Interest: "+b.RateOfInterest());  
//				b=new AXIS();  
//					System.out.println("AXIS Rate of Interest: "+b.RateOfInterest());  
		}
}  