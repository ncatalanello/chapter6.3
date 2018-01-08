// ***************************************************************

//   Shop.java

//

//   Uses the Item class to create items and add them to a shopping

//   cart stored in an ArrayList.

// ***************************************************************
import java.util.ArrayList;
import java.util.Scanner;
public class Shop

{
    public static void main (String[] args)

    {
        ArrayList<Item> cart = new ArrayList<Item>();     
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);     
        String keepShopping = "y";
        while (keepShopping.equals("y")) 
            {
                System.out.print ("Enter the name of the item: ");
                itemName = scan.next();
                System.out.print ("Enter the unit price: ");
                itemPrice = scan.nextDouble();
                System.out.print ("Enter the quantity: ");
                quantity = scan.nextInt();
            // *** create a new item and add it to the cart
            Item tempItem = new Item(itemName, itemPrice, quantity);
            cart.add(tempItem);
            // *** print the contents of the cart object using println
            System.out.println("Your cart contains: ");
            for(int i = 0; i < cart.size(); i++) {
                   System.out.println(cart.get(i));
            }
            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.next();
            }


        checkOut(cart);

   }


   public static void checkOut(ArrayList<Item> yourCart) {        
        //You do NOT need a getter method (think about public instance variables)
        Scanner scan = new Scanner(System.in);
        System.out.println("take out items? ");
        String answer = scan.next();
        while (!answer.equals("n")) {
            for(int i = 0; i < yourCart.size(); i++) {
                   System.out.println("Remove this item (y/n)? " + yourCart.get(i).name);
                   String remove = scan.next();
                   if (remove.equals("y")) yourCart.remove(i);
                   System.out.println("Continue removing items? (y/n)");
                   answer = scan.next();
                   if (answer.equals("y")) break;
            }
        }
        //Print the contents of the cart (you may use the toString() method
        //Ask the user if they would like to remove an item.  If yes, remove that item.
        int totalItems = 0;
        double totalPrice = 0.0;
        for(int i = 0; i < yourCart.size(); i++) {
              totalItems += yourCart.get(i).quantity;
              totalPrice += yourCart.get(i).price;
        }
        //Print final total of items and final price (total)
        System.out.println("Your cart contains: " + yourCart);
        System.out.println("You have " + totalItems + " total items in your cart at a cost of " + totalPrice);
    }
}

