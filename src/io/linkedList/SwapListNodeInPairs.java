package io.linkedList;

public class SwapListNodeInPairs {
    public ListNode swapPairs(ListNode A) {
        if(A==null || A.next == null)
            return A;

        ListNode head = A.next;
        ListNode prev = null;

        while(A!=null && A.next != null) {
            ListNode temp = A.next;
            A.next = A.next.next;
            temp.next = A;

            if(prev != null)
                prev.next = temp;
            prev = A;
            A = A.next;
        }

        return head;
    }

    void printList(ListNode node) {
        while(node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        SwapListNodeInPairs obj = new SwapListNodeInPairs();
        obj.printList(listNode);
        System.out.println();
        obj.printList(obj.swapPairs(listNode));
    }
}
