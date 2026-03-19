import java.util.*;

public class RemoveNthFromEnd {
    
static class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

    static Node removeNth(Node head, int n) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy, slow = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            Node newnode = new Node(sc.nextInt());

            if (head == null) head = tail = newnode;
            else {
                tail.next = newnode;
                tail = newnode;
            }
        }

        int k = sc.nextInt();

        head = removeNth(head, k);
        print(head);
    }
}