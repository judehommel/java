public class arrayLoop {
    public static boolean method(int[] nums) {
        boolean[] isIndexVisited = new boolean[nums.length];
        int i=0;

        while (nums[i] != -1) {
            if (isIndexVisited[i]) {
                return false;
            }
            isIndexVisited[i] = true;
            i = nums[i];
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {3, 2, 5, 1, -1, 4},
            {3, 2, 0, 1, -1, 4},
            {0},
            {1, 0},
            {1,-1},
            {-1},
            {5, 1, 1, 1, 1, -1},
        };
        boolean[] expectedResults = { true, false, false, false, true, true, true };

        for (int i=0; i<testCases.length; i++) {
            if (method(testCases[i]) == expectedResults[i]) {
                System.out.println("Test " + (i+1) + " Passed");
            } else {
                System.out.println("Test " + (i+1) + " Failed");
            }
        }
    }
}
