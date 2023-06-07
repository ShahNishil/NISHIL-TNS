package FinalKeyword;

class Base{  
	   void show(){
		   System.out.println("Show method of Class Base");
	   }  
	
	   final void display(){
		   System.out.println("display method of Class Base");
	   }
}  

public class FinalMethod extends Base{
		void show(){
			   System.out.println("Show method of Class FinalMethod");
		   }
	
	/**
		void display(){
			   System.out.println("display method of Class FinalMethod");
		   }
	**/
	
	public static void main(String[] args) {
		FinalMethod obj = new FinalMethod();
		obj.show();
		obj.display();
	}

}
