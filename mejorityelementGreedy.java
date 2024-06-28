package DSA2.Array;

public class mejorityelementGreedy {
    public static int findMajorityElement(int[] nums) {
        int candidate = findCandidate(nums);
        return isMajority(nums, candidate) ? candidate : -1;
    }

    // Function to find the candidate for Majority
    private static int findCandidate(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    // Function to verify if the candidate is actually the majority element
    private static boolean isMajority(int[] nums, int candidate) {
        int count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        return count > nums.length / 2;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int majorityElement = findMajorityElement(nums);
        if (majorityElement != -1) {
            System.out.println("The majority element is: " + majorityElement);
        } else {
            System.out.println("No majority element found.");
        }
    }
}
