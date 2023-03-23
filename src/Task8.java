import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(3);
        list.add(18);
        list.add(16);
        list.add(2);
        int maxNumber = Collections.max(list);
        int minNumber = Collections.min(list);
        System.out.printf("Максимальное значение: %d",maxNumber);
        System.out.println();
        System.out.printf("Минимальное значение: %d", minNumber);
        System.out.println();
        double sum = 0;
        for (int i : list) {
            sum += i;
        }
        double midleNumber = sum / list.size();
        System.out.printf("Среднее значение списка: %f", midleNumber);


    }
}
