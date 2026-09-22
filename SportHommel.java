/*
   DO NOT DELETE THE FOLLOWING COMMENTS
   Name: Jude Hommel
   Description:
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
   a. Explain method 1 clearly (Minimum 5 lines of code ,no print/println can be used): 
   b. Explain method 2 (Minimum 5 lines of code ,no print/println can be used):
   7. Did you create objects of this class in the main method? yes
   8. Did you call all the methods on the object you created? Yes
   9. Did you display the results of the method calls? Yes
   10. None of the methods can have print/println statements other than the toString method. Ok

   Self-grade: Must be based on the output, requirements, and additional required code. Anything less than 100 must be explained.
   Explanations such as "needs more comments," "needs improvement," or "I think..." are not accepted.

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

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class SportHommel
{
    // No code here
}


/* Refer to the document for the details */
class Player {
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

    public Player(String playerName, int playerNumber, int playerSalary, int gamesPlayed, String playerEmail,
            String playerPhone, int birthYear, int joinYear, String playerNickname, String bestAttribute) {
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

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int getPlayerSalary() {
        return playerSalary;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public String getPlayerEmail() {
        return playerEmail;
    }

    public String getPlayerPhone() {
        return playerPhone;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getJoinYear() {
        return joinYear;
    }

    public String getPlayerNickname() {
        return playerNickname;
    }

    public String getBestAtrribute() {
        return bestAttribute;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public void setPlayerSalary(int playerSalary) {
        this.playerSalary = playerSalary;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public void setPlayerEmail(String playerEmail) {
        this.playerEmail = playerEmail;
    }

    public void setPlayerPhone(String playerPhone) {
        this.playerPhone = playerPhone;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setJoinYear(int joinYear) {
        this.joinYear = joinYear;
    }

    public void setPlayerNickname(String playerNickname) {
        this.playerNickname = playerNickname;
    }

    public void setBestAtrribute(String bestAttribute) {
        this.bestAttribute = bestAttribute;
    }

    public void totalGamesPlayed() {
        gamesPlayed++;
    }

    public int getCurrentYear() {
        Instant currInstant = Instant.now();
        ZonedDateTime zonedDate = currInstant.atZone(ZoneId.systemDefault());
        int currYear = zonedDate.getYear();
        return currYear;
    }

    public int yearsPlayed() {
        return getCurrentYear() - joinYear;
    }

    public int getAge() {
        return getCurrentYear() - birthYear;
    }

    public String toString() {
        return String.format(
                "Name: %s%n" +
                "Number: %n%n" +
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

    public BasketballPlayer(String playerName, int playerNumber, int playerSalary, int gamesPlayed, String playerEmail,
            String playerPhone, int birthYear, int joinYear, String playerNickname, String bestAttribute, int foulsMade,
            int minutesPlayed, int fieldGoalsMade, int fieldGoalsAttempted, int assistsMade, int stealsMade,
            int reboundsMade, int blocksMade) {
        super(playerName, playerNumber, playerSalary, gamesPlayed, playerEmail, playerPhone, birthYear, joinYear,
                playerNickname, bestAttribute);
        this.foulsMade = foulsMade;
        this.minutesPlayed = minutesPlayed;
        this.fieldGoalsMade = fieldGoalsMade;
        this.fieldGoalsAttempted = fieldGoalsAttempted;
        this.assistsMade = assistsMade;
        this.stealsMade = stealsMade;
        this.reboundsMade = reboundsMade;
        this.blocksMade = blocksMade;
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    public int getFieldGoalsMade() {
        return fieldGoalsMade;
    }

    public int getFieldGoalsAttempted() {
        return fieldGoalsAttempted;
    }

    public int getAssistsMade() {
        return assistsMade;
    }

    public int getStealsMade() {
        return stealsMade;
    }

    public int getReboundsMade() {
        return reboundsMade;
    }

    public int getBlocksMade() {
        return blocksMade;
    }

    public int getFoulsMade() {
        return foulsMade;
    }

    public void setMinutesPlayed(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public void setFieldGoalsMade(int fieldGoalsMade) {
        this.fieldGoalsMade = fieldGoalsMade;
    }

    public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
        this.fieldGoalsAttempted = fieldGoalsAttempted;
    }

    public void setAssistsMade(int assistsMade) {
        this.assistsMade = assistsMade;
    }

    public void setStealsMade(int stealsMade) {
        this.stealsMade = stealsMade;
    }

    public void setReboundsMade(int reboundsMade) {
        this.reboundsMade = reboundsMade;
    }

    public void setBlocksMade(int blocksMade) {
        this.blocksMade = blocksMade;
    }

    public void setFoulsMade(int foulsMade) {
        this.foulsMade = foulsMade;
    }

    public boolean foulsOut() {
        return foulsMade >= 6;
    }

    public boolean retiredAge() {
        return getAge() > 35;
    }

    public double pointsPerMinute() {
        if (minutesPlayed == 0) {
            return 0.0;
        }

        return (double) fieldGoalsMade/minutesPlayed;
    }

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
    public String toString() {
        return String.format(
                "%s%n" +
                "Minutes Played: %d%n",
                "Field Goals Made: %d%n",
                "Field Goals Attempted : %d%n",
                "Assists: %b%n",
                super.toString(),
                pointsMade,
                wins,
                losses,
                getPlayerName(),
                isRightHanded
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

    public TableTennisPlayer(String playerName, int playerNumber, int playerSalary, int gamesPlayed, String playerEmail,
			String playerPhone, int birthYear, int joinYear, String playerNickname, String bestAttribute,
			int pointsMade, int wins, int losses, boolean isRightHanded) {
		super(playerName, playerNumber, playerSalary, gamesPlayed, playerEmail, playerPhone, birthYear, joinYear,
				playerNickname, bestAttribute);
		this.pointsMade = pointsMade;
		this.wins = wins;
		this.losses = losses;
		this.isRightHanded = isRightHanded;
	}

	public int getPointsMade() {
		return pointsMade;
	}

	public int getWins() {
		return wins;
	}

	public int getLosses() {
		return losses;
	}

	public boolean isRightHanded() {
		return isRightHanded;
	}

	public void setPointsMade(int pointsMade) {
		this.pointsMade = pointsMade;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public void setRightHanded(boolean isRightHanded) {
		this.isRightHanded = isRightHanded;
	}

    public String toString() {
        return String.format(
                "%s%n" +
                "Points Made: %d%n",
                "Number of Wins: %d%n",
                "Number of Losses: %d%n",
                "Is %s right handed: %b%n",
                super.toString(),
                pointsMade,
                wins,
                losses,
                getPlayerName(),
                isRightHanded
        );
    }

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
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

	public double pointsPerGame() {
        return (double) pointsMade / getGamesPlayed();
    }

    public double winLossRatio() {
        return (double) wins / losses;
    }
}

/*
   In the main method, create one object of BasketballPlayer.
   Call the proper methods to generate the required output.
   */
class Driver
{   
    public static void main(String[] args)
    {
        BasketballPlayer bBallPlayer = new BasketballPlayer("Ben Jamin", 1, 1000000, 100, "ben@gmail.com", "(111) 111-1111", 1999, 2018, "Big Ben", "Dunking", 50, 1000, 80, 200, 200, 60, 60, 70);

        // TODO: Call every bBallPlayer method 
        // toString
        System.out.println(bBallPlayer.toString());
        // Getters
        // Setters
        // toString
        // Getters

        TableTennisPlayer tennisPlayer = new TableTennisPlayer("Harriet Janis", 58, 200000, 100, "harry@gmail.com", "(888) 888-8888", 1997, 2017, "Harry Jane", "Hair", 120, 60, 40, false);

        System.out.println(tennisPlayer.toString());
        // TODO: Call every tennis method 
    }          
}
