package classObject;




public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box sc= new Box(12.2,23.3,43.3);
		//System.out.println(sc.Volume());
		//sc.Volume(12.3, 123.4, 12.3);
		sc.Volume();
		

	}
	

}
class Box {
	double width;
	double height;
	double depth;
	
	Box(double width,double height,double depth){
		this.depth=depth;
		this.height=height;
		this.width=width;
	}
	
	void Volume(){
		double v=width*height*depth;
		System.out.println("Valume of box is:"+v);
		
		
	}
	
}


