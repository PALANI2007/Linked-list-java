 import java.util.*;

public class SearchInLinkedList {
    static class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node head = null, temp = null;

        for (int i = 0; i < n; i++) {
            Node newnode = new Node(sc.nextInt());

            if (head == null) {
                head = temp = newnode;
            } else {
                temp.next = newnode;
                temp = newnode;
            }
        }

        int t = sc.nextInt();

        Node p = head;
        int index = 0;
        boolean found = false;

        while (p != null) {
            if (p.data == t) {
                System.out.print(index);
                found = true;
                break;
            }
            p = p.next;
            index++;
        }

        if (!found) System.out.println("Not found");
    }
}
