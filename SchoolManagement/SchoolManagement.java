package SchoolManagement;

import java.util.List;

public class SchoolManagement {

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalEarned = 0;
    private int totalSpent = 0;

    public SchoolManagement(List<Teacher> teachers, List<Student> students ){
        this.teachers = teachers;
        this.students = students;

    }

    public List<Teacher> getTeachers(){
        return teachers;
    }

    public void addTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }

    public List<Student> getStudents(){
        return students;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public int getTotalEarned(){
        return this.totalEarned;
    }
    public void setTotalEarned(int money){
        this.totalEarned += money;
    }

    public int getTotalSpent(){
        return totalSpent;
    }

    public void updateSpent( int money){
        this.totalSpent += money;
        this.totalEarned -= money;
    }

    
}
