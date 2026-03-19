import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class IntersectionLinkedList {

    static Node create(int n, Scanner sc) {
        Node head = null, temp = null;

        for (int i = 0; i < n; i++) {
            Node newNode = new Node(sc.nextInt());

            if (head == null) {
                head = temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        Node head1 = create(n1, sc);

        int n2 = sc.nextInt();
        Node head2 = create(n2, sc);

        Node t1 = head1;
        boolean found = false;

        while (t1 != null) {
            Node t2 = head2;

            while (t2 != null) {
                if (t1.data == t2.data) {
                    System.out.print(t1.data + " ");
                    found = true;
                    break;
                }
                t2 = t2.next;
            }
            t1 = t1.next;
        }

        if (!found) System.out.print("Empty List");
    }
}