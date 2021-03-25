import java.util.Scanner;


public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String alternateEmail;
    private String password;
    final String company="wanubit.com";
    private int capacity = 500;
    String email;
    int leng;


    Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //pedir departamento.
        this.department = setDepartment();
        //generate password
        this.password = generatePassword();

        //generate email
        this.email = generateEmail();


    }

    private String setDepartment(){
        Scanner input = new Scanner(System.in);
        System.out.print("Menu:\n 1 - for sales\n 2 - for Developement\n 3 - Accounting\n 0 for none\n");
        System.out.print("Choose your department: ");
        
        int option = input.nextInt();

        if(option ==1){
            return "sales";
        }else if(option==2){
            return "dev";
        }else if(option==3){
            return "acc";
        }else{
            return "";
        }

    }

    public void changePassword(String password){
        this.password = password;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity(){
        return this.capacity;    
    }
    public void setAlternateEmail(String email){
        this.alternateEmail = email;
    }

    public String getAlternateEmail(){
        return this.alternateEmail;
    }

    private String generateEmail(){
        if(this.department != ""){
            return this.firstName.toLowerCase()+ "." + this.lastName.toLowerCase() + "@"+ this.department+"."+this.company;
        }else{
            return this.firstName+ "." + this.lastName + "@"+ "."+this.company;
        }
    }
    private String generatePassword(){
        String alfa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*()_~";
        String password = "";
        for(int i=0; i<10; i++){
            int rand = (int)(Math.random()*alfa.length());
            password = password + alfa.charAt(rand);
        }
        return password;
    }

    public void display(){
        System.out.println("Welcome "+ this.firstName + " " + this.lastName);
        System.out.println("Your company email is: "+ this.email);
        System.out.println("Your alternate email is: "+ this.alternateEmail);
        System.out.println("Your mailbox capacity is: "+ this.capacity + "Mb");
        System.out.println("***************** END ******************");
        //System.out.println(this.email);
    }
}
