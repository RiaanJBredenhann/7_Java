package exercise;

public class chapter5Lesson3 {

    public static void main(String[] args) {
        String[] items = {"Shirt", "Shoes", "Jacket", "Hat", "Belt", "Sweater"};
        String message = "Items purchaced: ";
        
        for (String item : items) {
            message = message + item + " ";
        }
        
        System.out.println(message);
    }
    
}
