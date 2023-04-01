//Написать программу, которая найдёт и выведет повторяющиеся
//имена с количеством повторений. Отсортировать по убыванию популярности.



import java.util.HashMap;;
import java.util.LinkedList;
import java.util.Map;


public class Task12
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<>();

        list.add("Иванов Иван"); list.add("Петрова Светлана"); list.add("Белова Кристина");
        list.add("Мусина Анна"); list.add("Крутова Анна"); list.add("Юрин Иван");
        list.add("Лыков Петр"); list.add("Чернов Павел"); list.add("Чернышов Петр");
        list.add("Федорова Мария"); list.add("Светлова Марина"); list.add("Савина Мария");
        list.add("Рыкова Мария"); list.add("Лугова Марина"); list.add("Владимирова Анна");
        list.add("Мечников Иван"); list.add("Петин Петр"); list.add("Ежов Иван");

        System.out.println(repeatName(list));
        System.out.println("\n");
        sortName(repeatName(list));

    }
    public static  HashMap<String, Integer> repeatName(LinkedList<String> mylist)
    {
        HashMap<String, Integer> hush = new HashMap<>();
        for (String i: mylist)
        {
            String[] words = i.split(" ");
            if (hush.containsKey(words[1]))
            {
                hush.put(words[1], hush.get(words[1]) + 1);
            }
            else
            {
                hush.put(words[1], 1);
            }
        }
        return hush;
    }

    public static void sortName(HashMap<String, Integer> myHash)
    {

        myHash.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
