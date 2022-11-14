import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            person.numberOfTickets = person.numberOfTickets - 1;
            System.out.println(person.name + " " + person.surname + " прокатился на атракционе осталось Биллетов: " + person.numberOfTickets);
            if (person.numberOfTickets > 0) {
                queue.add(person);
            }
        }

    }

    private static List<Person> generateClients() {
        return List.of(
                new Person("Сергей", "Федоров", 3),
                new Person("Кирил", "Петров", 4),
                new Person("Валерий", "Карпин", 2),
                new Person("Егор", "Титов", 1),
                new Person("Шамиль", "Тарпищев", 5)
        );
    }
}
