package medium.add_two_numbers;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Add_Two_Numbers {

    public ListNode improveAddTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);

        ListNode a = l1, b = l2, curr = result;
        int carry = 0;

        System.out.println("result :"+result);
        System.out.println("curr :"+curr);

        while (a != null || b != null) {
            int x = (a != null)?a.val:0;
            int y = (a != null)?b.val:0;
            int sum = x + y + carry;

            System.out.printf("%d, %d, %d, %d",x, y, carry, sum);
            System.out.println();

            System.out.println("before curr :"+curr);
            System.out.println("before curr :.next:"+curr.next);

            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            System.out.println("after curr :"+curr);
            System.out.println("after curr.next :"+curr.next);

            System.out.printf("%d", carry);
            System.out.println();

            if(a != null)a = a.next;
            if(b != null)b = b.next;
        }

        return result.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        List reversedlinkedListL1 = toReverseLinkedList(l1);
        List reversedlinkedListL2 = toReverseLinkedList(l2);

        String combinedString1 = listDigitToString(reversedlinkedListL1);
        String combinedString2 = listDigitToString(reversedlinkedListL2);

        String resultString = new BigDecimal(combinedString1).add(new BigDecimal(combinedString2)).toString();

        ListNode resultListNode = new ListNode(charToInt(getLastChar(resultString)));
        resultString = resultString.substring(0, resultString.length()-1);
        recursiveListNode(resultListNode, resultString);

        return resultListNode;
    }

    public Character getLastChar(String string) {
        return string.charAt(string.length()-1);
    }

    public Integer charToInt(Character c) {
        return Integer.valueOf(Character.toString(c));
    }

    public ListNode recursiveListNode(ListNode listNode, String resultString) {
        if (resultString.length() > 0) {
            ListNode ls = new ListNode(charToInt(getLastChar(resultString)));
            listNode.next = ls;

            resultString = resultString.substring(0, resultString.length()-1);

            return recursiveListNode(ls, resultString);
        } else {
            return listNode;
        }
    }

    public LinkedList toReverseLinkedList(ListNode listnode) {
        LinkedList linkedList = new LinkedList();
        do {
            linkedList.add(0, listnode.val);
            listnode = listnode.next;
        } while (listnode != null);

        return linkedList;
    }

    public String listDigitToString(List list) {
        String combinedString = "";
        for (int idx=0; idx<list.size(); idx++) {
            combinedString += list.get(idx).toString();
        }

        return combinedString;
    }
}
