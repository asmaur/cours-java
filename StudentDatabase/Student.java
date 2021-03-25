package StudentDatabase;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    private int gradeYear;
    private String courses="";
    private double balance =0;
    private double costOfCourse = 600;

    //Constructor: pedir para entrar nome do aluno e ano
    Student(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        this.firstName = input.nextLine();
        System.out.print("Enter your last name: ");
        this.lastName = input.nextLine();

        System.out.print("\n1-Freshmen\n2-Sophmore\n3-Junior\n4-Senior\nEnter student class level: ");
        this.gradeYear = input.nextInt();

        this.studentID = String.valueOf(this.gradeYear) + this.generateID();
        System.out.println("nome: "+this.firstName+ "\nSobrenome: "+this.lastName+ "\nId: "+this.studentID+"\nGrade: "+this.gradeYear);
    }


    //generate an ID
    private String generateID(){
        String alfa = "0123456789";
        String id = "";
        for(int i=0; i<5; i++){
            int rand = (int)(Math.random()*alfa.length());
            id = id + alfa.charAt(rand);
        }
        return id;
    }

    //Enroll in courses
    public void enroll(){
        
        do{
            Scanner input = new Scanner(System.in);
            System.out.print("Enter course to enroll(Q to quit): ");

            String course = input.nextLine();

            if(!course.equals("Q")){
                this.courses = this.courses + "\n" + course;
                this.balance += this.costOfCourse;
            }else{

                System.out.println("Letting system ...");
                break;
            }

        }while(true);
        System.out.println("ENROLLED IN: "+ this.courses);
        System.out.println("BALANCE: "+ this.balance);
    }

    //view balance
    private void viewBalance(){
        System.out.println("Your actual balance is: "+"$"+ this.balance);
    }


    //pay tuition
    public void payBalance(){
        viewBalance();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter payment: $");
        double amount = input.nextDouble();

        this.balance -= amount;
        System.out.println("Thanks for the payment of $"+amount);
        viewBalance();
    }

    //show status
    public String toString(){
        System.out.println("***********STUDENT INFO**************");
        return
            "Name: "+ this.firstName + " "+ this.lastName
            +"\nCourses Enrolled: "+courses+
            "\nBalance: $"+ this.balance
        ;
    }
    
}
