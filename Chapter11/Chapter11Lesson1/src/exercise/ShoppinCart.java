/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ShoppinCart {

// import statements here:

public class ShoppingCart {
    
    public static void main(String[] args){
	// Declare a LocalDateTime object
        LocalDateTime orderDate;
        
	// Initialize the LocalDateTime object and print it.
        orderDate = LocalDateTime.now();
        System.out.println("Order date: "+ orderDate);

	// Format the object using ISO_LOCAL_DATE; Print it.
        String fDate = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Formatted order date: "+ fDate);
    }
}
    
}
