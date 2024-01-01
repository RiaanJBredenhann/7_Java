package exercise;

public class chapter4Lesson2 {

    public static void main(String[] args) {
        String custName = "John";
        String itemDesc = "Carton of Milk";
        String message;
        
        double price = 23;
        double tax = 1.15;
        int quantity = 10;
        double total;
        
        total = (price*quantity)*tax;
        
        message = custName + " wants to purchase " + quantity + " " + itemDesc 
                + " at R" + price + " per item for a total cost of " + total
                + " after tax";
        
        System.out.println(message);
        
    }
    
}
