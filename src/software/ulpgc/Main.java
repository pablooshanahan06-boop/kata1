package software.ulpgc;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p = Person.of("Pablo", LocalDate.of(2006, 12, 23));
        System.out.println(p.name() + " tiene " + p.age() + " años.");
    }
}