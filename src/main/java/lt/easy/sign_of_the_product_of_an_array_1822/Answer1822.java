package lt.easy.sign_of_the_product_of_an_array_1822;

import java.util.Arrays;

public class Answer1822 {
    public int arraySign(int[] nums) {
        if (Arrays.stream(nums).anyMatch(num -> num == 0)) {
            return 0;
        }

        return Arrays.stream(nums).filter(num -> num < 0).count() % 2 == 0 ? 1 : -1;
    }
}
