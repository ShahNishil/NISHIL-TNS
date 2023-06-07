package Demo;

public class Employee{

	private String specialization;
	
	public void printSpec() {
	    System.out.println("specialization: "+ specialization);
	  }
	
	public void setSpec(String specialization) {
	    this.specialization = specialization;
    }
	
}

public class child extends Employee{

	public static void main(String[] args) {

		child ch= new child();
		ch.setSpec("hihi");
		ch.printSpec();
		
	}

}
