import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1,2};
        Node head = constructLL(arr);
        System.out.println(middleNode(head));
    }
    public static Node constructLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1; i<arr.length; i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    public static int middleNode(Node head) {
        Node temp = head;
        Node ans = head;
        int count=1;
        int mid=0;
        while(temp.next!=null){
            count++;
            temp = temp.next;
        }
//        return count;
        temp = head;
        mid = (count/2)+1;
        count=1;
        while(temp.next!=null){
            count++;
            if(count == mid){
                ans = temp;
                break;
            }
            temp = temp.next;
        }
        return mid;
    }
}
