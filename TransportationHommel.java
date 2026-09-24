/*
Name: Jude Hommel
Date: 24-9-26
Self-grade based on the given requirements and the correctness of the output:

Testimony:

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
class Passenger // extends Person  (Make sure Passenger extends Person)
{
   // Declare the Passenger instance variables according to the provided UML.
   // Create a constructor using the new parameter order.
   // Create the required getter and setter methods.
   // Override toString().
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

class Bus // extends Vehicle implements PassengerList (Make sure Bus implements PassengerList)
{
   // Declare all instance variables according to the Bus UML.
   // Create the constructor using the parameter order in the current Travel document.
   // Create the required getter and setter methods.
   // Implement all methods listed in the PassengerList interface.
   // Override toString() when appropriate.
   // Use your own data in the Driver class.
}

/* This class is worth 35 points out of 100 points. */
class YourChoice // Change the name to the class of your choice
{
   // Your class must extend Vehicle and implement PassengerList.
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
}

class Driver
{
   public static void main(String[] args)
   {
      // Create a Bus object using your own data.
      // Do NOT copy the data from the sample output.

      // Create 10 passengers using your own data.
      // Make sure some passengers have the same last name.

      // Call the methods required by the current Travel document.
      // Demonstrate the Bus toString method.
      // Demonstrate the available-seat calculation.
      // Display passengers with the same last name.
      // Search for a passenger using the current search method/signature.
      // Remove a passenger using the current removal method/signature.
      // Display the updated passenger list.
      // Display the origin and destination using the current methods.

      // Create an object of your transportation class.
      // Add multiple passengers to your transportation object.
      // Demonstrate at least three meaningful operations.
      // Call your unique method.
      // Demonstrate polymorphism using a Vehicle reference.
      // Display the results using your own data.
   }
}
