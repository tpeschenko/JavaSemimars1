//В калькулятор добавьте возможность отменить последнюю операцию.

import java.util.Scanner;
public class Task11 {
    public static void main(String[] args)
    {
        double num1;
        double num2;
        double ans;
        char op = '-';
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter first numbers: ");
        num1 = reader.nextDouble();
        System.out.print("Enter second numbers: ");
        num2 = reader.nextDouble();
        int cancel = 1;
        while (cancel == 1)
        {
            System.out.print("\nEnter an operator (+, -, *, /): ");
            op = reader.next().charAt(0);
            System.out.print("Ведете 0, чтобы выполнить решение или 1 чтобы поменять знак: ");
            cancel = reader.nextInt();
        }

        switch(op)
        {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}