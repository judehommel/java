/*
   Name: Jude Hommel
   Description: This program simulates an Online Store, where you can add items to your shopping cart, change item quantities, calculate total costs, and check out.
   Self grade: 100/100
   Testimony: I have not used any online resources and all the code is done by myself otherwise I deserve to get zero credit
   Jude Hommel

   Make sure to create commnet for each method.
   Make sure to implement one class a time.
   Make sure to create the exact same output.
   */
import java.util.*;

public class OnlineStoreHommel // change this name to include your last name
{
}

class Item
{
    private double price; 
    private String itemName;

    // Constructs an Item with a price and item name
    public Item(double price, String itemName)
    {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        if (itemName == null || itemName.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        this.price = price;
        this.itemName = itemName;
    }

    // Returns the price of the item
    public double getPrice()
    {
        return price;
    }

    // Returns the name of the item
    public String getItemName() 
    {
        return itemName;
    }

    // Sets the price of the item if new price is positive 
    public boolean setItemPrice(double price) 
    {
        if (price < 0)
            return false;
        this.price = price;
        return true;
    }

    // Returns the item name and price as a String
    @Override
    public String toString() 
    {
        return String.format("Item: %s, Price: %.1f", itemName, price);
    }

    // Checks if another Item has the same item name as this item
    @Override
    public boolean equals(Object o)
    {
        if (o instanceof Item)
        {
            Item item = (Item) o;

            if (item.getItemName().equals(this.itemName))
            {
                return true;
            }
        }
        return false;
    }
}

class OnlineItem extends Item 
{
    private double shippingCost;
    private String itemId;
    private int quantity;

    // Constructs an OnlineItem given price, a name, a shipping cost, an item id, and a quantity
    public OnlineItem(double price, String itemName, double shippingCost, String itemId, int quantity) 
    {
        super(price, itemName);

        if (shippingCost < 0) {
            throw new IllegalArgumentException("Shipping Cost cannot be negative.");
        }
        if (itemId == null || itemId.isEmpty()) {
            throw new IllegalArgumentException("Item ID cannot be empty.");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }

        this.shippingCost = shippingCost;
        this.itemId = itemId;
        this.quantity = quantity;
    }

    // Returns the shipping cost of the item
    public double getShippingCost() {
        return shippingCost;
    }

    // Returns the ID of the item
    public String getItemID() {
        return itemId;
    }

    // Returns the quantity of the item
    public int getQuantity() {
        return quantity;
    }

    // Sets the shipping cost of the item if new price is positive 
    public boolean setShippingCost(double shippingCost) {
        if (shippingCost < 0)
            return false;
        this.shippingCost = shippingCost;
        return true;
    }

    // Sets the ID of the item
    public void setItemID(String itemId) {
        this.itemId = itemId;
    }

    // Sets the quantity of the item if new price is positive 
    public boolean setQuantity(int quantity) {
        if (quantity < 0)
            return false;
        this.quantity = quantity;
        return true;
    }

    // Returns a String with all the information about the online item
    @Override
    public String toString() 
    {
        return String.format("%s, Shipping Cost: %.1f, Item Id: %s, Quantity: %d", 
                super.toString(), shippingCost, itemId, quantity);
    }
}

class ShoppingCart
{
    private ArrayList<OnlineItem> items; 

    // Constructs an empty shopping cart
    public ShoppingCart() {
        this.items = new ArrayList<OnlineItem>();
    }

    // Adds an item to the shopping cart
    // If the item already exists, the quantities are combined
    public void add(String itemName, double price, double shippingCost, String itemId, int quantity) 
    {
        OnlineItem addedItem = new OnlineItem(price, itemName, shippingCost, itemId, quantity);

        for (OnlineItem item : items)
        {
            if (item.equals(addedItem))
            {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }

        items.add(addedItem);
    }

    // Returns all of the items in the shopping cart
    public ArrayList<OnlineItem> getItems()
    {
        return items;
    }

    // Removes an item from the shopping cart using its ID
    public boolean remove(String itemId) 
    {
        for (OnlineItem item : items)
        {
            if (item.getItemID().equals(itemId))
            {
                items.remove(item);
                return true;
            }
        }
        return false;
    }

    // Sets the quantity of an item using its ID
    public boolean changeQuantity(String itemId, int quantity)
    {
        for (OnlineItem item : items)
        {
            if (item.getItemID().equals(itemId))
            {
                item.setQuantity(quantity);
                return true;
            }
        }
        return false;
    }

    // Calculates the total cost of one item including shipping
    public double totalPerItem(OnlineItem item)
    {
        return (item.getPrice() * item.getQuantity()) + (item.getShippingCost() * item.getQuantity());
    }

    // Calculates and displays cart items and the total cost of the cart
    public void checkOut() 
    {
        double total = 0;
        double taxPercent = 0.2;

        System.out.println(
                "*******************************\n" + 
                "Checking out\n" + 
                "*******************************\n");

        for (OnlineItem item : items)
        {
            System.out.println(item.toString() + ", Total--------> " + totalPerItem(item));
            total += totalPerItem(item);
        }

        System.out.printf("Before Tax: %.2f", total);
        System.out.printf("Tax: %.2f", total * taxPercent);
        System.out.printf("Bill: %.2f", total * (1 + taxPercent));
    }

    // Returns a String containing the items in the cart
    @Override
    public String toString()
    {
        String formattedString = String.format(
                "-------------------------------Items in your list-------------------------%n" +
                "Your Shopping Cart%n%n");

        for (OnlineItem item : items)
        {
            formattedString = String.format(formattedString + 
                    item.toString() +
                    "---------------------------------------------------------------------%n%n");
        }

        return formattedString;
    }
}

class Driver2 //refer to the sample output
{
    // Runs the online shopping program and gets input from the user
    public static void main(String[] args)
    { 
        Scanner scanner = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart();

        System.out.println("Welcome To Online Shopping");
        System.out.println();

        boolean shouldContinue = true;
        while (shouldContinue)
        {
            System.out.print("Enter the item name, price, shipping cost, item id, item quantity: ");
            String itemName = scanner.next();
            double price = scanner.nextDouble();
            double shippingCost = scanner.nextDouble();
            String itemId = scanner.next();
            int quantity = scanner.nextInt();

            cart.add(itemName, price, shippingCost, itemId, quantity);

            String response = null;
            while (response == null || !(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("no")))
            {
                System.out.print("Do you have more items: ");
                response = scanner.next();
                if (response.equalsIgnoreCase("no"))
                {
                    shouldContinue = false;
                }
                else if (!response.equalsIgnoreCase("yes"))
                {
                    System.out.println("Unrecognized response try again");
                }
                System.out.println();
            }
        }

        shouldContinue = true;
        while (shouldContinue)
        {
            String response = null;
            while (response == null || !(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("no")))
            {
                System.out.print("Do you want to make changes to your cart: ");
                response = scanner.next();
                if (response.equalsIgnoreCase("no"))
                {
                    shouldContinue = false;
                }
                else if (!response.equalsIgnoreCase("yes"))
                {
                    System.out.println();
                    System.out.println("Unrecognized response try again");
                }
            }
            if (!shouldContinue) 
            {
                break;
            }

            System.out.println("Enter the item id and the new quantity: ");
            String itemId = scanner.next();
            int quantity = scanner.nextInt();
            cart.changeQuantity(itemId, quantity);
        }

        cart.checkOut();

        scanner.close();
    }
}

