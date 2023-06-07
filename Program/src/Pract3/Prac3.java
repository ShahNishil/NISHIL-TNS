package Pract3;
import java.util.Scanner;

public class Prac3 {
	public static void main(String[] args){
		
		Scanner inp = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter 3 Number");

	    Integer inp1 = inp.nextInt();  
	    Integer inp2 = inp.nextInt();  
	    Integer inp3 = inp.nextInt();  
	    Integer sum = inp1+inp2+inp3;
	    
	    Integer avg = sum/3;
	    System.out.println("Addition" + sum);
	    System.out.println("Average" + avg);
	    
	    if(avg>90) {
		    System.out.println("Grade A");
	    }
	    else if(avg>80 && avg<90 ){

		    System.out.println("Grade B");
	    }
	    else if(avg>70 && avg<80 ){

		    System.out.println("Grade C");
	    }
	    else {

		    System.out.println("Grade D");
	    } 

	}
}
