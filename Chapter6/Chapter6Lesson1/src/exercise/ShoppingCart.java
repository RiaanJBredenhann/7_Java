package exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();
        
        item1.descr = "Green";
        item2.descr = "Red";
        
        System.out.println(item1.descr + " " + item2.descr);
        
        item1 = item2;
        
        System.out.println(item1.descr + " " + item2.descr);
    }
    
}
