package StaticKeyword;

class Base{  
	   
	   static void display(){
		   System.out.println("display method of Class Base");
	   }
	   
}  

public class StaticMethod extends Base{
	
	public static void main(String[] args) {
		
		Base.display();
	
	}

}
