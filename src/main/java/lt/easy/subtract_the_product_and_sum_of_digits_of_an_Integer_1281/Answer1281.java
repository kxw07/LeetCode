package lt.easy.subtract_the_product_and_sum_of_digits_of_an_Integer_1281;

import java.util.concurrent.atomic.AtomicInteger;

public class Answer1281 {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        for (String s : String.valueOf(n).split("")) {
            int num = Integer.valueOf(s);
            sum += num;
            product *= num;
        }

        return product - sum;
    }
}
