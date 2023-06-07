package Member;

public class Employee extends Member {

	private String specialization;
	
	public void printSpec() {
	    System.out.println("specialization: "+ specialization);
	  }
	
	public void setSpec(String specialization) {
	    this.specialization = specialization;
    }
	
}
