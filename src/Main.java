import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> nobles = new ArrayList<>();
        nobles.add(new Person("Юрий", "Морозов", 32));
        nobles.add(new Person("Шарль Ожье", "де Батс Кастельмор д'Артаньян", 60));
        nobles.add(new Person("Арман Жан", "дю Плесси Ришельё", 57));
        nobles.add(new Person("Михаил", "Голенищев-Кутузов", 67));
        nobles.add(new Person("Остап", "Бендер-Задунайский", 30));
        nobles.add(new Person("Григорий", "Потёмкин-Таврический", 52));
        nobles.add(new Person("Николай", "Миклухо-Маклай", 41));
        nobles.add(new Person("Николай", "Римский-Корсаков", 64));

        nobles.sort((o1, o2) -> {
                    String[] s1 = o1.getSurname().split("\\P{IsAlphabetic}+");
                    String[] s2 = o2.getSurname().split("\\P{IsAlphabetic}+");
                    int result = (s1.length >= 2 && s2.length >= 2) ? 0 : Integer.compare(s2.length, s1.length);
                    return result == 0 ? o1.compareTo(o2) : result;
                }
        );
        System.out.println("Список по уровню знатности:\n" + nobles);
    }
}