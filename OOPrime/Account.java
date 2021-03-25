package OOPrime;

public class Account {
    private String id;
    private String name;
    private double balance = 0;


    /**
     * 
     * @param id
     * @param name
     */
    Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    /**
     * 
     * @param id
     * @param name
     * @param balance
     */
    Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public double credit(double amount){
        return balance += amount;
    }
    public double debit(double amount){
        if(amount <= balance){
            return balance -= amount;
        }else{
            System.out.println("Amount exceeded");
            return balance;
        }
    }

    public void transferTo(Account account, double amount){
        if(amount <= this.balance){
            account.balance += amount;
            balance -= amount;
            System.out.println("Transaction sucess!");
        }else{
            System.out.println("Cant make transaction.");
            System.out.println("Your atual balance is: "+ balance);
        }
    }


    public String toString(){
        System.out.println("************** INFO *********************");
        return "Account[id="+getId()+"\nName="+getName()+"\nBalance="+getBalance()+"]";    
    }


    
}
