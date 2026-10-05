package software.ulpgc;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public record Person(String name, LocalDate birthday) {

    public static Person of(String name, LocalDate birthday) {
        return new Person(name, birthday);
    }

    public int age() {
        return (int) ChronoUnit.YEARS.between(birthday, LocalDate.now());
    }
}