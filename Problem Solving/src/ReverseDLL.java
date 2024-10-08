public class ReverseDLL {
    public static ListNode reverseDLL(ListNode head) {
        ListNode temp=null;
        ListNode current=head;
        while(current!=null){
            temp = current.prev;
            current.prev=current.next;
            current.next=temp;
            current = current.prev;
        }
        if (temp!=null){
            head=temp.prev;
        }
        return head;
    }
}
