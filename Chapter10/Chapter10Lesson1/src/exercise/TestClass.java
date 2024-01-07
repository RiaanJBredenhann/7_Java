/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise;

/**
 *
 * @author Riaan HP
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 4, y = 9;
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }
        System.out.println("After if stmt, x = " + x);
        
        // Use a ternary operator to perform the same logic as above.
        x = ((y / x) < 3) ? (x += y) : (x *= y);
        System.out.println("After ternary op, x = " + x);
    }
    
}
