//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import java.util.LinkedList;
public class Task9
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(turnOverList(list));
    }

    public static LinkedList<Integer> turnOverList(LinkedList<Integer> myNumbers) {
        int count = 0;
        while (count < myNumbers.size() - 1)
        {
            myNumbers.add(count, myNumbers.remove(myNumbers.size() - 1));
            count += 1;
        }
        return myNumbers;

    }

}


