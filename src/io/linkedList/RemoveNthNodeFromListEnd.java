package io.linkedList;

public class RemoveNthNodeFromListEnd {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        if(A==null)
            return A;

        ListNode curr = A;
        int size = 0;

        while (curr!=null) {
            curr = curr.next;
            size++;
        }

        if(B >= size)
            return A.next;

        curr = A;
        for(int i=1;i<size-B;i++)
            curr = curr.next;

        curr.next = curr.next.next;

        return A;
    }

    void printList(ListNode node) {
        while(node!=null) {
            System.out.print(node.val);
            if(node.next!=null)
                System.out.print(" -> ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        RemoveNthNodeFromListEnd obj = new RemoveNthNodeFromListEnd();
//        obj.printList(listNode);
        obj.printList(obj.removeNthFromEnd(listNode, 2));
    }
}

