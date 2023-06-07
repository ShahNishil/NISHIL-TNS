package StaticKeyword;

public class StaticDataMember {
	static int count=0;//static variable  
	 
	void inc(){  
		count++;
	}
	
	void show() {
		System.out.println("Count: "+ count);
	}
	
	public static void main(String args[]){  
		StaticDataMember c1=new  StaticDataMember(); 
		StaticDataMember c2=new  StaticDataMember();  
		
		c1.inc();
		c1.show();
		
		c2.inc();
		
		c1.show();
		
		
	}  
}
