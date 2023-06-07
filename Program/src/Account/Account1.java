package Account;

public class Account1{
    public static void main(String[] args) {
        Account myAccount[] = new Account[5]; 
        
        myAccount[0]=new Account(5000); 
        myAccount[0].withdraw(3500); 

        
        myAccount[1]=new Account(5000); 
        myAccount[1].withdraw(500); 
        
        myAccount[2]=new Account(5000); 
        myAccount[2].withdraw(300); 
        
        double newBalance0 = myAccount[0].getBalance();
        double newBalance1 = myAccount[1].getBalance();
        double newBalance2 = myAccount[2].getBalance();

        if(newBalance0 >= 1000)
        {

            System.out.println(newBalance0);
        }
        if(newBalance1 >= 1000)
        {

            System.out.println(newBalance1);
        }      
        if(newBalance2 >= 1000)
        {

            System.out.println(newBalance2);
        }
    }
}