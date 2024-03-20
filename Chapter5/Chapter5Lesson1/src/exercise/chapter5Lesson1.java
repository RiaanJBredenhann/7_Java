package exercise;

public class chapter5Lesson1 {

    public static void main(String[] args) {
        String custName = "John";
        String itemDesc = "Milk Carton";
        String message;
        
        double price = 23;
        double tax = 1.15;
        int quantity = 2;
        double total;
        
        boolean outOfStock = false;
        
        total = (price*quantity)*tax;

        if (quantity < 1) {
            outOfStock = true;
        }

        if (quantity > 1) {
            itemDesc = itemDesc + "s";
        }

        message = custName + " wants to purchase " + quantity + " "
                + itemDesc + " at R" + price + " per item for a total cost of "
                + total + " after tax";
        
        if (outOfStock) {
            System.out.println("Item is out of stock");
        } else {
            System.out.println(message);
        }
        
    }
    
}
