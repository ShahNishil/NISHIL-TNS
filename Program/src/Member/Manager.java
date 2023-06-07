package Member;

public class Manager extends Employee {
	private String dept; 
	
	public void printDept() {
	    System.out.println("Department: "+ dept);
	  }
	
	public void setDept(String dept) {
	    this.dept = dept;
    } 
	
	public static void main(String[] args) {
		Manager ma = new Manager();
		
		ma.setDept("IT");
		ma.setSpec("DBMS");
		ma.setData("Nishil", 21, "9876567423", "Maninagar", 50000);
		
		ma.printData();
		ma.printSpec();
		ma.printDept();
		
	}

}
