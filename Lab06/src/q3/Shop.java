package q3;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;

/**
 * <p> Uses the Item class to create items and add them to a shopping
 * cart stored in an ArrayList. Prints out the contents and calculates
 * the total value of the cart.
 * </p>
 *
 * @author Gerald Becker A00900309 1A
 * @version 1.0
 */
public class Shop {
    /**
     * Creates a shopping cart with items and prints results.
     * @param args not used
     */
    public static void main(String[] args) {
        Item item; // item that will be placed in the cart
        String itemName;
        double itemPrice;
        double cartTotal; // total value of the shopping cart
        int quantity;
        int index;
        
        ArrayList<Item> cart = new ArrayList<Item>();
        
        Scanner scan = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        String keepShopping = "y";
        do {
            System.out.print("Enter the name of the item: ");
            itemName = scan.next();
            System.out.print("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print("Enter the quantity: ");
            quantity = scan.nextInt();
            
            //*** create a new item and add it to the cart
            item = new Item(itemName, itemPrice, quantity);
            cart.add(item);
            
            //*** print the contents of the cart object using println
            // System.out.println(cart.toString()); <- previous print statement
            index = 0;
            cartTotal = 0;
            System.out.println("=================================\n\t **Cart "
                    + "Contents**");
            
            //print out each individual cart item and add the value to cartTotal
            while (index < cart.size()) {
                System.out.println(cart.get(index).toString());
                cartTotal += (cart.get(index).getPrice() 
                        * cart.get(index).getQuantity());
                index++;
            }
            System.out.println("\t\t\t---------\nCart Total:\t\t" 
                    + fmt.format(cartTotal));
            
            System.out.print("\nContinue shopping (y/n)? ");
            keepShopping = scan.next();
        }
        while (keepShopping.equals("y"));
        
        // close the scanner as it is no longer required
        scan.close();
    }
}
