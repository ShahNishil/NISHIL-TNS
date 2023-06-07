package Tostring;

public class Sample extends Base {
	  private String name,rollno; 

	  // Getter
	  public String getName() {
	    return name;
	  }
	  public String getRollNo() {
		    return rollno;
	  }
	  
	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }	    

	  public void setRollNo(String roll) {
	    this.rollno = roll;
	  }	    
	  
	  @Override
	  public String toString() {
		  return ("name:" + getName() +"  roll no: "+ getRollNo()+ " mobile: " +getMobile());
	  }
	  
      public static void main(String[] args)
      {
	    	Sample sa = new Sample();
	    	sa.setName("Nishil");
	    	sa.setRollNo("46");
	    	sa.setMobile("654637272");
	        System.out.println(sa);
      }
}

