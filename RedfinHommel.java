import java.util.ArrayList;

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
        Property other = (Property) obj;
        return this.toString().compareTo(other.toString());
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        Address other = (Address) obj;
        if (country == null) 
        {
            if (other.country != null)
                return false;
        } 
        else if (!country.equals(other.country))
            return false;

        if (state == null) 
        {
            if (other.state != null)
                return false;
        } 
        else if (!state.equals(other.state))
            return false;

        if (city == null) 
        {
            if (other.city != null)
                return false;
        } 
        else if (!city.equals(other.city))
            return false;

        if (zip == null) 
        {
            if (other.zip != null)
                return false;
        } 
        else if (!zip.equals(other.zip))
            return false;

        if (unit == null) 
        {
            if (other.unit != null)
                return false;
        } 
        else if (!unit.equals(other.unit))
            return false;

        if (streetNumber != other.streetNumber)
            return false;

        if (streetName == null) 
        {
            if (other.streetName != null)
                return false;
        } 
        else if (!streetName.equals(other.streetName))
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

        if (obj == null)
            return false;

        Property other = (Property) obj;
        if (rooms != other.rooms)
            return false;
        if (baths != other.baths)
            return false;
        if (sf != other.sf)
            return false;
        if (address == null)
        {
            if (other.address != null)
                return false;
        } 
        else if (!address.equals(other.address))
        {
            return false;
        }
        if (price != other.price)
            return false;
        if (isAvaiable != other.isAvaiable)
            return false;
        if (lotSize != other.lotSize)
            return false;
        if (yearBuilt != other.yearBuilt)
            return false;

        return true;
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
                "Address: %n%s%n" +
                "Price: %f%n" +
                "Lot Size: %f%n" +
                "Year Built: %d%n",
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
        for (int i = 0; node.getNext() != null && i < index-1; i++)
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

        if (head.getHouse().getAddress().equals(address))
        {
            head = head.getNext();
            return true;
        }

        ListNode node = head;
        while (node.getNext() != null)
        {
            if (node.getNext().getHouse().getAddress().equals(address))
            {
                node.setNext(node.getNext().getNext());
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    /*returns the size of the list*/

    public int size()
    {
        return size+1;
    }
    /*returns a string with the list of all the houses*/
    public String toString() 
    {
        String houses = "";
        ListNode node = head;
        while (node != null)
        {
            houses = String.format("%s%n**********************", node.getHouse().toString());
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
            if (node.getHouse().getAddress().getZip() == zipcode)
            {
                list.add(node.getHouse());
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
            if (p1 < price && price < p2)
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
} 
/* 
   Refer to the documnet
   Must use if/else, while loop , must provide all the required methods
   */
class YourDriver
{
    public static void main(String[] args)
    {
        Redfin properties = new Redfin();
        //call the populate method to add properties to the list
        populate(properties);

        //use a whil loop 
        while (true)
        {
            //display the options
            //prompt the user to select an option
            //based on the selected option call the proper method from the Redfin class(must have 12 different conditions
            //display the result for each option selected
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
        properties.add(3, 2, 600000, 2000, new Address("USA", "CA", "Rocklin", "00000", 1232, "road St"), true, 3, 1990);
    }



    /*Must implement this method displaying the 12 options to the user*/


}
