package Java.Lesson1;

import java.util.Scanner;

public class Calculator {
   
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      try (Scanner reader = new Scanner(System.in)) {
         System.out.print("Введите два числа (после чисел нажимайте кнопку Enter): ");
         num1 = reader.nextDouble();
         num2 = reader.nextDouble();
         System.out.print("Выберите операцию (+, -, *, /)(нажмите соответствующую клавишу на клавиатуре и нажмите Enter): ");
         op = reader.next().charAt(0);
      }
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:  System.out.printf("Ошибка! Выберите корректную операцию!");
            return;
      }
      System.out.print("Результат операции: ");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
   
}