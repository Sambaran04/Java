public class ReverseSLL {
    public ListNode reverseListIteration(ListNode head) {
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }

    public ListNode reverseListRecursion(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode newHead = reverseListRecursion(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next=null;
        return newHead;
    }
}
