package Java.Lesson6;

import java.util.HashSet;

public class animal {
    
    public static void main(String[] args) {
        
        task();
    }
    public static void task(){

        Cat cat1 = new Cat("Барсик", 2, "рыжий", true);
        Cat cat2 = new Cat("Мурзик", 3, "черный", true);
        Cat cat3 = new Cat("Маруся", 1, "серый", false);
        Cat cat4 = new Cat("Барсик", 2, "рыжий", true);
        Cat cat5 = new Cat("Мурзик", 3, "черный", true);

        HashSet<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        System.out.println(cats);
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(cat4));
    }
}