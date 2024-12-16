class Solution {
    public ListNode reverseList (ListNode head) {
        ListNode  old = null;
        ListNode current = head ;

        while(current != null){
            ListNode nextNode = current.next;
            current.next = old;
            old = current;
            current = nextNode ;

        }
        return old;

    }
}