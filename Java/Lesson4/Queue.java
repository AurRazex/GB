package Java.Lesson4;

import java.util.LinkedList;
import java.util.Scanner;

public class Queue<ChooseType> {

    static Scanner input = new Scanner(System.in);

    private LinkedList<ChooseType> elements;

    public Queue(LinkedList<ChooseType> elements) {
        this.elements = elements;
    }

    public int getInt(){

        int result = 0;
        boolean flag = true;
        while(flag){
            try {
                result = Integer.parseInt(input.nextLine());
                if (result < 0 || result >= elements.size()){
                    System.out.println();
                    System.out.println("Такого индекса в данном списке нет! Ещё раз: ");
                } else {
                return result;
                }
            } catch (Exception e) {
                System.out.println();
                System.out.println("Неверный формат ввода, ещё раз: ");

            }
        }
        return result;
    }

    public void enqueue(){

        System.out.println();
        System.out.println("Введите индекс элемента для перемещения в конец очереди: ");
        int index = getInt();
        ChooseType element = elements.remove(index);
        elements.add(element);

    }

    public ChooseType dequeue(){

        return elements.removeFirst();
    }

    public ChooseType first(){

        return elements.getFirst();

    }
}