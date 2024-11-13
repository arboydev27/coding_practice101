import java.util.List;
import java.util.ArrayList;

/**
 * There are n kids with candies. You are given an integer array 'candies', where each candies[i] represents the 
 * number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, 
 * they will have the greatest number of candies among all the kids, or false otherwise.
 * Note that multiple kids can have the greatest number of candies.
 */

public class KidWithTheGreatestNumberOfCandies {

    // Method to determine if each kid can have the most candies by adding extraCandies
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        // Find the greatest number of candies currently held by any kid
        int greatestCurrentCandies = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > greatestCurrentCandies) {
                greatestCurrentCandies = candies[i];
            }
        }
        
        // Add extraCandies to each kid's current candy count
        for (int i = 0; i < candies.length; i++) {
            candies[i] += extraCandies;
        }

        // Create a list to store boolean results for each kid
        List<Boolean> result = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            // Check if the current candy count is at least as much as the greatestCurrentCandies
            if (candies[i] >= greatestCurrentCandies) {
                result.add(i, true); // Kid can have the most candies
            } else {
                result.add(i, false); // Kid cannot have the most candies
            }
        }

        return result; // Return the list of boolean results
    }

    public static void main(String[] args) {
        // Test Case 1:
        int[] candies1 = {2, 3, 5, 1, 3};
        int extraCandies1 = 3;
        System.out.println("[2, 3, 5, 1, 3] result: " + kidsWithCandies(candies1, extraCandies1).toString());

        // Test Case 2:
        int[] candies2 = {4, 2, 1, 1, 2};
        int extraCandies2 = 1;
        System.out.println("[4, 2, 1, 1, 2] result: " + kidsWithCandies(candies2, extraCandies2).toString());

        // Test Case 3:
        int[] candies3 = {12, 1, 12};
        int extraCandies3 = 10;
        System.out.println("[12, 1, 12] result: " + kidsWithCandies(candies3, extraCandies3).toString());
    }
}
