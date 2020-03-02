package medium.add_two_numbers;

import java.util.LinkedList;
import java.util.List;

public class Add_Two_Numbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        List reversedlinkedListL1 = toReverseLinkedList(l1);
        List reversedlinkedListL2 = toReverseLinkedList(l2);


        String combinedString1 = listDigitToString(reversedlinkedListL1);
        String combinedString2 = listDigitToString(reversedlinkedListL2);

        String resultString = String.valueOf(Integer.valueOf(combinedString1) + Integer.valueOf(combinedString2));

        ListNode resultListNode = new ListNode(charToInt(resultString.charAt(resultString.length()-1)));
        resultString = resultString.substring(0, resultString.length()-1);
        recursiveListNode(resultListNode, resultString);

        return resultListNode;
    }

    public Integer charToInt(Character c) {
        return Integer.valueOf(Character.toString(c));
    }

    public ListNode recursiveListNode(ListNode listNode, String resultString) {
        if (resultString.length() > 0) {
            ListNode ls = new ListNode(charToInt(resultString.charAt(resultString.length()-1)));
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
