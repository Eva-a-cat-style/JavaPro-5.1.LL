static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
public static ListNode reverseList(ListNode head) {
    ListNode first = null;
    ListNode current = head;

    while (current != null) {
        ListNode next = current.next;
        current.next = first;
        first = current;
        current = next;
    }

    return first;
}

public  void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Input: ");
        printList(head);

        ListNode reversedHead = reverseList(head);

        System.out.println("Output: ");
        printList(reversedHead);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
