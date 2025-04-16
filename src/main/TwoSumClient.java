package main;

public class TwoSumClient {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};  // Example array
        int target = 9;               // Example target

        // Create the server object
        TwoSumServer server = new TwoSumServer();

        // Call the remote method on the server (twoSum)
        int[] result = server.twoSum(nums, target);

        // Display the result
        if (result != null) {
            System.out.println("Indices: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
