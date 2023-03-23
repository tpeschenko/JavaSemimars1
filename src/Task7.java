import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа.

public class Task7

{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList();

        int[] Numbers = {11, 3, 14, 16, 7};
        for(int i: Numbers)
        {
            list.add(i);
        }
        for(int j = 0; j < Numbers.length; j++)
        {
            float a = (float)Numbers[j];
            if(a % 2 == 0)
            {
                list.remove(j);
            }
        }

        System.out.println(list);
    }
}

