package lt.easy.remove_duplicates_from_sorted_array_26;


public class Answer26 {
    public int removeDuplicates(int[] nums) {
        int lastIndex = nums.length;

        for (int index = 0; index < lastIndex; index++) {
            if (index == 0) {
                continue;
            }

            if (nums[index] == nums[index - 1]) {
                int tmp = nums[index];
                for (int idx = index; idx < nums.length; idx++) {
                    if (idx + 1 == nums.length) continue;

                    nums[idx] = nums[idx + 1];
                }
                nums[nums.length - 1] = tmp;
                lastIndex--;
                index--;
            }
        }

        return lastIndex;
    }
}
