package lt.easy.reverse_linked_list_206;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Answer206Test {
    private final Answer206 sut = new Answer206();

    @Test
    void example1() {
        final Answer206.ListNode head = new Answer206.ListNode(1,
                new Answer206.ListNode(2,
                        new Answer206.ListNode(3,
                                new Answer206.ListNode(4,
                                        new Answer206.ListNode(5))
                        ))
        );

        final Answer206.ListNode expect = new Answer206.ListNode(5,
                new Answer206.ListNode(4,
                        new Answer206.ListNode(3,
                                new Answer206.ListNode(2,
                                        new Answer206.ListNode(1))
                        ))
        );

        final Answer206.ListNode actual = sut.reverseList(head);

        Assertions.assertEquals(expect.val, actual.val);
        Assertions.assertEquals(expect.next.val, actual.next.val);
        Assertions.assertEquals(expect.next.next.val, actual.next.next.val);
        Assertions.assertEquals(expect.next.next.next.val, actual.next.next.next.val);
        Assertions.assertEquals(expect.next.next.next.next.val, actual.next.next.next.next.val);
    }

    @Test
    void example2() {
        final Answer206.ListNode head = new Answer206.ListNode(1,
                new Answer206.ListNode(2)
        );

        final Answer206.ListNode expect = new Answer206.ListNode(2,
                new Answer206.ListNode(1)
        );

        final Answer206.ListNode actual = sut.reverseList(head);

        Assertions.assertEquals(expect.val, actual.val);
        Assertions.assertEquals(expect.next.val, actual.next.val);
    }

    @Test
    void example3() {
        final Answer206.ListNode head = new Answer206.ListNode();

        final Answer206.ListNode expect = new Answer206.ListNode();

        final Answer206.ListNode actual = sut.reverseList(head);

        Assertions.assertEquals(expect.val, actual.val);
    }
}