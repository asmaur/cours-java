package SchoolManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher emilly = new Teacher(1, "lizzy", "dasy", 500, "Biology");

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(emilly);

        Student natasha = new Student(1, "natasha", "edem", 2);

        List<Student> studentList = new ArrayList<>();

        studentList.add(natasha);


        SchoolManagement aupiais = new SchoolManagement(teacherList, studentList);

        System.out.println("has earned: $"+ aupiais.getTotalEarned());
    }
    
}
