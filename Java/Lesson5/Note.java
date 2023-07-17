package Java.Lesson5;

public class Note {

    private String name;
    private String phoneNumber;
    

    public Note(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    @Override
    public String toString() {
        return name + " " + phoneNumber;
    }
    
}