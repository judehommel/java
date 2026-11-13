import java.util.ArrayList;

class Food 
{
    private static ArrayList<Food> foodLog = new ArrayList<Food>();
    private static int caloricTarget = 3000;

    private String foodName;
    private int calories;
    private int servingSize;
    // Macronutrients
    private int carbs;
    private int proteins;
    private int fat;

	public Food(String foodName, int calories, int servingSize, int carbs, int proteins, int fat) 
    {
		this.foodName = foodName;
		this.calories = calories;
		this.servingSize = servingSize;
		this.carbs = carbs;
		this.proteins = proteins;
		this.fat = fat;
	}

    public void logFood() 
    {
        foodLog.add(this);
    }

    public void adjustServingSize(double multiplier) 
    {
        servingSize *= multiplier;
    }

    public void previewFood() 
    {
        int caloriesLeft = caloricTarget;
        int totalCarbs = 0;
        int totalProteins = 0;
        int totalFats = 0;

        for (int i = 0; i < foodLog.size(); i++) 
        {
            caloriesLeft -= foodLog.get(i).calories;
            totalCarbs += foodLog.get(i).carbs;
            totalProteins += foodLog.get(i).proteins;
            totalFats += foodLog.get(i).fat;
        }

        System.out.println("Calories Left: " + caloriesLeft);
        System.out.println("Current carbs consumed today: " + totalCarbs);
        System.out.println("This food increases carbs by: " + this.carbs);
        System.out.println("Current proteins consumed today: " + totalProteins);
        System.out.println("This food increases proteins by: " + this.proteins);
        System.out.println("Current fats consumed today: " + totalFats);
        System.out.println("This food increases fat by: " + this.fat);
    }
}

