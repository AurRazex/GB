package Java.Lesson1;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();
            long sumN = 0;
            long sumSqrt = 1;
            for (int i = 1; i <= n; i++) {
                sumN = sumN + i;
                sumSqrt = sumSqrt * i;
            }

            System.out.println("Сумма n чисел: " + sumN);
            System.out.println("Факториал чисел до n: " + sumSqrt);
        }
        System.out.println("Простые числа от 1 до 1000: ");
        for (int j = 2; j <= 1000; j++) {
        boolean simple = false;

        for (int i = 2; i * i <= j; i++) {
            simple = (j % i == 0);
            if (simple) {
                break;
            }
        }
        if (!simple) {
            System.out.print(j + " ");
        }
        }
    }
    
}