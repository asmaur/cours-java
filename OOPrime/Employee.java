package OOPrime;

public class Employee {
    private  int id;
    private String firstName;
    private String lastName;
    private int salary;

    Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getName(){
        return this.firstName + " "+ this.lastName;
    }

    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return this.salary*12;
    }

    public void raiseSalary(double percent){
        //double per = this.salary*(1+ (percent/100));
        this.salary = (int)(this.salary*(1+ (percent/100)));
        //System.out.println(1+(percent/100));
    }

    public String toString() {
        
        return "Employee[id="+getId()+" name="+getName()+ " salary=$"+getSalary();
    }


}
