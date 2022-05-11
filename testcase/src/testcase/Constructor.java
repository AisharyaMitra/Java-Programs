package testcase;

public class Constructor {
	int d,e;
	Constructor(){
		System.out.println("Normal Constructor");
	}
	Constructor(int a,int b){
		 d=a;
		 e=b;
	}
	Constructor(Constructor c){
		 d=c.d;
		 e=c.e;
	}
	public void show() {
		System.out.println(d+ " "+e);
	}

	public static void main(String[] args) {
		Constructor c1=new Constructor();
//		Constructor c2=new Constructor(2,4);
//		Constructor c3=new Constructor(c2);
//		c2.show();
//		c3.show();
	}

}
