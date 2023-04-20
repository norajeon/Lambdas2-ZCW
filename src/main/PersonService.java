import java.util.List;

public class PersonService {
    public List<Person> people;


    public PersonService(List<Person> person) {
        this.people = person;
    }

    public static String printPersons(
            List<Person> roster, CheckPerson tester) {
        StringBuilder sb = new StringBuilder();
        for (Person p : roster) {
            if (tester.test(p)) {
                sb.append(p.printPerson()).append("\n");
            }
        }
        return sb.toString();
    }


}