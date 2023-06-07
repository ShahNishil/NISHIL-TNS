package Member;

public class Member {
	private String name; 
	private Integer age; 
	private String phone; 
	private String address;
	private Integer salary;
	
	public void printData() {
	    System.out.println("Name: "+ name + " Age: "+ age + " Phone: "+ phone + " Address: "+ address + " Salary: "+ salary);
	  }
	
	public void setData(String name, Integer age, String phone, String address, Integer salary) {
	    this.name = name;
	    this.age = age;
	    this.phone = phone;
	    this.address = address;
	    this.salary = salary;
  }	
	
	
}
