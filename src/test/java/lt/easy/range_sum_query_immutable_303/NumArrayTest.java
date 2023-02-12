package lt.easy.range_sum_query_immutable_303;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumArrayTest {

    @Test
    void example1() {
        final NumArray sut = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});

        int[] expect = {1, -1, -3};

        Assertions.assertArrayEquals(expect, new int[]{sut.sumRange(0, 2), sut.sumRange(2, 5), sut.sumRange(0, 5)});
    }

}