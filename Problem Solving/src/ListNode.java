public class ListNode {
    int data;
    ListNode prev, next;
    public ListNode(int data) {
        this.data=data;
        this.prev=null;
        this.next=null;
    }

    public ListNode(int data, ListNode prev, ListNode next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
