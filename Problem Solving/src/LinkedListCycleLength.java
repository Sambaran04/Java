public class LinkedListCycleLength {
    public int countNodesinLoop(ListNode head) {
        // Add your code here.
        ListNode slow=head;
        ListNode fast=head;
        int count=0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return 0;
        }
        fast=slow.next;
        while(fast!=slow){
            count++;
            fast=fast.next;
        }
        count++;
        return count;
    }
}
