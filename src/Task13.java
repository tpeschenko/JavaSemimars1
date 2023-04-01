//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        HashMap<String, LinkedList<Integer>> phoneNumber = new HashMap<>();

        while (true){
            System.out.print("Добавить контакт введите 1. Найти номер введитье 2\nВведите сюда: ");
            Scanner scan = new Scanner(System.in);
            int ans = scan.nextInt();
            if(ans == 1){
                addContact(phoneNumber);
            }
            else{
                System.out.println(findNumber(phoneNumber));
            }

        }


    }
    public static void addContact(HashMap<String, LinkedList<Integer>> hash)
    {
        LinkedList<Integer> numberList = new LinkedList<>();
        System.out.print("Введите фамилию контакта: ");
        Scanner scan = new Scanner(System.in);
        String contact = scan.nextLine();
        String solution = "Да";
        while (solution.equals("Да")){
            System.out.print("Введите номер контакта: ");

            int num = scan.nextInt();
            numberList.add(num);
            if(solution.equals("Да")){
                System.out.print("Нужно ли добавить ещё контакт, введите Да или Нет: ");
                Scanner scan1 = new Scanner(System.in);
                solution  = scan1.nextLine();
                System.out.println(solution);
            }
            else{
                break;
            }
        }
        hash.put(contact, numberList);

    }
    public static LinkedList<Integer> findNumber(HashMap<String, LinkedList<Integer>> hash)
    {
        System.out.print("Введите фамилию контакта чтобы получить его номер или номера: ");
        Scanner scan = new Scanner(System.in);
        String contact = scan.nextLine();

        return hash.get(contact);

    }

}