// ***************************************************************
//   Item.java
//
//   Represents an item in a shopping cart.
// ***************************************************************
 
public class Item
{
    public String name;
    public double price;
    public int quantity;
    public Item (String itemName, double itemPrice, int numPurchased)
    {
    name = itemName;
    price = itemPrice;
    quantity = numPurchased;
    }
    public String toString ()
    {
    String output;
    output = "There are " + quantity + " " + name + " , at a cost of " + price + " per item.";
    return output;
    } 
} 