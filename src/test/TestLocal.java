import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestLocal {
    @Test
    public void testPersonChecker() {
        ArrayList<Person> people = new ArrayList<>();
        Person p = new Person("hello", Person.Sex.MALE, "hewwo@hewwo.com");
        people.add(new Person("whitney", Person.Sex.FEMALE, "whitney@whitney.com"));
        people.add(p);
        people.add(new Person("whatever", Person.Sex.FEMALE, "wiaofa@gmail.com"));

        String expected = p.printPerson() + "\n";

        String actual = PersonService.printPersons(people, new personChecker());

        Assert.assertEquals(expected, actual);







    }
}
