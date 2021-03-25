import java.util.Scanner;

public class BankAccount {

    static String custumerName;
    static double balance;
    static String custumerId;
    static double previousTransaction;

    BankAccount(String cname, String cid){
        this.custumerName = cname;
        this.custumerId = cid;
    }

    public static void deposit(double amount){
        if(amount > 0){
            balance += amount;
            previousTransaction = amount;
        }
    }

    public static void getBalance(){
        System.out.printf("Your balance is: %f", balance);
    }

    public static void getPreviousTransaction() {
        if(previousTransaction > 0){
            System.out.println("Deposit: "+previousTransaction);
        }else if (previousTransaction < 0){
            System.out.println("WithDraw: "+ previousTransaction);
        }else {
            System.out.println("No transaction.");
        }
    }
    public static void withDraw( double amount){
        balance -= amount;
        previousTransaction = -amount;
    }
    public static void showMenu(){
        int option;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome "+ custumerName);
        System.out.println("Your ID is: "+ custumerId);
        System.out.println("\n");

        System.out.println("1. Check your balance");
        System.out.println("2. Deposit");
        System.out.println("3. WithDraw");
        System.out.println("4. Previoous transaction");
        System.out.println("5. Exit");

        do {
            System.out.println("========================================================");
            System.out.print("Enter an option: ");
            System.out.println("========================================================");
            option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("========================================================");
                    getBalance();
                    System.out.println("========================================================");
                    break;
                case 2:
                    System.out.println("========================================================");
                    System.out.print("Enter an amount: ");
                    double amount = input.nextDouble();
                    deposit(amount);
                    System.out.println("========================================================");
                    break;
                case 3:
                    System.out.println("========================================================");
                    System.out.print("Enter an amount: ");
                    double witdraw = input.nextDouble();
                    withDraw(witdraw);
                    System.out.println("========================================================");
                case 4:
                    System.out.println("========================================================");
                    getPreviousTransaction();
                    System.out.println("========================================================");
                    break;
                case 5:
                    System.out.println("******************* END ********************************");
                    break;

                default:
                    System.out.println("You Enter an invalid number");
                    break;
            }
        }while (option !=5);
        System.out.println("Thanks for using our services");

    }


}
