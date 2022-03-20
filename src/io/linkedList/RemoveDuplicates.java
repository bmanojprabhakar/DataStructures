package io.linkedList;

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode curr = A;

        while(curr != null) {
            int val = curr.val;
            ListNode temp = curr;
            while(temp!=null && temp.val==val) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
        return A;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);

        RemoveDuplicates obj = new RemoveDuplicates();
        ListNode result = obj.deleteDuplicates(listNode);

        while(result!=null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
