package Java.Lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class list {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        run();
        
    }

    public static void EvenNumbers(ArrayList<Integer> arrayList){

        ArrayList<Integer> result = new ArrayList<>(arrayList);
        for (int i =0; i < result.size(); i++) {
            if (result.get(i) %2 == 0){
                result.remove(i);
                i--;
            }
        }
        System.out.println();
        System.out.println("Список без четных чисел: ");
        System.out.println(result);
        System.out.println();
            
    }

    public static void MinNumber(ArrayList<Integer> arrayList){

        int min = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < min){
                min = arrayList.get(i);
            }
        }
        System.out.println();
        System.out.println("Минимальное значение этого списка: ");
        System.out.println(min);
        System.out.println();
    }

    public static void MaxNumber(ArrayList<Integer> arrayList){

        int max = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max){
                max = arrayList.get(i);
            }
        }
        System.out.println();
        System.out.println("Максимальное значение этого списка: ");
        System.out.println(max);
        System.out.println();
    }

    public static void MidNumber(ArrayList<Integer> arrayList){

        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        System.out.println();
        System.out.println("Среднее значение этого списка: ");
        double result = (double)sum/arrayList.size();
        System.out.println(result);
        System.out.println();
    }

    public static ArrayList<Integer> makeArrayList(){

        int size = (int) (Math.random() * 20);
        ArrayList<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < size; i++){
            randomList.add((int) (Math.random() * 1000));
        }
        return randomList;
    }

    public static boolean askForCheck(){

        System.out.println("Продолжить проверку заданий? ");
        System.out.println("1 - продолжить");
        System.out.println("2 - выход из приложения");
        System.out.println();
        boolean f1 = true;
        while (f1) {
            String text = scan.nextLine();
            switch(text){
                case "1":
                    f1 = false;
                    return true;

                case "2":
                    f1 = false;
                    return false;

                default:
                    System.out.println("Вы указали некорректный номер задачи!\nПовторите попытку ввода.");
                    break;
            }
        }
        return true;
    }

    public static void run(){

        ArrayList<Integer> arrayList = makeArrayList();

        boolean f = true;
        while(f){
            System.out.println();
            System.out.println("Дан следующий произвольный список: ");          
            System.out.println(arrayList);
            System.out.println();
            System.out.println("Введите номер задачи:");
            System.out.println("1 - Задача 1");
            System.out.println("2 - Задача 2");
            System.out.println("3 - Задача 3");
            System.out.println("4 - Задача 4");
            System.out.println("0 - Завершение работы приложения");
            System.out.println();
            String number = scan.nextLine();

            switch(number){
                case "1":
                    EvenNumbers(arrayList);
                    f = askForCheck();
                    break;

                case "2":
                    MinNumber(arrayList);
                    f = askForCheck();
                    break;

                case "3":
                    MaxNumber(arrayList);
                    f = askForCheck();    
                    break;
                
                case "4":
                    MidNumber(arrayList);
                    f = askForCheck();    
                    break;

                case "0":
                    System.out.println("Завершение работы приложения...");
                    f = false;
                    break;
                
                default:
                    System.out.println("\nВы указали некорректный номер задачи!\nПовторите попытку ввода.");
                break;

            }
        }
    }
}