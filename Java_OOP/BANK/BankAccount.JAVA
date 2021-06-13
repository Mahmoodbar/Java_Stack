import java.util.Random;

public class BankAccount{
    static int AccountNumber=0 ;
    private int balance ;
    private  int numberOfAccounts = 0;
    
    Random r = new Random();

    public  BankAccount (){

        AccountNumber++;
        numberOfAccounts = 1000000000 + r.nextInt(100000000-0);
        
    }
    public int BankAccount (){
        return balance;
    }

    public void setBalance(int deposite){
        balance += deposite;
    }
    
    public void balanceSet (int withdraw){
        balance -= withdraw;
    }

        
    public static void main(String[] args){ 
        BankAccount ahmad = new BankAccount();
        ahmad.setBalance(500);
        System.out.println("ahmad bank account:"+ahmad.BankAccount());
        System.out.println("ahmad bank account number:"+ahmad.numberOfAccounts);
        System.out.println("ahmad accountnumber:"+ahmad.AccountNumber);
        BankAccount samer = new BankAccount();
        System.out.println("samer bank account:"+samer.BankAccount());
        System.out.println("samer bank account number:"+samer.numberOfAccounts);
        System.out.println("samer accountnumber:"+samer.AccountNumber);
        BankAccount tamer = new BankAccount();
        System.out.println("tamer accountnumber:"+tamer.AccountNumber);
         
        
      
    }
}