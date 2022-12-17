package module1;
import java.awt.*;
public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(
                1,
                "Mohan Rawat",
                "9863789525",
                68.4
        );
        Student s2 = new Student(
                2,
                "opendra Thapa",
                "9861882726",
                98
        );
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        Student higher = (s1.getPercentage() > s2.getPercentage()) ? s1 : s2;
        System.out.println(higher.toString());
        System.out.printf(
                higher.getName(),
                higher.getPercentage()
        );
    }
}
