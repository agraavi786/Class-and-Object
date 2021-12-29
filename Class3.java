//Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
//Name of the class - Patient
//Member Variables - patientName(String),height(double),width(double)
//Member Function - double computeBMI()
//The above method should compute the BMI and return the result.
//The formula for computation of BMI is weight (in kg) ÷ height*height(in metres).
//Create an object of the Patient class and check the results.





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
