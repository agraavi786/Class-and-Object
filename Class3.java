package classObject;

public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patient p = new patient(57000,166);
		p.patientName="Avaneet";
		System.out.println(p.patientName+"  BMI is "+p.computeBMI());
		

	}

}
class patient{
	
	
		String patientName;
		double height;
		double weight;
		
		patient(double height,double weight){
			this.height=height;
			this.weight=weight;
			
		}
		double computeBMI() {
			return weight/height*height;
		}
	
}
