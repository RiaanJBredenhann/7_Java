package exercise;

public class chapter5Lesson2 {

    public static void main(String[] args) {     
        String[] items = {"Shirt", "Hat", "Belt", "Jacket"};
        String custName = "John";
        String message;
        
        message = custName + " wants to purchase " + items.length + " items.    "
                + custName + " wants a discount on the " + items[2];
        
        System.out.println(message);
    }
    
}
