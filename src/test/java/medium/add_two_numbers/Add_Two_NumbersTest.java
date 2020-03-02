package medium.add_two_numbers;

import org.junit.Assert;
import org.junit.Test;

public class Add_Two_NumbersTest {

    @Test
    public void Test_Add_Two_NumbersTest() {
        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);

        ListNode listNode2 = new ListNode(5);
        listNode1.next = new ListNode(6);
        listNode1.next.next = new ListNode(4);

        Add_Two_Numbers a = new Add_Two_Numbers();
        ListNode actual = a.addTwoNumbers(listNode1, listNode2);

        Assert.assertEquals(7, actual.val);
        Assert.assertEquals(0, actual.next.val);
        Assert.assertEquals(8, actual.next.next.val);
    }
}
