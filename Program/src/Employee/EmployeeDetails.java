package Employee;

class EmployeeDetails
{
	public static void main(String args[])
	{
		 System.out.println("Name" +   "  Year of Joining     " + "Address" );
		 Employee e=new Employee("Sam", 2000, "68D-WallsStreet");
		 e.Sam();
		 Employee e1=new Employee("Robert", 1994, "64C-WallsStreet");
		 e1.Robert();
		 Employee e2=new Employee("John", 2002, "70F-WallsStreet");
		 e2.Sam();
	}
}