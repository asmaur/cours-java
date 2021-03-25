package SchoolManagement;

public class Student {
    /**
     * Created by asmaur.
     * this class is responsible for keeping the track of
     * students fees, grade & fees paid.
     * 
     */

    private int id;
    private String firstName;
    private String lastName;
    private int grade = 1;
    private int paidFee = 0;
    private int totalFee = 30000;
    
    /**
     * Create new student
     * @param id
     * @param firstName
     * @param lastName
     * @param grade
     */
    Student(int id, String firstName, String lastName, int grade){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }


    /**
     * Update paid fees
     * @param payment
     */
    public void updateFees(int payment){
        if(paidFee < totalFee){
            paidFee += payment;
        }else{
            System.out.println("No fee to be paid.");
        }
    }

    /**
     * view how much fee student has already paided
     */
    private void viewPaidFees(){
        System.out.println("You have paid: $"+ paidFee);
    }
    
}
