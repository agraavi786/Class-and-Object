package classObject;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Calculator c= new Calculator();
        c.powerInt(2, 2);
        c.powerDouble(2.3,3.3);
	}

}
class Calculator{
	void powerInt(int n1,int n2) {
		System.out.println("Poer of in t is : " +Math.pow(n1, n2));
	}
	void powerDouble(double n1,double n2) {
		System.out.println("power of double is : "+Math.pow(n1, n2));
	}

}
