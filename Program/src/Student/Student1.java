package Student;
import java.util.Scanner;

class Student1 {
    private String name;
    private int id;
    private int age;
    private String mobileNo;
    
    public void getData() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        name = sc.nextLine();
        
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        
        System.out.print("Enter age: ");
        age = sc.nextInt();
        
        System.out.print("Enter mobile number: ");
        mobileNo = sc.next();
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Mobile number: " + mobileNo);
    }
}


