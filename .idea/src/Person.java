import java.time.LocalDate;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    int age;

    public Person(String name, LocalDate birthday, Sex gen, String emailAddress, int age) {
        this.name = name;
        this.birthday = birthday;
        gender = gen;
        this.emailAddress = emailAddress;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void printPerson() {
        // ...
    }
}