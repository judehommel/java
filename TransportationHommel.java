/*
   Name: Jude Hommel
   Date: 24-9-26
   Self-grade based on the given requirements and the correctness of the output: 100/100 Sometimes the example output located in the Travel_Assignment_Final.docx conflicts 
   with the comment's instructions so thats kind of confusing me, meaning I might have misunderstood somethings, but I think I completed everything to the best of my abilities

   Testimony: Jude Hommel

   DO NOT REMOVE ANY OF THE GIVEN COMMENTS; otherwise, your code will not be graded.

   Your program must generate output that demonstrates the required functionality.
   The provided output is only a sample. You must create your own passenger data and

   your own transportation data.

   DO NOT copy the passenger names, contact information, IDs, locations, seat numbers,
   or other data from the sample output. Any copied data will result in point deductions.

   (35) Additional Required Code: You must complete your own transportation class and
   answer the following questions to receive full credit:

   - Add one transportation class of your choice similar to the Bus class
   (Train, Taxi, Shuttle, Van, Subway, Ferry, Helicopter, Spaceship, etc.).
   - Does your class extend the Vehicle class?
   - Have you implemented the given PassengerList interface for this class?
   - What is the relationship between this class and the Passenger class (is-A or has-A)?
   - Specify the instance variables for the class.
   - Have you created the constructor?
   - Have you created the getter/setter methods?
   - Have you created methods similar to those implemented in the Bus class?
   - Have you created at least two meaningful instance variables specific to your
   transportation class? Do not duplicate variables inherited from Vehicle.
   - Have you created at least one meaningful method unique to your transportation class?
   - Have you demonstrated polymorphism using a Vehicle reference? 
   - Have you created a Driver class to create and use Passenger objects?
   - Have you called the required methods in the Driver class? 
   - Have you demonstrated at least three meaningful operations using your new class?

5. What is an is a relationship in your program? Subway is a Vehicle
6. What is a has a relationship in your program? Subway has an array of passengers
7. What makes your transportation class different from Bus? The Subway class is different from the Bus class because a Subway has a line name and station count, while a Bus has a starting location, ending location, and driver
8. What unique instance variables did you add and why are they appropriate? I added lineName and stationCount because they both are properties that a subway has
9. What unique behavior did you add? The method that I added allows the subway to calculate what percent of seats are filled
10. Where did you demonstrate polymorphism? At the bottom of my main method in the Driver class (Starts on line 751)
   */

public class TransportationHommel
{
    // No code here
}

/* The Person class is complete. There is no need to add any code to it. */
class Person
{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private String personId;

    // Parameter order has been changed for this semester.
    public Person(String personId, String lastName, String firstName,
            String emailAddress, String phoneNumber)
    {
        this.personId = personId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getFirst()
    {
        return firstName;
    }

    public String getLast()
    {
        return lastName;
    }

    public String getPhone()
    {
        return phoneNumber;
    }

    public String getEmail()
    {
        return emailAddress;
    }

    public String getId()
    {
        return personId;
    }

    public void setFirst(String newFirst)
    {
        firstName = newFirst;
    }

    public void setLast(String newLast)
    {
        lastName = newLast;
    }

    public void setId(String newId)
    {
        personId = newId;
    }

    public void setEmail(String newEmail)
    {
        emailAddress = newEmail;
    }

    public void setPhone(String newPhone)
    {
        phoneNumber = newPhone;
    }

    public String toString()
    {
        return "first: " + firstName + ", last = " + lastName +", phone = " + phoneNumber +
            ", email = " + emailAddress + ", ID = " + personId;
    }

    public boolean equals(Object o)
    {
        if (o instanceof Person)
            return this.personId.equalsIgnoreCase(((Person) o).personId);
        else
            return false;
    }
}

/*
   Passenger class extends the Person class.
   Every passenger has a row number, seat number, and number of luggage items.
   */
class Passenger extends Person // extends Person  (Make sure Passenger extends Person)
{
    // Declare the Passenger instance variables according to the provided UML.
    // Create a constructor using the new parameter order.
    // Create the required getter and setter methods.
    // Override toString().

    private String row;
    private int seatNumber;
    private int luggageCount;

    public Passenger(String personId, String lastName, String firstName, String emailAddress, String phoneNumber,
            String row, int seatNumber, int luggageCount) 
    {
        super(personId, lastName, firstName, emailAddress, phoneNumber);
        this.row = row;
        this.seatNumber = seatNumber;
        this.luggageCount = luggageCount;
    }

    public String getRow() 
    {
        return row;
    }

    public int getSeatNumber() 
    {
        return seatNumber;
    }

    public int getLuggageCount() 
    {
        return luggageCount;
    }

    public void setRow(String row) 
    {
        this.row = row;
    }

    public void setSeatNumber(int seatNumber) 
    {
        this.seatNumber = seatNumber;
    }

    public void setLuggageCount(int luggageCount) 
    {
        this.luggageCount = luggageCount;
    }

    @Override
    public String toString() 
    {
        return super.toString() + ", Seat = " + seatNumber + ", Row = " + row + ", Luggage = " + luggageCount;
    }
}

/* Complete code is given. No need to add any code. */
class Vehicle
{
    private String registrationNumber;
    private String manufacturer;
    private String vehicleModel;
    private String energySource;
    private boolean electricPowered;

    // Parameter order has been changed for this semester.
    public Vehicle(String manufacturer, String vehicleModel, boolean electricPowered,
            String energySource, String registrationNumber)
    {
        this.registrationNumber = registrationNumber;
        this.manufacturer = manufacturer;
        this.vehicleModel = vehicleModel;
        this.energySource = energySource;
        this.electricPowered = electricPowered;
    }

    public boolean getElectric()
    {
        return electricPowered;
    }

    public String getPlate()
    {
        return registrationNumber;
    }

    public String getModel()
    {
        return vehicleModel;
    }

    public String getMake()
    {
        return manufacturer;
    }

    public String getFuelType()
    {
        return energySource;
    }

    public void setPlate(String newPlate)
    {
        registrationNumber = newPlate;
    }

    public void setModel(String newModel)
    {
        vehicleModel = newModel;
    }

    public void setMake(String newMake)
    {
        manufacturer = newMake;
    }

    public void setFuel(String newFuel)
    {
        energySource = newFuel;
    }

    public void setElectric(boolean electric)
    {
        electricPowered = electric;
    }

    public String toString()
    {
        String s = "Yes";
        if (!electricPowered)
            s = "No";

        return "Make = " + manufacturer + ", Model = " + vehicleModel + ", Plate = " +
            registrationNumber + ", Fuel type = " + energySource + ", Electric: " + s;
    }

    public boolean equals(Object o)
    {
        if (o instanceof Vehicle)
        {
            Vehicle otherVehicle = (Vehicle) o;
            return this.registrationNumber.equalsIgnoreCase(otherVehicle.registrationNumber);
        }
        return false;
    }
}

interface PassengerList
{
    /*
       The Bus class and your new transportation class must both implement
       the PassengerList interface.

       The required method signatures are provided below.
       Your class must provide the implementation for each method.
       */

    void add(Passenger passenger);
    boolean remove(String passengerId);
    Passenger search(String passengerId);
    void printPassengers();
    void printByLastName(String lastName);
    int seatsLeft();
}

class Bus extends Vehicle implements PassengerList // extends Vehicle implements PassengerList (Make sure Bus implements PassengerList)
{
    // Declare all instance variables according to the Bus UML.
    // Create the constructor using the parameter order in the current Travel document.
    // Create the required getter and setter methods.
    // Implement all methods listed in the PassengerList interface.
    // Override toString() when appropriate.
    // Use your own data in the Driver class.

    private String startingLocation;
    private String endingLocation;
    private Person driver;
    private Passenger[] passengers;
    private int passengerCount;
    private int maximumCapacity;

    public Bus(String manufacturer, String vehicleModel, boolean electricPowered, String energySource,
            String registrationNumber, String startingLocation, String endingLocation, Person driver,
            Passenger[] passengers, int passengerCount, int maximumCapacity) 
    {
        super(manufacturer, vehicleModel, electricPowered, energySource, registrationNumber);
        this.startingLocation = startingLocation;
        this.endingLocation = endingLocation;
        this.driver = driver;
        this.passengers = passengers;
        this.passengerCount = passengerCount;
        this.maximumCapacity = maximumCapacity;
    }

    public String getStartingLocation() 
    {
        return startingLocation;
    }

    public String getEndingLocation() 
    {
        return endingLocation;
    }

    public Person getDriver() 
    {
        return driver;
    }

    public Passenger[] getPassengers() 
    {
        return passengers;
    }

    public int getPassengerCount() 
    {
        return passengerCount;
    }

    public int getMaximumCapacity() 
    {
        return maximumCapacity;
    }

    public void setStartingLocation(String startingLocation) 
    {
        this.startingLocation = startingLocation;
    }

    public void setEndingLocation(String endingLocation) 
    {
        this.endingLocation = endingLocation;
    }

    public void setDriver(Person driver) 
    {
        this.driver = driver;
    }

    public void setPassengers(Passenger[] passengers) 
    {
        this.passengers = passengers;
    }

    public void setPassengerCount(int passengerCount) 
    {
        this.passengerCount = passengerCount;
    }

    public void setMaximumCapacity(int maximumCapacity) 
    {
        this.maximumCapacity = maximumCapacity;
    }

    @Override
    public void add(Passenger passenger)
    {
        if (passengerCount < maximumCapacity) {
            for (int i = 0; i < passengers.length; i++)
            {
                if (passengers[i] == null)
                {
                    passengers[i] = passenger;
                    passengerCount++;

                    return;
                }
            }
        }
    }

    @Override
    public boolean remove(String passengerId)
    {
        for (int i = 0; i < passengers.length; i++)
        {
            if (passengers[i] != null && passengers[i].getId() != null)
            {
                if (passengers[i].getId().equalsIgnoreCase(passengerId))
                {
                    passengers[i] = null;
                    passengerCount--;
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public Passenger search(String passengerId)
    {
        for (int i = 0; i < passengers.length; i++)
        {
            if (passengers[i] != null && passengers[i].getId() != null)
            {
                if (passengers[i].getId().equalsIgnoreCase(passengerId))
                {
                    return passengers[i];
                }
            }
        }

        return null;
    }

    @Override
    public void printPassengers() 
    {
        for (int i = 0; i < passengers.length; i++)
        {
            if (passengers[i] != null)
            {
                System.out.println(passengers[i].toString());
            }
        }
    }

    @Override
    public void printByLastName(String lastName) 
    {
        for (int i = 0; i < passengers.length; i++)
        {
            if (passengers[i] != null && passengers[i].getLast() != null)
            {
                if (passengers[i].getLast().equals(lastName))
                {
                    System.out.println(passengers[i].toString());
                }
            }
        }
    }

    @Override
    public int seatsLeft() 
    {
        return maximumCapacity - passengerCount;
    }

    @Override
    public String toString() 
    {
        return super.toString() + ", Starting Location = " + startingLocation + ", endingLocation = " + endingLocation + ", Driver = ( " + driver.toString() + " )";
    }
}

/* This class is worth 35 points out of 100 points. */
class Subway extends Vehicle implements PassengerList // Change the name to the class of your choice
{
    // Add at least two meaningful instance variables specific to your transportation type.
    // Do not duplicate variables inherited from Vehicle.
    // Create the constructor using the current parameter order.
    // Create the required getter and setter methods.
    // Add passenger management methods similar to those in Bus.
    // Add at least one meaningful method that is unique to your class.
    // The unique method must perform a meaningful operation, calculation,
    // or change to the object's state. It cannot only print a message.
    // Demonstrate an is-A relationship with Vehicle.
    // Demonstrate a has-A relationship with Passenger.

    private Passenger[] passengers;
    private int passengerCount;
    private int maximumCapacity;
    private String lineName;
    private int stationCount;

	public Subway(String manufacturer, String vehicleModel, boolean electricPowered, String energySource,
			String registrationNumber, Passenger[] passengers, int passengerCount, int maximumCapacity, String lineName,
			int stationCount) 
    {
		super(manufacturer, vehicleModel, electricPowered, energySource, registrationNumber);
		this.passengers = passengers;
		this.passengerCount = passengerCount;
		this.maximumCapacity = maximumCapacity;
		this.lineName = lineName;
		this.stationCount = stationCount;
	}

	public Passenger[] getPassengers() 
    {
		return passengers;
	}

	public int getPassengerCount() 
    {
		return passengerCount;
	}

	public int getMaximumCapacity() 
    {
		return maximumCapacity;
	}

	public String getLineName() 
    {
		return lineName;
	}

	public int getStationCount() 
    {
		return stationCount;
	}

	public void setPassengers(Passenger[] passengers) 
    {
		this.passengers = passengers;
	}

	public void setPassengerCount(int passengerCount) 
    {
		this.passengerCount = passengerCount;
	}

	public void setMaximumCapacity(int maximumCapacity) 
    {
		this.maximumCapacity = maximumCapacity;
	}

	public void setLineName(String lineName) 
    {
		this.lineName = lineName;
	}

	public void setStationCount(int stationCount) 
    {
		this.stationCount = stationCount;
	}

    @Override
    public void add(Passenger passenger)
    {
        if (passengerCount < maximumCapacity) {
            for (int i = 0; i < passengers.length; i++)
            {
                if (passengers[i] == null)
                {
                    passengers[i] = passenger;
                    passengerCount++;

                    return;
                }
            }
        }
    }

    @Override
    public boolean remove(String passengerId)
    {
        for (int i = 0; i < passengers.length; i++)
        {
            if (passengers[i] != null && passengers[i].getId() != null)
            {
                if (passengers[i].getId().equalsIgnoreCase(passengerId))
                {
                    passengers[i] = null;
                    passengerCount--;
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public Passenger search(String passengerId)
    {
        for (int i = 0; i < passengers.length; i++)
        {
            if (passengers[i] != null && passengers[i].getId() != null)
            {
                if (passengers[i].getId().equalsIgnoreCase(passengerId))
                {
                    return passengers[i];
                }
            }
        }

        return null;
    }

    @Override
    public void printPassengers() 
    {
        System.out.println("Passengers: ");
        for (int i = 0; i < passengers.length; i++)
        {
            if (passengers[i] != null)
            {
                System.out.println(passengers[i].toString());
            }
        }
    }

    @Override
    public void printByLastName(String lastName) 
    {
        for (int i = 0; i < passengers.length; i++)
        {
            if (passengers[i] != null && passengers[i].getLast() != null)
            {
                if (passengers[i].getLast().equals(lastName))
                {
                    System.out.println(passengers[i].toString());
                }
            }
        }
    }

    @Override
    public int seatsLeft() 
    {
        return maximumCapacity - passengerCount;
    }

    @Override
    public String toString() 
    {
        return super.toString() + ", Line Name = " + lineName + ", Station Count = " + stationCount;
    }

    public String percentSeatsFilled()
    {
        if (maximumCapacity == 0) {
            return "100.0%";
        }
        double percentValue = (double) passengerCount / maximumCapacity * 100;
        return String.format("%3.1f%%", percentValue);
    }
}

class Driver
{
    public static void main(String[] args)
    {
        // Create a Bus object using your own data.
        // Do NOT copy the data from the sample output.
        // Create 10 passengers using your own data.
        // Make sure some passengers have the same last name.

        // Bus Output ***********************************************************************************************************
        Person driver = new Person("P999", "Smith", "John", "John@gmail.com", "(530) 111 1111");
        int numPassengers = 10;
        Bus sickBus = new Bus("Toyota", "Bus", false, "Gas", "1D98S", "Antarctica", "The Moon, Canada", driver, new Passenger[25], numPassengers, 25);
        Passenger[] passengers = new Passenger[25];

        String [] firstNames = {"Dave", "Terry", "Bill", "Rich", "Fred", "Carol", "Eric", "Clarence", "Reginald", "Fredrick"};
        String [] lastNames = {"Smith", "Baker", "Johnson", "Williams"};
        for (int i = 0; i < numPassengers; i++)
        {
            String Id = String.format("P%03d", i);
            String phoneNumber = String.format("(530) 000-%04d", i);
            int seat = i % 4 + 1;
            String row = Character.toString((char) ('A' + i/4));

            passengers[i] = new Passenger(Id, lastNames[i % lastNames.length], firstNames[i], firstNames[i] + "@gmail.com", phoneNumber, row, seat, (int) (Math.random()*4));

            sickBus.add(passengers[i]);
        }

        // Call the methods required by the current Travel document.
        // Display the origin and destination using the current methods.
        System.out.println("The starting location of this bus is " + sickBus.getStartingLocation());
        System.out.println("The destination of this bus is " + sickBus.getEndingLocation());
        System.out.println();

        // Demonstrate the Bus toString method.
        System.out.println("Bus toString method: ");
        System.out.println(sickBus.toString());
        System.out.println();

        System.out.println("Passengers: ");
        sickBus.printPassengers();
        System.out.println();

        // Demonstrate the available-seat calculation.
        System.out.println("The bus has " + sickBus.seatsLeft() + " seats available");
        System.out.println();

        // Display passengers with the same last name.
        System.out.println("Passengers with the last name Smith");
        sickBus.printByLastName("Smith");
        System.out.println();

        // Search for a passenger using the current search method/signature.
        String searchId = passengers[6].getId();
        System.out.println("Searching for Passenger ID " + searchId);
        Passenger searchedPassenger = sickBus.search(searchId);
        if (searchedPassenger != null) 
        {
            System.out.println(searchedPassenger.getFirst() + " " + searchedPassenger.getLast() + " is sitting at " + searchedPassenger.getRow() + " " + searchedPassenger.getSeatNumber());
        }
        else
        {
            System.out.println("Could not find Passenger");
        }
        System.out.println();

        // Remove a passenger using the current removal method/signature.
        String removeId = passengers[6].getId();
        System.out.println("Removing Passenger ID " + searchId);
        if (sickBus.remove(removeId))
        {
            System.out.println(searchedPassenger.getFirst() + " " + searchedPassenger.getLast() + " has been removed.");
        }
        else
        {
            System.out.println("Could not find Passenger");
        }
        System.out.println();

        // Display the updated passenger list.
        System.out.println("Updated Passengers: ");
        sickBus.printPassengers();
        System.out.println();

        // Create an object of your transportation class.
        // Subway Output ***********************************************************************************************************
        Subway sickSubway = new Subway("Apple", "subway", true, "Solar", "1D03K", new Passenger[50], 0, 50, "Crosstown Line", 3);

        // Add multiple passengers to your transportation object.
        sickSubway.add(passengers[6]);

        sickBus.remove(passengers[9].getId());
        sickSubway.add(passengers[9]);

        sickBus.remove(passengers[2].getId());
        sickSubway.add(passengers[2]);

        System.out.println("Subway toString method: ");
        System.out.println(sickSubway.toString());
        System.out.println();

        // Demonstrate at least three meaningful operations.
        sickSubway.printPassengers();
        System.out.println();

        System.out.println("The subway has " + sickSubway.seatsLeft() + " seats available");
        System.out.println();

        System.out.println("The subway can hold " + sickSubway.getMaximumCapacity() + " total people");
        System.out.println();
        
        // Call your unique method.
        System.out.println(sickSubway.percentSeatsFilled() + " of seats are filled");
        System.out.println();

        // Demonstrate polymorphism using a Vehicle reference.
        System.out.println("Polymorphism Examples: ");

        Vehicle busVehicle = sickBus;
        Vehicle subwayVehicle = sickSubway;

        System.out.println(busVehicle.toString());
        System.out.println(subwayVehicle.toString());
        System.out.println();

        // Another polymorphism example
        Person wantedPerson = passengers[4];
        boolean foundPerson = false;
        System.out.println("Searching all vehicles for wanted person by the name of " + wantedPerson.getFirst() + " " + wantedPerson.getLast());

        PassengerList[] vehicles = new PassengerList[2];
        vehicles[0] = sickBus;
        vehicles[1] = sickSubway;
        for (int i = 0; i < 2; i++) 
        {
            if (vehicles[i].search(wantedPerson.getId()) != null) 
            {
                Vehicle vehicle = (Vehicle) vehicles[i];
                System.out.println("Wanted person is located on a " + vehicle.getMake() + " " + vehicle.getModel());
                foundPerson = true;
                return;
            }
        }
        if (!foundPerson)
        {
            System.out.println("Could not find wanted person on any vehicle");
        }
        System.out.println();

        // Display the results using your own data.
    }
}
