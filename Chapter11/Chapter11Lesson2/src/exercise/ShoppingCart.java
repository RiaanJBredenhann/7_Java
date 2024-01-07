/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise;

/**
 *
 * @author Riaan HP
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        int age;

        // Parse the args array to populate name and age.  
	// Print an error message if fewer than 2 args are passed in.
        if (args.length < 2) {
                System.out.println("Invalid arg list.  There must be 2 arguments");
        } else {
                name = args[0];
                age = Integer.parseInt(args[1]);
                System.out.println("Name = "+name+", Age = "+age);
        }
    }
    
}
