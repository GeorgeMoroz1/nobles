import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

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
        nobles.add(new Person("Иван", "Козлодоев-Первомайский", 15));
        nobles.add(new Person("Джек", "Досон", 17));


        Predicate<Person> predicate = s -> s.getAge() < 18;
        nobles.removeIf(predicate);
        Collections.sort(nobles, new NobleComparator(2));
        System.out.println("Список по уровню знатности:\n" + nobles);
    }
}
