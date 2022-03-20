package io.linkedList;

public class MergeTwoSortedLIst {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode resultNode = new ListNode(-1);
        ListNode currentNode = resultNode;

        while(A!=null || B!=null) {
            int temp;
            if(A!=null && B!=null) {
                if (A.val < B.val) {
                    temp = A.val;
                    A = A.next;
                } else {
                    temp = B.val;
                    B = B.next;
                }
            } else if(A!=null) {
                temp = A.val;
                A = A.next;
            } else {
                temp = B.val;
                B = B.next;
            }
            currentNode.next = new ListNode(temp);
            currentNode = currentNode.next;
        }
        return resultNode;
    }

    void printList(ListNode node) {
        while(node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ListNode listNodeA = new ListNode(1);
        listNodeA.next = new ListNode(3);
        listNodeA.next.next = new ListNode(5);
        listNodeA.next.next.next = new ListNode(7);
        listNodeA.next.next.next.next = new ListNode(9);

        ListNode listNodeB = new ListNode(0);
        listNodeB.next = new ListNode(2);
        listNodeB.next.next = new ListNode(4);
        listNodeB.next.next.next = new ListNode(6);
        listNodeB.next.next.next.next = new ListNode(8);

        MergeTwoSortedLIst obj = new MergeTwoSortedLIst();
        obj.printList(listNodeA);
        System.out.println();
        obj.printList(listNodeB);
        System.out.println();

        obj.printList(obj.mergeTwoLists(listNodeA,listNodeB));
    }
}
