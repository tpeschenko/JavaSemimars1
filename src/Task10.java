/**
 Реализуйте очередь с помощью LinkedList со следующими методами:
 • enqueue() — помещает элемент в конец очереди,
 • dequeue() — возвращает первый элемент из очереди и удаляет его,
 • first() — возвращает первый элемент из очереди, не удаляя.
*/

import java.util.LinkedList;
import java.util.Queue;

public class Task10
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(enqueue(list, 6));

        System.out.println(dequeue(list));

        System.out.println(first(list));
        System.out.println(list);
    }
    public static Queue<Integer> enqueue(LinkedList<Integer> myNumbers, int number)
    {
        Queue<Integer> queue = new LinkedList();
        for(int i: myNumbers)
        {
            queue.add(i);
        }
        queue.add(number);

        return queue;
    }
    public static int dequeue(LinkedList<Integer> myNumbers)
    {
        int element = myNumbers.get(0);
        myNumbers.remove(0);
        return element;
    }

    public static int first(LinkedList<Integer> myNumbers)
    {
        int element = myNumbers.get(0);
        return element;
    }
}
