package FinalKeyword;

public class FinalDataMember {
	final String name="Nishil SHAH";//final variable  
	 
	void change(){  
		name="M-S-D";
		System.out.println("Name: "+ name);  
	 }
	
	void show() {
		System.out.println("Name: "+ name);
	}
	
	public static void main(String args[]){  
		FinalDataMember obj=new  FinalDataMember();  
		obj.show();
		obj.change();
	}  
}
