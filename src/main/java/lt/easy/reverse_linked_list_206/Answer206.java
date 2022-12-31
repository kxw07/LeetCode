package lt.easy.reverse_linked_list_206;

import java.util.ArrayList;
import java.util.List;

public class Answer206 {
    public ListNode reverseList(ListNode head) {
        try {
            if (head.next == null) return head;
        } catch (NullPointerException e) {
            return head;
        }

        List<ListNode> nodeList = new ArrayList<>();
        getNodeReversedList(head, nodeList);

        for (int idx = 0; idx < nodeList.size(); idx++) {
            if (idx + 1 == nodeList.size()) {
                nodeList.get(idx).next = null;
                break;
            }

            nodeList.get(idx).next = nodeList.get(idx + 1);
        }

        return nodeList.get(0);
    }

    public void getNodeReversedList(ListNode node, List<ListNode> list) {
        try {
            if (node.next == null) {
                list.add(node);
                return;
            }
        } catch (NullPointerException e) {
            list.add(node);
            return;
        }

        getNodeReversedList(node.next, list);
        list.add(node);
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

