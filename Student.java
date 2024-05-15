import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student  extends StudentDetails{
    String name, dob;

    public void displayName(String name) {
        System.out.println(name);
    }

    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println(age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        StudentDetails s2=new StudentDetails();
        s1.displayAge("03-02-2003");
        s1.displayName("Halzz");
        s2.displayStudentMarks();
    }
}
