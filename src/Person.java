public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {

        return surname;
    }

    public int getAge() {
        return age;
    }

    public String setName() {
        return setName();
    }

    public String setSurname() {
        return setSurname();
    }

    public int setAge() {
        return setAge();
    }

    @Override
    public int compareTo(Person o) {

        if (age < o.age) {
            return 1;
        } else if (age > o.age) {
            return -1;
        } else {
            return surname.compareTo(o.surname);
        }
    }

    public String toString() {
        return "\n Имя: " + getName() + ". Фамилия: " + getSurname() + ". Возраст: " + getAge();
    }
}
