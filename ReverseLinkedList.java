import java.util.*;

public class ReverseLinkedList {

    static class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

}
    static Node reverse(Node head) {
        Node prev = null, curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
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

        head = reverse(head);
        print(head);
    }
}