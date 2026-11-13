import java.util.*;
/*

MUST COMPLETE THE COMMENTS BELOW
Name: Jude Hommel
Description: A program to compare, filter, view, and change a list of real estate properties
Date: 10-25-2026
Self grade: self grade without an explanation will get 0/5
95/100 
I think I deserve a 95/100 because I didn't utilize Redfin.toString() to print the houses, but this is because the type returned by search() is 
ArrayList<Property> instead of type Redfin, so I didn't think it made much sense to try to use Redfin.toString(). Instead I just made a helper function in main
testimony: I have written the code by myself and did not use unauthorized resourse. 

  
 
 

I am aware that If the instructor finds that the submitted code is from previos semester, I will get zero points for it.Name Jude Hommel

DO NOT DELETE ANY OF THE GIVEN COMMENTS
*/
import java.util.Scanner;
 
public class RedfinHommel // must change this name to include your last name
{
    // no code here
}
/* Must List all the attributes for a valid address*/ 
class Address implements Comparable<Object>
{
    private String country;
    private String state;
    private String city;
    private String zip;
    private int streetNumber;
    private String streetName;
    private String unit;
    
    public Address(String country, String state, String city, String zip, int streetNumber, String streetName, String unit) 
    {
        this.country = country;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.unit = unit;
    }

    public Address(String country, String state, String city, String zip, int streetNumber, String streetName) 
    {
        this.country = country;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.unit = null;
    }

    public String getCountry() 
    {
        return country;
    }

    public String getState() 
    {
        return state;
    }

    public String getCity() 
    {
        return city;
    }

    public String getZip() 
    {
        return zip;
    }

    public int getStreetNumber() 
    {
        return streetNumber;
    }

    public String getStreetName() 
    {
        return streetName;
    }

    public String getUnit() 
    {
        return unit;
    }

    public void setCountry(String country) 
    {
        this.country = country;
    }

    public void setState(String state) 
    {
        this.state = state;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public void setZip(String zip) 
    {
        this.zip = zip;
    }

    public void setStreetNumber(int streetNumber) 
    {
        this.streetNumber = streetNumber;
    }

    public void setStreetName(String streetName) 
    {
        this.streetName = streetName;
    }

    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    @Override
    public int compareTo(Object obj) 
    {
        Address other = (Address) obj;
        return this.toString().compareTo(other.toString());
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;

        if (obj == null || !(obj instanceof Address))
            return false;

        Address other = (Address) obj;

        if (country == null)
            return other.country == null;
        if (!country.equals(other.country))
            return false;

        if (state == null)
            return other.state == null;
        if (!state.equals(other.state))
            return false;

        if (city == null)
            return other.city == null;
        if (!city.equals(other.city))
            return false;

        if (zip == null)
            return other.zip == null;
        if (!zip.equals(other.zip))
            return false;

        if (unit == null)
            return other.unit == null;
        if (!unit.equals(other.unit))
            return false;

        if (streetNumber != other.streetNumber)
            return false;

        if (streetName == null)
            return other.streetName == null;
        if (!streetName.equals(other.streetName))
            return false;

        return true;
    }

    @Override
    public String toString()
    {
        if (unit == null) 
        {
            return streetNumber + " " + streetName + "\n" + city + ", " + state + " " + zip + "\n" + country;
        }
        return streetNumber + " " + streetName + ", " + unit + "\n" + city + ", " + state + " " + zip + "\n" + country;
    }
}
//must vhange the line below to : class property implements Comparable 
class Property implements Comparable<Object>
{
    //instance varibales
    private int rooms;
    private int baths;
    private double sf;
    private Address address;
    private double price;
    private boolean isAvaiable;
    private double lotSize;
    private int yearBuilt;

    //constructor:  
    public Property(int rooms, int baths, double sf, Address address, double price, boolean isAvaiable, double lotSize, int yearBuilt) 
    {
        this.rooms = rooms;
        this.baths = baths;
        this.sf = sf;
        this.address = address;
        this.price = price;
        this.isAvaiable = isAvaiable;
        this.lotSize = lotSize;
        this.yearBuilt = yearBuilt;
    }

    //getter methods
	public int getRooms() 
    {
		return rooms;
	}
    public int getBaths() 
    {
		return baths;
	}
	public double getSf() 
    {
		return sf;
	}
	public Address getAddress() 
    {
		return address;
	}
	public double getPrice() 
    {
		return price;
	}
	public boolean isAvaiable() 
    {
		return isAvaiable;
	}
	public double getLotSize() 
    {
		return lotSize;
	}
	public int getYearBuilt() 
    {
		return yearBuilt;
	}

    //setter methods
	public void setRooms(int rooms) 
    {
		this.rooms = rooms;
	}
	public void setBaths(int baths) 
    {
		this.baths = baths;
	}
	public void setSf(double sf) 
    {
		this.sf = sf;
	}
	public void setAddress(Address address) 
    {
		this.address = address;
	}
	public void setPrice(double price) 
    {
		this.price = price;
	}
	public void setAvaiable(boolean isAvaiable) 
    {
		this.isAvaiable = isAvaiable;
	}
	public void setLotSize(double lotSize) 
    {
		this.lotSize = lotSize;
	}
	public void setYearBuilt(int yearBuilt) 
    {
		this.yearBuilt = yearBuilt;
	}

    /*equals method : return true if the two properties have the same address,
      returns false otherwise*/
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;

        if (obj == null || !(obj instanceof Property))
            return false;

        Property other = (Property) obj;
        if (address == null)
            return other.address == null;

        return address.equals(other.address);
    }

    /*
       compareTo method compares the prices of the two properties. This method can be used to list
       the properties based on the price from low to high
       */
    @Override
    public int compareTo(Object obj) 
    {
        Property other = (Property) obj;
        return ((Double) this.price).compareTo((Double) other.getPrice());
    }

    /* toString method: cretates a String representing the atttributes of a property  */
    @Override
    public String toString()
    {
        return String.format(
                "Rooms: %d%n" + 
                "Baths: %d%n" +
                "Square Feet: %f%n" +
                "Address: %n%s%n" +
                "Price: %f%n" +
                "Lot Size: %f%n" +
                "Year Built: %d",
                rooms,
                baths,
                sf,
                address.toString(),
                price,
                lotSize,
                yearBuilt);
    }
}
/*The ListNode class is given*/
class ListNode{
    private Property prop;
    private ListNode next;

    public ListNode(Property p) {
        this.prop = p;
    }
    public ListNode(Property p, ListNode next) {
        this.prop = p;
        this.next = next;
    }
    public ListNode()
    {
    }

    public Property getHouse() {
        return prop;
    }
    public ListNode getNext() {
        return next;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }

}

/*Extra feature: must add two extra methods to this List interface. */
interface List{
    public void add(int rooms, int baths, double price, double sf, Address address, boolean isAvaiable, double lotSize,int yearBuilt);   
    public void add(int rooms, int baths,  double sf, Address address,double price, boolean isAvaiable, double lotSize,int yearBuilt,int index); 
    public boolean remove(Address address); 
    public int size(); 
    public String toString(); 
    public ArrayList<Property> search(int room);  
    public ArrayList<Property> search(int room, int bath);  
    public ArrayList<Property> search(String zipcode);  
    public ArrayList<Property> search(double p1, double p2);
    public Property search(Address address); 
    public ArrayList<Property> searchYearBuilt(int year); 
    public ArrayList<Property> isAvaiable();
    public boolean remove(int index); 
    public ArrayList<Property> searchSf(double sf1, double sf2);
}
/*Must implement the new methods you added in the interface*/
class Redfin implements List
{
    private ListNode head;
    public static int size = 0;

    public Redfin() {
        head = null;

    }
    // constructor
    public Redfin(Property p) {
        head = new ListNode(p);
        size++;
    }
    /*adds a house to the end of the end of the listlist */
    public void add(int rooms, int baths, double price, double sf, Address address, boolean isAvaiable, double lotSize,int yearBuilt)
    {
        Property prop = new Property(rooms, baths, sf, address, price, isAvaiable, lotSize, yearBuilt);
        if (head == null)
        {
            head = new ListNode(prop);
            size++;
            return;
        }

        ListNode node = head;
        while (node.getNext() != null)
        {
            node = node.getNext();
        }
        node.setNext(new ListNode(prop));
        size++;
    }

    /*add a house to the list at the given index*/
    public void add(int rooms, int baths,  double sf, Address address,double price, boolean isAvaiable, double lotSize,int yearBuilt,int index)   {
        if (index < 0 || index > size)
        {
            return;
        }

        Property prop = new Property(rooms, baths, sf, address, price, isAvaiable, lotSize, yearBuilt);
        ListNode newNode = new ListNode(prop);
        if (index == 0)
        {
            newNode.setNext(head);
            head = newNode;
            size++;
            return;
        }

        ListNode node = head;
        for (int i = 0; node.getNext() != null && i < index - 1; i++)
        {
            node = node.getNext();
        }
        newNode.setNext(node.getNext());
        node.setNext(newNode);
        size++;
    }
    /*removes a house from the list with the given address, returns true if the house was found and deleted*/
    public boolean remove(Address address)
    {
        if (head == null)
        {
            return false;
        }

        if (head.getHouse() != null && head.getHouse().getAddress() != null) {
            if (head.getHouse().getAddress().equals(address))
            {
                head = head.getNext();
                size--;
                return true;
            }
        }

        ListNode node = head;
        while (node.getNext() != null)
        {
            if (node.getNext().getHouse() != null && node.getNext().getHouse().getAddress() != null) {
                if (node.getNext().getHouse().getAddress().equals(address))
                {
                    node.setNext(node.getNext().getNext());
                    size--;
                    return true;
                }
            }
            node = node.getNext();
        }
        return false;
    }

    /*returns the size of the list*/

    public int size()
    {
        return size;
    }
    /*returns a string with the list of all the houses*/
    public String toString() 
    {
        String houses = "";
        ListNode node = head;
        while (node != null)
        {
            houses += String.format("%s%n**********************", node.getHouse().toString());
            node = node.getNext();
        }
        return houses;
    }


    /*this method searches the list to find all the houses with the given number of the rooms
      create an arraylist of all the houses and returns the arraylist*/
    public ArrayList<Property> search(int rooms) {
        ArrayList<Property> list = new ArrayList<Property>();
        ListNode node = head;
        while (node != null)
        {
            if (node.getHouse().getRooms() == rooms)
            {
                list.add(node.getHouse());
            }
            node = node.getNext();
        }
        return list;
    }

    /*searches the list to find all all the houses with the specific number of roooms and bath
      returns an Arraylist of houses*/
    public ArrayList<Property> search(int rooms, int baths) 
    {
        ArrayList<Property> list = new ArrayList<Property>();
        ListNode node = head;
        while (node != null)
        {
            if (node.getHouse().getRooms() == rooms && node.getHouse().getBaths() == baths)
            {
                list.add(node.getHouse());
            }
            node = node.getNext();
        }
        return list;
    }
    /*Searches the list to find all the houses at the given zipcode*/
    public ArrayList<Property> search(String zipcode)
    {
        ArrayList<Property> list = new ArrayList<Property>();
        ListNode node = head;
        while (node != null)
        {
            if (node.getHouse() != null && node.getHouse().getAddress() != null && node.getHouse().getAddress().getZip() != null)
            {
                if (node.getHouse().getAddress().getZip().equals(zipcode))
                {
                    list.add(node.getHouse());
                }
            }
            node = node.getNext();
        }
        return list;
    }

    /*returns the house at the given address*/ 

    public Property search(Address address)
    {
        ListNode node = head;
        while (node != null)
        {
            if (node.getHouse().getAddress().equals(address))
            {
                return node.getHouse();
            }
            node = node.getNext();
        }
        return null;
    }
    /*returns the list of all the houses within the prcie range*/      
    public ArrayList<Property> search(double p1, double p2)
    {
        ArrayList<Property> list = new ArrayList<Property>();
        ListNode node = head;
        while (node != null)
        {
            double price = node.getHouse().getPrice();
            if (p1 <= price && price <= p2)
            {
                list.add(node.getHouse());
            }
            node = node.getNext();
        }
        return list;
    } 
    /*returns the list of all the houses built in a given year*/
    public ArrayList<Property> searchYearBuilt(int year) 
    {
        ArrayList<Property> list = new ArrayList<Property>();
        ListNode node = head;
        while (node != null)
        {
            if (node.getHouse().getYearBuilt() == year)
            {
                list.add(node.getHouse());
            }
            node = node.getNext();
        }
        return list;
    }
    /*returns the list of all the houses in the market*/
    public ArrayList<Property> isAvaiable()
    {
        ArrayList<Property> list = new ArrayList<Property>();
        ListNode node = head;
        while (node != null)
        {
            if (node.getHouse().isAvaiable())
            {
                list.add(node.getHouse());
            }
            node = node.getNext();
        }
        return list;
    } 
    /*removes a house from the list at the given index, returns true if the house was found and deleted*/
    public boolean remove(int index)
    {
        if (index < 0 || index > size - 1)
        {
            return false;
        }

        if (head == null)
        {
            return false;
        }

        if (index == 0)
        {
            head = head.getNext();
            size--;
            return true;
        }

        ListNode node = head;
        for (int i = 0; node.getNext() != null && i < index - 1; i++)
        {
            node = node.getNext();
        }
        node.setNext(node.getNext().getNext());
        size--;
        return true;
    }
    /*returns the list of all the houses within the square footage range*/      
    public ArrayList<Property> searchSf(double sf1, double sf2)
    {
        ArrayList<Property> list = new ArrayList<Property>();
        ListNode node = head;
        while (node != null)
        {
            double sf = node.getHouse().getSf();
            if (sf1 <= sf && sf <= sf2)
            {
                list.add(node.getHouse());
            }
            node = node.getNext();
        }
        return list;
    } 
} 
/* 
   Refer to the documnet
   Must use if/else, while loop , must provide all the required methods
   */
class YourDriver
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Redfin properties = new Redfin();
        //call the populate method to add properties to the list
        populate(properties);

        //use a whil loop 
        while (true)
        {
            //display the options
            display();
            //prompt the user to select an option
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            //based on the selected option call the proper method from the Redfin class(must have 12 different conditions
            //display the result for each option selected
            switch (option)
            {
                case 0:
                    {
                        scanner.close();
                        System.exit(0);
                    }
                    break;
                case 1: 
                    {
                        System.out.print("Enter number of rooms: ");
                        int rooms = scanner.nextInt();
                        System.out.print("Enter number of baths: ");
                        int baths = scanner.nextInt();
                        System.out.print("Enter price: ");
                        double price = scanner.nextDouble();
                        System.out.print("Enter square feet: ");
                        double sf = scanner.nextDouble();

                        scanner.nextLine();
                        // Address questions
                        System.out.print("Enter country: ");
                        String country = scanner.nextLine();
                        System.out.print("Enter state: ");
                        String state = scanner.nextLine();
                        System.out.print("Enter city: ");
                        String city = scanner.nextLine();
                        System.out.print("Enter zip: ");
                        String zip = scanner.nextLine();
                        System.out.print("Enter street name: ");
                        String streetName = scanner.nextLine();
                        System.out.print("Enter street number: ");
                        int streetNumber = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Does your address have a street unit (yes/no): ");
                        String unitAnswer = scanner.nextLine();
                        String unit = null;
                        if (unitAnswer.equalsIgnoreCase("yes")) {
                            System.out.print("Enter street unit: ");
                            unit = scanner.nextLine();
                        }

                        System.out.print("Is this house availiable for purchase (yes/no): ");
                        String availiableAnswer = scanner.nextLine();
                        boolean isAvaiable = false;
                        if (availiableAnswer.equalsIgnoreCase("yes")) {
                            isAvaiable = true;
                        }
                        System.out.print("Enter lot size: ");
                        int lotSize = scanner.nextInt();
                        System.out.print("Enter year built: ");
                        int yearBuilt = scanner.nextInt();

                        Address addr;
                        if (unit != null) 
                        {
                            addr = new Address(country, state, city, zip, streetNumber, streetName, unit);
                        }
                        else
                        {
                            addr = new Address(country, state, city, zip, streetNumber, streetName);
                        }

                        properties.add(rooms, baths, price, sf, addr, isAvaiable, lotSize, yearBuilt);   
                    }
                    break;
                case 2:
                    {
                        System.out.print("Enter country: ");
                        String country = scanner.nextLine();
                        System.out.print("Enter state: ");
                        String state = scanner.nextLine();
                        System.out.print("Enter city: ");
                        String city = scanner.nextLine();
                        System.out.print("Enter zip: ");
                        String zip = scanner.nextLine();
                        System.out.print("Enter street name: ");
                        String streetName = scanner.nextLine();
                        System.out.print("Enter street number: ");
                        int streetNumber = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Does your address have a street unit (yes/no): ");
                        String unitAnswer = scanner.nextLine();
                        String unit = null;
                        if (unitAnswer.equalsIgnoreCase("yes")) {
                            System.out.print("Enter street unit: ");
                            unit = scanner.nextLine();
                        }

                        Address addr;
                        if (unit != null) 
                        {
                            addr = new Address(country, state, city, zip, streetNumber, streetName, unit);
                        }
                        else
                        {
                            addr = new Address(country, state, city, zip, streetNumber, streetName);
                        }
                        if (properties.remove(addr))
                        {
                            System.out.println("Successfully removed house");
                        }
                        else
                        {
                            System.out.println("Could not locate house");
                        }
                    }
                    break;
                case 3:
                    {
                        System.out.println("The list of houses contains " + properties.size() + " houses");
                    }
                    break;
                case 4:
                    {
                        System.out.print("Enter number of rooms: ");
                        int rooms = scanner.nextInt();

                        printHouses(properties.search(rooms));
                    }
                    break;
                case 5:
                    {
                        System.out.print("Enter number of rooms: ");
                        int rooms = scanner.nextInt();
                        System.out.print("Enter number of baths: ");
                        int baths = scanner.nextInt();

                        printHouses(properties.search(rooms, baths));
                    }
                    break;
                case 6:
                    {
                        System.out.print("Enter zipcode: ");
                        String zip = scanner.next();

                        printHouses(properties.search(zip));
                    }
                    break;
                case 7:
                    {
                        System.out.print("Enter lower price bound: ");
                        double p1 = scanner.nextDouble();
                        System.out.print("Enter upper price bound: ");
                        double p2 = scanner.nextDouble();

                        printHouses(properties.search(p1, p2));
                    }
                    break;
                case 8:
                    {
                        System.out.print("Enter country: ");
                        String country = scanner.nextLine();
                        System.out.print("Enter state: ");
                        String state = scanner.nextLine();
                        System.out.print("Enter city: ");
                        String city = scanner.nextLine();
                        System.out.print("Enter zip: ");
                        String zip = scanner.nextLine();
                        System.out.print("Enter street name: ");
                        String streetName = scanner.nextLine();
                        System.out.print("Enter street number: ");
                        int streetNumber = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Does your address have a street unit (yes/no): ");
                        String unitAnswer = scanner.nextLine();
                        String unit = null;
                        if (unitAnswer.equalsIgnoreCase("yes")) {
                            System.out.print("Enter street unit: ");
                            unit = scanner.nextLine();
                        }

                        Address addr;
                        if (unit != null) 
                        {
                            addr = new Address(country, state, city, zip, streetNumber, streetName, unit);
                        }
                        else
                        {
                            addr = new Address(country, state, city, zip, streetNumber, streetName);
                        }
                        Property house = properties.search(addr);
                        if (house != null)
                        {
                            System.out.println(house.toString());
                        }
                        else
                        {
                            System.out.println("Could not locate house");
                        }
                    }
                    break;
                case 9:
                    {
                        System.out.print("Enter year: ");
                        int year = scanner.nextInt();

                        printHouses(properties.searchYearBuilt(year));
                    }
                    break;
                case 10:
                    {
                        printHouses(properties.isAvaiable());
                    }
                    break;
                case 11:
                    {
                        System.out.print("Enter index: ");
                        int index = scanner.nextInt();

                        if (properties.remove(index))
                        {
                            System.out.println("Successfully removed house");
                        }
                        else
                        {
                            System.out.println("Could not locate house");
                        }
                    }
                    break;
                case 12:
                    {
                        System.out.print("Enter lower square footage bound: ");
                        double sf1 = scanner.nextDouble();
                        System.out.print("Enter upper square footage bound: ");
                        double sf2 = scanner.nextDouble();

                        printHouses(properties.searchSf(sf1, sf2));
                    }
                    break;
                default:
                    {
                        System.out.println("Unrecognized option");
                        System.out.println("Please select an option between 1 and 12");
                    }
                    break;
            }
            System.out.println();
        }
    }

    public static void printHouses(ArrayList<Property> houses)
    {
        if (houses != null && !houses.isEmpty())
        {
            for (int i = 0; i < houses.size(); i++) 
            {
                System.out.println(houses.get(i).toString());
                System.out.println("**********************");
            }
        }
        else
        {
            System.out.println("no houses found");
        }
    }

    /*
       This method fills in the list by creating the Property objects , ading it to the list houses
       refer to the document
       Create 7 different propery object and add it to the list called properties
       */
    public static void populate(Redfin properties)
    {
        properties.add(2, 2, 300000, 1300, new Address("USA", "CA", "Rocklin", "00000", 1234, "road St"), true, 2, 1970);
        properties.add(2, 1, 200000, 900, new Address("USA", "CA", "Rocklin", "00000", 1233, "road St"), true, 1, 1970);
        properties.add(3, 2, 600000, 2000, new Address("USA", "CA", "Rocklin", "00000", 1232, "street Rd"), false, 3, 1990);
        properties.add(1, 0, 100000, 100, new Address("USA", "CA", "Rocklin", "00000", 1231, "road St", "1A"), true, 1, 2020);
        properties.add(2, 1, 250000, 1000, new Address("USA", "CA", "Cool", "00321", 1230, "north traffic light Ct"), true, 2, 1965);
        properties.add(3, 2, 600000, 2000, new Address("USA", "CA", "Grass Valley", "04321", 1235, "south roundabout Rd"), true, 3, 1940);
        properties.add(5, 4, 1000000, 3000, new Address("USA", "CA", "Nevada City", "54321", 1236, "antarctic St"), false, 3, 2002);
    }

    /*Must implement this method displaying the 12 options to the user*/
    public static void display()
    {
        System.out.println("Enter 0 to exit program\n" +
                "Enter 1 to add a house to the list\n" +
                "Enter 2 to remove a house from the list based on address\n" +
                "Enter 3 to get the size of the list of houses\n" +
                "Enter 4 to list the houses based on the number of rooms\n" +
                "Enter 5 to list the houses with the number of rooms and baths\n" +
                "Enter 6 to list the houses based on the zipcode\n" +
                "Enter 7 to list the houses based on a price range\n" +
                "Enter 8 to list the houses based on address\n" +
                "Enter 9 to list the houses based on year built\n" +
                "Enter 10 to list the houses availiable for purchase\n" +
                "Enter 11 to remove a house from the list based on index\n" +
                "Enter 12 to list the houses based on a square footage range\n" +
                "***************************************************\n");
    }
}
