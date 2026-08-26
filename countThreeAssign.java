/*
Name: Jude Hommel 
Date: Augest 25th, 2026
Description: Checks if integer array has exactly 3 threes, where no 2 threes are adjacent
Self Grade: 100/100
 */
public class countThreeAssign {
    public static boolean countThree(int[] nums) {
        int numThrees = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 3) {
                numThrees++;

                // Check adjacent threes
                if (i < nums.length-1) {
                    if (nums[i] == nums[i+1]) {
                        return false;
                    }
                }
            }
        }

        if (numThrees == 3) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {3, 1, 3, 1, 3},
            {3, 1, 3, 3},
            {3, 4, 3, 3, 4},
            {1, 3, 1, 3, 1, 2},
            {1, 3, 1, 3, 1, 3},
            {1, 3, 3, 1, 3},
            {1, 3, 1, 3, 1, 3, 4, 3},
            {3, 4, 3, 4, 3, 4, 4},
            {3, 3, 3},
            {1, 3},
            {3},
            {1},
            {3, 3, 1, 3, 1, 3},
            {3, 4, 4, 3, 1, 3},
            {}
        };
        boolean[] expectedResults = { true, false, false, false, true, false, false, true, false, false, false, false, false, true, false};

        for (int i=0; i<testCases.length; i++) {
            if (countThree(testCases[i]) == expectedResults[i]) {
                System.out.println("Test " + (i+1) + " Passed");
            } else {
                System.out.println("Test " + (i+1) + " Failed");
            }
        }
    }
}
