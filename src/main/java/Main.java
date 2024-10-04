import interfaces.StudentDAO;
import models.Student;

public class Main {
    public static void main(String[] args) {
        StudentDAO daoStudent = new StudentDAO();
        Student s1 = new Student();
        s1.setId(12345L);
        s1.setName("Kendrick Barrios");
        s1.setMajor("Ingenieria en sistemas");
        daoStudent.save(s1);
        Student s2 = new Student();
        s2.setId(23456L);
        s2.setName("Jose Davila");
        s2.setMajor("Ingenieria en sistemas");
        //daoStudent.save(s2);

        daoStudent.getStudents();

    }
}
