import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestLambda {


        @Test
        public void testLambda() {
            CheckPerson check = (p) -> p.gender == Person.Sex.MALE;

            ArrayList<Person> people = new ArrayList<>();
            Person p = new Person("hello", Person.Sex.MALE, "hewwo@hewwo.com");
            people.add(new Person("whitney", Person.Sex.FEMALE, "whitney@whitney.com"));
            people.add(p);
            people.add(new Person("whatever", Person.Sex.FEMALE, "wiaofa@gmail.com"));

            String expected = p.printPerson() + "\n";

            String actual = PersonService.printPersons(people, check);

            Assert.assertEquals(expected, actual);



        }


}
