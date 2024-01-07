/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise;

import java.util.ArrayList;

public class ShoppingCart {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Shirt");
        items.add("WristBand");
        items.add("Pants");

        System.out.println(items);
        items.add(2, "Belt");
        System.out.println(items);

         // Check for the existence of a particular String element.  
         // Remove it, if it exists.
         if (items.contains ("Shirt")){
           items.remove("Shirt");
         }
         System.out.println(items);
    }
}