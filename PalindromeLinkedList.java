import java.util.*;

public class PalindromeLinkedList {
    static class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

    static boolean isPalindrome(Node head) {

        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;

        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        int l = 0, r = list.size() - 1;

        while (l < r) {
            if (!list.get(l).equals(list.get(r))) return false;
            l++;
            r--;
        }
        return true;
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

        System.out.print(isPalindrome(head));
    }
}