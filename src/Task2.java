//Вывести все простые числа от 1 до 1000
public class Task2 {
    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("Введите имя: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Привет, %s!", name);
//        iScanner.close();
        int number = 1000;
        for (int i = 2; i <= number ; i++) {
            int count = 0;
            for (int j = 1; j < i + 1; j++) {
                if (i % j == 0)
                {
                    count += 1;
                }
            }
            if (count == 2)
            {
                System.out.println(i);
            }
        }

    }
}
