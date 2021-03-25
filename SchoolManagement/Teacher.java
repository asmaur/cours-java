package SchoolManagement;

public class Teacher {

    /**
     * keeping track on teachers
     */

    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    private String course = "";


    public Teacher(int id, String firstName, String lastName, int salary, String course){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.course = course;
    }

    public int getId() {
        return id;
        
    }
    public int getSalary(){
        return salary;
    }
    public String getFullName(){
        return this.firstName + " "+ this.lastName;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

}
