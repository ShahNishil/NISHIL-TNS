package Even;
import java.util.Scanner;

public class Number {
	public static void main(String[] args){
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Number");

	    Integer userNum = myObj.nextInt();  
	    
	    for (int i = 1; i <= userNum; i++) {
	            if (i % 2 != 1) {
	                System.out.println(i);
	            }
	        }
	    }
	}
