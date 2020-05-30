package leetcode;
/*
 * @USER JungHyun
 * @DATE 2020-05-30
 * @DESCRIPTION
 */

import java.util.Objects;

public class Question2 {
    private class ListNode {
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //tc : o(max(m,n))
        //sc : o(max(m,n))
        ListNode head = new ListNode(0, null);
        ListNode currentNode = head;
        int carry = 0;
        while (Objects.nonNull(l1) || Objects.nonNull(l2)) {
            boolean l1NonNull = Objects.nonNull(l1);
            boolean l2NonNull = Objects.nonNull(l2);
            int val = carry;
            if (l1NonNull) {
                val += l1.val;
            }
            if (l2NonNull) {
                val += l2.val;
            }
            currentNode = currentNode.next = new ListNode(val % 10);
            carry = val / 10;
            if (l1NonNull) {
                l1 = l1.next;
            }
            if (l2NonNull) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            currentNode.next = new ListNode(carry);
        }
        return head.next;
    }
}
