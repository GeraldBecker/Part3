package q3;

import java.text.NumberFormat;

/**
 * <p> Represents an item in a shopping cart. It contains the name
 * of the product, price per unit and quantity.
 * </p>
 *
 * @author Gerald Becker A00900309 1A
 * @version 1.0
 */
public class Item {
    /**
     * Name of the item.
     */
    private String name;
    
    /**
     * Price of the item per unit.
     */
    private double price;
    
    /**
     * Quantity of items.
     */
    private int quantity;
    
   
   /**
    * Create a new item with the given attributes.
    * @param itemName Sets the name of the item in the cart.
    * @param itemPrice Sets the price of the item.
    * @param numPurchased Sets the quantity of the item.
    */
    public Item(String itemName, double itemPrice, int numPurchased) {
        name = itemName;
        price = itemPrice;
        quantity = numPurchased;
    }
    
    /**
     * Return a string with the information about the item.
     * @return The formatted string with item name, price and quantity.
     */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t"
                + fmt.format(price * quantity));
    }
    
    /**
     * Returns the unit price of the item.
     * @return The price of the item.
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Returns the name of the item.
     * @return The name of the item.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the quantity of the item.
     * @return the quantity of items.
     */
    public int getQuantity() {
        return quantity; 
    }
}
