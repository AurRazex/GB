package Java.Lesson5;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();;

    public PhoneBook() {

    }

    public void add(Note note){

        if (phoneBook.containsKey(note.getName())){
            phoneBook.get(note.getName()).add(note.getPhoneNumber());

        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(note.getPhoneNumber());
            phoneBook.put(note.getName(), numbers);
        }
    }
   
    public ArrayList<String> getNumber(String name){

        if(phoneBook.containsKey(name)){
            return phoneBook.get(name);
        } else {
            ArrayList<String> noNameText = new ArrayList<>();
            noNameText.add("Запись с таким именем отсутствует!");
            return noNameText;
        }
        
    }
    public void get(String name){

        System.out.println();
        System.out.println("По имени " + name + " найдены следующие телефонные номера:");
        ArrayList<String> phoneNumbers = getNumber(name);
        for (String element : phoneNumbers) {
            System.out.println(element);
        }
    }
}