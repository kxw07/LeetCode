package lt.easy.remove_duplicates_from_sorted_array_26;


public class Answer26 {
    public int removeDuplicates(int[] nums) {
        int nonDuplicatedNumIndex = 1;

        for (int idx = 0; idx < nums.length - 1; idx++) {
            if (nums[idx] < nums[idx + 1]) {
                nums[nonDuplicatedNumIndex] = nums[idx + 1];
                nonDuplicatedNumIndex++;
            }
        }

        return nonDuplicatedNumIndex;
    }
}
