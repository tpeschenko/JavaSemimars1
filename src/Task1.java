public class Task1 {
    public static void main(String[] args) {

//        Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

        int number = 3;
        int triangleNumber = 0;
        int count = 0;
        while (count <= number)
        {
            triangleNumber += count;

            count += 1;
        }

        System.out.printf("Треугольное число: %d = %d\n", number, triangleNumber);

        number = 4;
        int myNumber = 1;
        count = 1;

        while (count < number)
        {

            count += 1;
            myNumber *= count;
        }

        System.out.printf("Произведение чисел от 1 до %d = %d\n", number, myNumber);
    }
}