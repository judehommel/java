/*
Name: Jude Hommel
Testimony: I wrote all of this code myself
Date: 11-1-26
Description: This program manages TravelPackages through a TravelAgent. TravelPackage stores information about singular packages, while 
TravelAgent manages a list of TravelPackages. This list can be added to, searched, displayed, and sorted in various ways. 
Self-Grade: 95/100 I believe I followed the TravelAgent PDF properly however I think that comments could be worded 
better, I usually try to write in a way where I don't need many comments because the code explains itself
 */
/*Include required commnets here*/

import java.util.ArrayList;
import java.util.Scanner;

public class AgentHommel  //add your last name
{
}
class TravelPackage
{
    private String id;
    private String destination;
    private double price;
    private int duration; // in days

    public TravelPackage(String id, String destination, double price, int duration) 
    {
        this.id = id;
        this.destination = destination;
        this.price = price;
        this.duration = duration;
    }

    // Getters
    public String getId() 
    {
        return id;
    }

    public String getDestination() 
    {
        return destination;
    }

    public double getPrice() 
    {
        return price;
    }

    public int getDuration() 
    {
        return duration;
    }

    // Setters
    public void setId(String id) 
    {
        this.id = id;
    }

    public void setDestination(String destination) 
    {
        this.destination = destination;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public void setDuration(int duration) 
    {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;
        if (!(obj instanceof TravelPackage))
            return false;
        TravelPackage other = (TravelPackage) obj;
        if (id == null) 
        {
            if (other.id != null)
                return false;
        } 
        else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() 
    {
        return String.format("%s %s %d %.1f", id, destination, duration, price);
    }

    public int compareDestinationTo(Object obj) {
        TravelPackage other = (TravelPackage) obj;
        return destination.compareToIgnoreCase(other.destination);
    }

    public int comparePriceTo(Object obj) {
        TravelPackage other = (TravelPackage) obj;
        return Double.compare(price, other.price);
    }

    public int compareDurationTo(Object obj) {
        TravelPackage other = (TravelPackage) obj;
        return Integer.compare(duration, other.duration);
    }
}
class TravelAgent
{
    ArrayList<TravelPackage> packages;

    public TravelAgent() 
    {
        packages = new ArrayList<TravelPackage>();
    }

    public ArrayList<TravelPackage> getPackages() 
    {
        return packages;
    }

    public void setPackages(ArrayList<TravelPackage> packages) 
    {
        this.packages = packages;
    }

    public void displayPackages()
    {
        for (TravelPackage element : packages) 
        {
            System.out.println("ID Destination days price in order--> " + element.toString());
        }
    }

    // Note: inputPackage (Method #2) is not allowed parameters so a static scanner located in Driver is used
    public void inputPackage()
    {
        System.out.print("Enter id: ");
        String id = Driver.scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = Driver.scanner.nextLine();
        System.out.print("Enter duration in days: ");
        int duration = Driver.scanner.nextInt();
        System.out.print("Enter price: ");
        double price = Driver.scanner.nextDouble();
        Driver.scanner.nextLine();

        if (searchByDestination(destination) == null)
        {
            packages.add(new TravelPackage(id, destination, price, duration));
        }
        else
        {
            System.out.println("Could not add package");
            System.out.println("No duplicate destinations allowed");
        }
    }

    public void bubbleSortByDestination()
    {
        int n = packages.size();
        boolean complete;
        for (int i = 0; i < n - 1; i++) 
        {
            complete = true;
            // Unsorted sub-array loop
            // Move (i+1)th largest destination to the end of sub-array
            for (int j = 0; j < n - 1 - i; j++) 
            {
                TravelPackage temp = packages.get(j + 1);
                if (packages.get(j).compareDestinationTo(temp) > 0)
                {
                    packages.set(j + 1, packages.get(j));
                    packages.set(j, temp);
                    complete = false;
                }
            }
            
            // If no swaps occured, then array is sorted
            if (complete)
                return;
        }
    }

    public void insertionSortByPrice()
    {
        for (int i = 1; i < packages.size(); i++) 
        {
            int j = i - 1;
            TravelPackage temp = packages.get(i);
            // Shift elements between temp's price and a price less than temp's over one
            while (j >= 0 && packages.get(j).comparePriceTo(temp) > 0)
            {
                packages.set(j + 1, packages.get(j));
                j--;
            }
            // Set element that's one index more than a price less than temp's to temp
            packages.set(j + 1, temp);
        }
    }

    public void selectionSortByDuration()
    {
        for (int i = 0; i < packages.size() - 1; i++) 
        {
            int minIndex = i;
            
            // Search unsorted sub-array for lowest duration
            for (int j = i + 1; j < packages.size(); j++) 
            {
                if (packages.get(j).compareDurationTo(packages.get(minIndex)) < 0)
                {
                    minIndex = j;
                }
            }

            // Place lowest duration at the beginning of unsorted sub-array
            TravelPackage temp = packages.get(i);
            packages.set(i, packages.get(minIndex));
            packages.set(minIndex, temp);
        }
    }

    public TravelPackage searchByDestination(String searchedDestination)
    {
        bubbleSortByDestination();

        int high = packages.size() - 1;
        int low = 0;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;

            String destination = packages.get(mid).getDestination();
            int result = destination.compareToIgnoreCase(searchedDestination);

            // Middle is less than searchedDestination
            if (result < 0)
            {
                low = mid + 1;
            }
            // Middle is greater than searchedDestination
            else if(result > 0)
            {
                high = mid - 1;
            }
            // Middle is searchedDestination
            else
            {
                return packages.get(mid);
            }
        }

        return null;
    }
}
class Driver
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String args[])
    {
        TravelAgent travelAgent = new TravelAgent();

        for (int i = 0; i < 5; i++)
        {
            travelAgent.inputPackage();
        }
        
        System.out.println("**************************");

        System.out.println("Sorting based on the destinations");
        travelAgent.bubbleSortByDestination();
        travelAgent.displayPackages();

        System.out.println("**************************");

        System.out.println("Sorting based on the price");
        travelAgent.insertionSortByPrice();
        travelAgent.displayPackages();

        System.out.println("**************************");

        System.out.println("Sorting based on the days");
        travelAgent.selectionSortByDuration();
        travelAgent.displayPackages();

        System.out.println("**************************");

        System.out.print("Enter the destination to search for: ");
        String destination = scanner.nextLine();
        TravelPackage searchedPackage = travelAgent.searchByDestination(destination);
        if (searchedPackage == null)
        {
            System.out.println("Package not found");
        }
        else
        {
            System.out.println(searchedPackage.toString());
        }

        scanner.close();
    }
}
