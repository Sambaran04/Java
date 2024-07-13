public class LinkedList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);
        print(head);
        System.out.println(search(head, 4));
//        delete(head, 3);
//        print(head);
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
    public static void print(Node head){
        while (head!=null){
            System.out.print(head.value+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static int search(Node head, int k){
        Node temp = head;
        while (temp!=null){
            if (temp.value == k){
                return temp.value;
            }
            temp = temp.next;
        }
        return -1;
    }
    public static void delete(Node head, int x){
        if (head==null){
            return;
        } else if (x==1) {
            head = head.next;
            return;
        }
        int count = 0;
        Node temp=head;
        Node prev = null;
        while (temp!=null){
            count++;
            if (count==x){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
    }
}
