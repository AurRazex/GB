package Java.Lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
            System.out.print("Введите числа: ");
          try (Scanner sc = new Scanner(System.in)) {
            int a, b, c, d, e;
            System.out.println("Введите числа");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                d = sc.nextInt();
                e = sc.nextInt();
            System.out.println("Вы ввели числа: "+ a + "," + b + "," + c + "," + d + "," + e);
                int [] mas = {a, b, c, d, e};

                boolean isSorted = false;
                int buf;
                while(!isSorted) {
                    isSorted = true;
                    for (int i = 0; i < mas.length-1; i++) {
                        if(mas[i] > mas[i+1]){
                            isSorted = false;

                            buf = mas[i];
                            mas[i] = mas[i+1];
                            mas[i+1] = buf;
                        }
                    }
                }
                System.out.println("Сортировка будет такая: " + (Arrays.toString(mas).replaceAll("^\\[|\\]$", "")));
        }
    }
}