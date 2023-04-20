public class personChecker implements CheckPerson {
    @Override
    public boolean test(Person p) {
        return p.getGender() == Person.Sex.MALE;
    }
}
