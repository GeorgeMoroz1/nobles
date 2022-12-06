import java.util.Comparator;

public class NobleComparator implements Comparator<Person> {
    int maxWords;

    public NobleComparator(int maxWords) {
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person o1, Person o2) {

        String[] s1 = o1.getSurname().split(" ");
        String[] s2 = o2.getSurname().split(" ");

        int result = (s1.length >= 2 && s2.length >= 2) ? 0 : Integer.compare(s2.length, s1.length);

        return result == 0 ? o1.compareTo(o2) : result;
    }

}
