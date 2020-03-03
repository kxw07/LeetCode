package medium.add_two_numbers;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Add_Two_Numbers {

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
