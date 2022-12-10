import java.util.Comparator;

public class NobleComparator implements Comparator<Person> {
    int maxWords;

    public NobleComparator(int maxWords) {
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person o1, Person o2) {

        String[] s1 = o1.getSurname().split("\\P{IsAlphabetic}+");
        String[] s2 = o2.getSurname().split("\\P{IsAlphabetic}+");

        int result = (s1.length >= maxWords && s2.length >= maxWords) ? 0 : Integer.compare(s2.length, s1.length);

        return result == 0 ? o1.compareTo(o2) : result;
    }

}
