/*
   DO NOT DELETE THE FOLLOWING COMMENTS
   Name: Jude Hommel
   Description: This program uses inheritance with a general Player class and specific BasketballPlayer and TableTennisPlayer classes. It stores player information and statistics; using getters, setters, and methods to calculate and display player info
   Date: 9-21-2026

   Testimony: Jude Hommel

   You must answer the following questions; otherwise, points will be deducted.

   Additional required code (40 points): Add another relevant sport of your choice to the hierarchy of the classes with an is-a relationship.

   Make sure to answer the following questions clearly to get the 40 points:
   1. What is the name of the sport you selected to add? Table Tennis
   2. What are the attributes that are specific to this sport? (At least 4) wins, losses, isRightHanded, pointsMade
   3. Did you provide a constructor for your class? Yes
   4. Did you provide getters and setters for your class? Yes
   5. Did you provide the toString method and equals method? Yes
   6. Add two methods other than the methods mentioned above to add functionality to the class you created: 
   a. Explain method 1 clearly (Minimum 5 lines of code ,no print/println can be used): winLossRatio() finds the greatest common divisor of the number of wins and number of losses, then divides them by the gcd to get a simplified ratio (if gcd is not 0)
   b. Explain method 2 (Minimum 5 lines of code ,no print/println can be used): winningStatus() returns a String based on whether the player has more wins, more losses, or the same amount
   7. Did you create objects of this class in the main method? yes
   8. Did you call all the methods on the object you created? Yes
   9. Did you display the results of the method calls? Yes
   10. None of the methods can have print/println statements other than the toString method. Ok

   Self-grade: Must be based on the output, requirements, and additional required code. Anything less than 100 must be explained.
   Explanations such as "needs more comments," "needs improvement," or "I think..." are not accepted.
   100/100 If I believed or saw that there was any issues with my code, I would've fixed them, so from my point of view my implementation is perfect

   Comments: Must include comments for every single method.

   Sample output: Ignore the blue line on the right side.
   Your output must be exactly the same line by line, plus the output of the new class you added.


   Calling the toString method
 ***************************************************
 Name: Alex Rodriguez
 Number: 123
 Email: alex@google.com
 Phone: 222-222-2222
 Year hired: 2015
 Games played: 1 Salary: 195000.0
 Minutes played: 20
 Field Goals Made: 0
 Field Goals Attempted: 4
 Assists: 3
 Steals: 5
 Rebounds: 3
 Blocks: 1
 Fouls: 4


 Calling the getter methods
 *********************************************************
 Is Alex Rodriguez fouled out? Alex Rodriguez is not fouled out. He has 4 fouls.
 How old is Alex Rodriguez? Alex Rodriguez is 28 years old.
 Is Alex Rodriguez at the retirement age? Alex Rodriguez is not at the retirement age.
 How many blocks does Alex Rodriguez have? 1
 How many minutes has Alex Rodriguez played? 20
 What is Alex Rodriguez's email address? alex@google.com
 What is Alex Rodriguez's phone number? 222-222-2222
 How many years has Alex Rodriguez played? 10
 How many field goal attempts does Alex Rodriguez have? 4
 How many assists does Alex Rodriguez have? 3

 *************************************************
 Calling the setter methods
 The object has been modified.

Calling the toString method after calling the setter methods
****************************************
Name: Alex Rodriguez
Number: 123
Email: Rod@yahoo.com
Phone: 222-222-2222
Year hired: 2015
Games played: 2 Salary: 195000.0
Minutes played: 20
Field Goals Made: 0
Field Goals Attempted: 4
Assists: 7
Steals: 5
Rebounds: 3
Blocks: 3
Fouls: 7

************************************
Calling the getter methods

Is Alex Rodriguez fouled out? Alex Rodriguez is fouled out. He has 7 fouls.
*/

import java.math.BigInteger;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class SportHommel
{
    // No code here
}


/* Refer to the document for the details */
class Player 
{
    private String playerName;
    private int playerNumber;
    private int playerSalary;
    private int gamesPlayed;
    private String playerEmail;
    private String playerPhone;
    private int birthYear;
    private int joinYear;

    private String playerNickname;
    private String bestAttribute;

    // Creates a Player object with the given player information arguements
    public Player(String playerName, int playerNumber, int playerSalary, int gamesPlayed, String playerEmail,
            String playerPhone, int birthYear, int joinYear, String playerNickname, String bestAttribute) 
    {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        this.playerSalary = playerSalary;
        this.gamesPlayed = gamesPlayed;
        this.playerEmail = playerEmail;
        this.playerPhone = playerPhone;
        this.birthYear = birthYear;
        this.joinYear = joinYear;
        this.playerNickname = playerNickname;
        this.bestAttribute = bestAttribute;
    }

    // Returns name of the player
    public String getPlayerName() 
    {
        return playerName;
    }

    // Returns the player's number on the player's uniform
    public int getPlayerNumber() 
    {
        return playerNumber;
    }

    // Returns the player's yearly salary
    public int getPlayerSalary() 
    {
        return playerSalary;
    }

    // Returns the number of games that the player has played
    public int getGamesPlayed() 
    {
        return gamesPlayed;
    }

    // Returns the player's email address 
    public String getPlayerEmail() 
    {
        return playerEmail;
    }

    // Returns the player's phone number 
    public String getPlayerPhone() 
    {
        return playerPhone;
    }

    // Returns the year the player was born
    public int getBirthYear() 
    {
        return birthYear;
    }

    // Returns the year the player joined the league
    public int getJoinYear() 
    {
        return joinYear;
    }

    // Returns the player's nickname
    public String getPlayerNickname() 
    {
        return playerNickname;
    }

    // Returns the player's best attribute
    public String getBestAttribute() 
    {
        return bestAttribute;
    }

    // Changes the player's name
    public void setPlayerName(String playerName) 
    {
        this.playerName = playerName;
    }

    // Changes the player's number on the player's uniform
    public void setPlayerNumber(int playerNumber) 
    {
        this.playerNumber = playerNumber;
    }

    // Changes the player's yearly salary
    public void setPlayerSalary(int playerSalary) 
    {
        this.playerSalary = playerSalary;
    }

    // Changes the number of games that the player has played
    public void setGamesPlayed(int gamesPlayed) 
    {
        this.gamesPlayed = gamesPlayed;
    }

    // Changes the player's email address
    public void setPlayerEmail(String playerEmail) 
    {
        this.playerEmail = playerEmail;
    }

    // Changes the player's phone number
    public void setPlayerPhone(String playerPhone) 
    {
        this.playerPhone = playerPhone;
    }

    // Changes the year the player was born
    public void setBirthYear(int birthYear) 
    {
        this.birthYear = birthYear;
    }

    // Changes the year the player joined the league
    public void setJoinYear(int joinYear) 
    {
        this.joinYear = joinYear;
    }

    // Changes the player's nickname
    public void setPlayerNickname(String playerNickname) 
    {
        this.playerNickname = playerNickname;
    }

    // Changes the player's best attribute
    public void setBestAttribute(String bestAttribute) 
    {
        this.bestAttribute = bestAttribute;
    }

    // Increases the player's total number of games played by one
    public void totalGamesPlayed() 
    {
        gamesPlayed++;
    }

    // Finds and returns the current calendar year
    public int getCurrentYear() 
    {
        Instant currInstant = Instant.now();
        ZonedDateTime zonedDate = currInstant.atZone(ZoneId.systemDefault());
        int currYear = zonedDate.getYear();
        return currYear;
    }

    // Calculates and returns the number of years the player has played
    public int yearsPlayed() 
    {
        return getCurrentYear() - joinYear;
    }


    // Calculates and returns the player's current age
    public int getAge() 
    {
        return getCurrentYear() - birthYear;
    }

    // Returns a String containing all of the player's information
    public String toString() 
    {
        return String.format(
                "Name: %s%n" +
                "Number: %d%n" +
                "Email: %s%n" +
                "Phone: %s%n" +
                "Year hired: %d%n" +
                "Games played: %d%n" +
                "Salary: %d%n" +
                "Year Born: %d%n" +
                "Nickname: %s%n" +
                "Best Attribute: %s",
                playerName,
                playerNumber,
                playerEmail,
                playerPhone,
                joinYear,
                gamesPlayed,
                playerSalary,
                birthYear,
                playerNickname,
                bestAttribute
                    );
    }
}

/* Refer to the document for the list of methods */
class BasketballPlayer extends Player
{
    private int minutesPlayed;
    private int fieldGoalsMade;
    private int fieldGoalsAttempted;
    private int assistsMade;
    private int stealsMade;
    private int reboundsMade;
    private int blocksMade;
    private int foulsMade;

    // Creates a BasketballPlayer object with the given player information and statistics
    public BasketballPlayer(String playerName, int playerNumber, int playerSalary, int gamesPlayed, String playerEmail,
            String playerPhone, int birthYear, int joinYear, String playerNickname, String bestAttribute, int foulsMade,
            int minutesPlayed, int fieldGoalsMade, int fieldGoalsAttempted, int assistsMade, int stealsMade,
            int reboundsMade, int blocksMade) 
    {
        super(playerName, playerNumber, playerSalary, gamesPlayed, playerEmail, playerPhone, birthYear, joinYear, playerNickname, bestAttribute);
        this.foulsMade = foulsMade;
        this.minutesPlayed = minutesPlayed;
        this.fieldGoalsMade = fieldGoalsMade;
        this.fieldGoalsAttempted = fieldGoalsAttempted;
        this.assistsMade = assistsMade;
        this.stealsMade = stealsMade;
        this.reboundsMade = reboundsMade;
        this.blocksMade = blocksMade;
    }

    // Returns the number of minutes the player has played
    public int getMinutesPlayed() 
    {
        return minutesPlayed;
    }

    // Returns the number of field goals the player has made
    public int getFieldGoalsMade() 
    {
        return fieldGoalsMade;
    }

    // Returns the number of field goals the player has attempted
    public int getFieldGoalsAttempted() 
    {
        return fieldGoalsAttempted;
    }

    // Returns the number of assists the player has made
    public int getAssistsMade() 
    {
        return assistsMade;
    }

    // Returns the number of steals the player has made
    public int getStealsMade() 
    {
        return stealsMade;
    }

    // Returns the number of rebounds the player has made
    public int getReboundsMade() 
    {
        return reboundsMade;
    }

    // Returns the number of blocks the player has made
    public int getBlocksMade() 
    {
        return blocksMade;
    }

    // Returns the number of fouls the player has made
    public int getFoulsMade() 
    {
        return foulsMade;
    }

    // Changes the number of minutes the player has played
    public void setMinutesPlayed(int minutesPlayed) 
    {
        this.minutesPlayed = minutesPlayed;
    }

    // Changes the number of field goals the player has made
    public void setFieldGoalsMade(int fieldGoalsMade) 
    {
        this.fieldGoalsMade = fieldGoalsMade;
    }

    // Changes the number of field goals the player has attempted
    public void setFieldGoalsAttempted(int fieldGoalsAttempted) 
    {
        this.fieldGoalsAttempted = fieldGoalsAttempted;
    }

    // Changes the number of assists the player has made
    public void setAssistsMade(int assistsMade) 
    {
        this.assistsMade = assistsMade;
    }

    // Changes the number of steals the player has made
    public void setStealsMade(int stealsMade) 
    {
        this.stealsMade = stealsMade;
    }

    // Changes the number of rebounds the player has made
    public void setReboundsMade(int reboundsMade) 
    {
        this.reboundsMade = reboundsMade;
    }

    // Changes the number of blocks the player has made
    public void setBlocksMade(int blocksMade) 
    {
        this.blocksMade = blocksMade;
    }

    // Changes the number of fouls the player has made
    public void setFoulsMade(int foulsMade) 
    {
        this.foulsMade = foulsMade;
    }

    // Returns whether the player has reached six or more fouls
    public boolean foulsOut() 
    {
        return foulsMade >= 6;
    }

    // Returns whether the player is older than the retirement age 35
    public boolean retiredAge() 
    {
        return getAge() > 35;
    }

    // Calculates the number of field goals made per minute played
    public double pointsPerMinute() 
    {
        if (minutesPlayed == 0) 
        {
            return 0.0;
        }

        return (double) fieldGoalsMade/minutesPlayed;
    }

    // Returns a String containing the player's information and basketball statistics
    @Override
    public String toString() 
    {
        return String.format(
                "%s%n" +
                "Minutes Played: %d%n" +
                "Field Goals Made: %d%n" +
                "Field Goals Attempted : %d%n" +
                "Assists: %d%n" +
                "Steals: %d%n" +
                "Rebounds: %d%n" +
                "Blocks: %d%n" +
                "Fouls: %d%n",
                super.toString(),
                minutesPlayed,
                fieldGoalsMade,
                fieldGoalsAttempted,
                assistsMade,
                stealsMade,
                reboundsMade,
                blocksMade,
                foulsMade
                );
    }

}

/* This class is worth 40 points of the total grade. Refer to the given requirements. */
class TableTennisPlayer extends Player
{
    private int pointsMade;
    private int wins;
    private int losses;
    private boolean isRightHanded;

    // Creates a TableTennisPlayer object with the given player information and statistics
    public TableTennisPlayer(String playerName, int playerNumber, int playerSalary, int gamesPlayed, String playerEmail,
            String playerPhone, int birthYear, int joinYear, String playerNickname, String bestAttribute,
            int pointsMade, int wins, int losses, boolean isRightHanded) 
    {
        super(playerName, playerNumber, playerSalary, gamesPlayed, playerEmail, playerPhone, birthYear, joinYear, playerNickname, bestAttribute);
        this.pointsMade = pointsMade;
        this.wins = wins;
        this.losses = losses;
        this.isRightHanded = isRightHanded;
    }

    // Returns the number of points made by the player
    public int getPointsMade() 
    {
        return pointsMade;
    }

    // Returns the number of games won by the player
    public int getWins() 
    {
        return wins;
    }

    // Returns the number of games lost by the player
    public int getLosses() 
    {
        return losses;
    }

    // Returns whether the player is right handed
    public boolean isRightHanded() 
    {
        return isRightHanded;
    }

    // Changes the number of points made by the player
    public void setPointsMade(int pointsMade) 
    {
        this.pointsMade = pointsMade;
    }

    // Changes the number of games won by the player
    public void setWins(int wins) 
    {
        this.wins = wins;
    }

    // Changes the number of games lost by the player
    public void setLosses(int losses) 
    {
        this.losses = losses;
    }

    // Changes whether the player is right handed
    public void setRightHanded(boolean isRightHanded) 
    {
        this.isRightHanded = isRightHanded;
    }

    // Returns a String containing the player's information and table tennis statistics
    @Override
    public String toString() 
    {
        return String.format(
                "%s%n" +
                "Points Made: %d%n" +
                "Number of Wins: %d%n" +
                "Number of Losses: %d%n" +
                "%s is right handed: %b%n",
                super.toString(),
                pointsMade,
                wins,
                losses,
                getPlayerName(),
                isRightHanded
                );
    }

    // Compares this player with another object to determine if their table tennis statistics are equal
    public boolean equals(Object obj) 
    {
        if (!(obj instanceof TableTennisPlayer)) 
        {
            return false;
        }
        TableTennisPlayer other = (TableTennisPlayer) obj;
        if (pointsMade != other.pointsMade)
            return false;
        if (wins != other.wins)
            return false;
        if (losses != other.losses)
            return false;
        if (isRightHanded != other.isRightHanded)
            return false;
        return true;
    }

    // Determines whether the player has a winning, losing, or even record
    public String winningStatus()
    {
        if (wins > losses)
        {
            return "Winning record";
        }

        if (wins < losses)
        {
            return "Losing record";
        }

        return "Even record";
    }

    // Simplifies the player's wins and losses into a reduced ratio
    public String winLossRatio() 
    {
        int simplifiedWins = wins;
        int simplifiedLosses = losses;

        int gcd = BigInteger.valueOf(simplifiedWins).gcd(BigInteger.valueOf(simplifiedLosses)).intValue();
        if (gcd != 0) {
            simplifiedWins /= gcd;
            simplifiedLosses /= gcd;
        }

        return simplifiedWins + " : " + simplifiedLosses;
    }
}

/*
   In the main method, create one object of BasketballPlayer.
   Call the proper methods to generate the required output.
   */
class Driver
{   
    private static void printBasketballGetters(BasketballPlayer player) 
    {
        System.out.print("How many minutes has " + player.getPlayerName() + " played? ");
        System.out.println(player.getPlayerName() + " has played " + player.getMinutesPlayed() + " minutes");

        System.out.print("How many field goals has " + player.getPlayerName() + " made? ");
        System.out.println(player.getPlayerName() + " has made " + player.getFieldGoalsMade() + " field goals");

        System.out.print("How many field goals has " + player.getPlayerName() + " attempted? ");
        System.out.println(player.getPlayerName() + " has attempted " + player.getFieldGoalsAttempted() + " field goals");

        System.out.print("How many assists has " + player.getPlayerName() + " made? ");
        System.out.println(player.getPlayerName() + " has made " + player.getAssistsMade() + " assists");

        System.out.print("How many steals has " + player.getPlayerName() + " made? ");
        System.out.println(player.getPlayerName() + " has made " + player.getStealsMade() + " steals");

        System.out.print("How many rebounds has " + player.getPlayerName() + " made? ");
        System.out.println(player.getPlayerName() + " has made " + player.getReboundsMade() + " rebounds");

        System.out.print("How many blocks has " + player.getPlayerName() + " made? ");
        System.out.println(player.getPlayerName() + " has made " + player.getBlocksMade() + " blocks");

        System.out.print("How many fouls has " + player.getPlayerName() + " made? ");
        System.out.println(player.getPlayerName() + " has made " + player.getFoulsMade() + " fouls");

        System.out.print("Has " + player.getPlayerName() + " fouled out? ");
        System.out.println(player.foulsOut() ? "Yes" : "No");

        System.out.print("Has " + player.getPlayerName() + " retired due to age? ");
        System.out.println(player.retiredAge() ? "Yes" : "No");

        System.out.print("What is " + player.getPlayerName() + "'s points per minute? ");
        System.out.println(player.pointsPerMinute());
        System.out.println();
    }

    private static void setBasketballValues(BasketballPlayer player) 
    {
        player.setMinutesPlayed(11111);
        player.setFieldGoalsMade(22222);
        player.setFieldGoalsAttempted(333333);
        player.setAssistsMade(444444);
        player.setStealsMade(555555);
        player.setReboundsMade(666666);
        player.setBlocksMade(777777);
        player.setFoulsMade(888888);
        System.out.println("The object has been modified.");
        System.out.println();
    }

    private static void printTableTennisGetters(TableTennisPlayer player) 
    {
        System.out.print("How many points has " + player.getPlayerName() + " made? ");
        System.out.println(player.getPlayerName() + " has made " + player.getPointsMade() + " points");

        System.out.print("How many wins does " + player.getPlayerName() + " have? ");
        System.out.println(player.getPlayerName() + " has " + player.getWins() + " wins");

        System.out.print("How many losses does " + player.getPlayerName() + " have? ");
        System.out.println(player.getPlayerName() + " has " + player.getLosses() + " losses");

        System.out.print("Is " + player.getPlayerName() + " right handed? ");
        System.out.println(player.isRightHanded() ? "Yes" : "No");

        System.out.print("How many games has " + player.getPlayerName() + " played? ");
        System.out.println(player.getPlayerName() + " has played " + player.getGamesPlayed() + " games");

        System.out.print("What is " + player.getPlayerName() + "'s winning status? ");
        System.out.println(player.winningStatus());

        System.out.print("What is " + player.getPlayerName() + "'s win-loss ratio? ");
        System.out.println(player.winLossRatio());
        System.out.println();
    }

    private static void setTableTennisValues(TableTennisPlayer player) 
    {
        player.setPointsMade(11111);
        player.setWins(22222);
        player.setLosses(33333);
        player.setRightHanded(true);

        System.out.println("The object has been modified.");
        System.out.println();
    }

    public static void main(String[] args)
    {
        // ***********************
        // Basketball Player
        // ***********************
        BasketballPlayer bBallPlayer = new BasketballPlayer("Ben Jamin", 1, 1000000, 100, "ben@gmail.com", "(111) 111-1111", 1999, 2018, "Big Ben", "Dunking", 50, 1000, 80, 200, 200, 60, 60, 70);

        // toString
        System.out.println("Calling the toString method");
        System.out.println("***************************************************");
        System.out.println(bBallPlayer.toString());

        // Getters
        System.out.println("Calling the getter methods");
        System.out.println("***************************************************");
        printBasketballGetters(bBallPlayer);

        // Setters
        System.out.println("Calling the setter methods");
        System.out.println("***************************************************");
        setBasketballValues(bBallPlayer);

        // toString
        System.out.println("Calling the toString method after calling the setter methods");
        System.out.println("***************************************************");
        System.out.println(bBallPlayer.toString());

        // Getters
        System.out.println("Calling the getter methods");
        System.out.println("***************************************************");
        printBasketballGetters(bBallPlayer);

        // ***********************
        // Tennis Player
        // ***********************
        TableTennisPlayer ttPlayer = new TableTennisPlayer("Harriet Janis", 58, 200000, 100, "harry@gmail.com", "(888) 888-8888", 1997, 2017, "Harry Jane", "Hair", 120, 60, 40, false);

        // toString
        System.out.println("Calling the toString method");
        System.out.println("***************************************************");
        System.out.println(ttPlayer.toString());

        // Getters
        System.out.println("Calling the getter methods");
        System.out.println("***************************************************");
        printTableTennisGetters(ttPlayer);

        // Setters
        System.out.println("Calling the setter methods");
        System.out.println("***************************************************");
        setTableTennisValues(ttPlayer);

        // toString
        System.out.println("Calling the toString method after calling the setter methods");
        System.out.println("***************************************************");
        System.out.println(ttPlayer.toString());

        // Getters
        System.out.println("Calling the getter methods");
        System.out.println("***************************************************");
        printTableTennisGetters(ttPlayer);
    }          
}
