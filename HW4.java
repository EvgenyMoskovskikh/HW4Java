import java.util.ListIterator;
import java.util.Random;
import java.util.LinkedList;
import java.util.List;

public class HW4 {

    public static void main(String[] args) {
        task3();
    }

    public static void task1() {
        /*
         * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
         * вернет “перевернутый” список.
         */
        LinkedList<Integer> listInt = new LinkedList<>();
        Random random = new Random();
        int n = random.nextInt(10, 30);
        for (int i = 0; i < n; i++) {
            listInt.add(random.nextInt(10, 30));
        }
        ListIterator<Integer> iterator = listInt.listIterator();
        System.out.println("Начальный список: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\nПеревёрнутый список: ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();
    }

    public static void task2() {
        /*
         * Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() -
         * помещает элемент в конец очереди, dequeue() - возвращает первый элемент из
         * очереди и удаляет его, first() - возвращает первый элемент из очереди, не
         * удаляя.
         */
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(10);
        myQueue.enqueue(30);
        System.out.println("Первый элемент: " + myQueue.first());
        myQueue.dequeue();
        System.out.println("Первый элемент: " + myQueue.first());
    }

    public static void task3() {
        /*
         * Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
         * Используйте итератор
         */
        List<Integer> listInt = new LinkedList<>();
        Random random = new Random();
        int n = random.nextInt(10, 50);
        for (int i = 0; i < n; i++) {
            listInt.add(random.nextInt(10, 99));
        }
        int sum = 0;
        for (Integer integer : listInt) {
            sum += integer;
        }
        System.out.println("Сумма всех элементов: " + sum);
        System.out.println("Список:" + listInt);
    }
}