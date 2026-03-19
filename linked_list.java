// import java.util.*;

// class Node {
//     int data;
//     Node next;

//     Node(int d) {
//         data = d;
//         next = null;
//     }
// }

// public class linked_list{

//     static Node create(int n, Scanner sc) {
//         Node head = null, temp = null;

//         for (int i = 0; i < n; i++) {
//             Node newNode = new Node(sc.nextInt());

//             if (head == null) {
//                 head = newNode;
//                 temp = newNode;
//             } else {
//                 temp.next = newNode;
//                 temp = newNode;
//             }
//         }
//         return head;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n1 = sc.nextInt();
//         Node head1 = create(n1, sc);

//         int n2 = sc.nextInt();
//         Node head2 = create(n2, sc);

//         Node t1 = head1;
//         boolean found = false;

//         while (t1 != null) {
//             Node t2 = head2;

//             while (t2 != null) {
//                 if (t1.data == t2.data) {
//                     System.out.print(t1.data + " ");
//                     found = true;
//                     break;
//                 }
//                 t2 = t2.next;
//             }

//             t1 = t1.next;
//         }

//         if (!found) {
//             System.out.print("Empty List");
//         }
//     }
// }



// import java.util.*;
// class Node
// {
//     int data;
//     Node next;
//     Node(int d)
//     {
//         this.data=d;
//         this.next=null;
//     }
// }
// public class linked_list{
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int n1=sc.nextInt();
//         Node head1=create(n1, sc);

//         int n2=sc.nextInt();
//         Node head2=create(n2, sc);

//         Node t1=head1;
//         boolean found=false;

//         while (t1!=null) {
//             Node t2=head2;
//             while (t2!=null) {
//                 if(t1.data==t2.data)
//                 {
//                     System.out.print(t1.data+" ");
//                     found=true;
//                     break;
//                 }
//                 t2=t2.next;
//             }
//             t1=t1.next;
//         }

//         if(!found)
//         {
//             System.out.println("Not found");
//         }

//     }

//     static Node create(int n,Scanner sc)
//     {
//         Node head=null,temp=null;

//         for(int i=0;i<n;i++)
//         {
//             Node newnode =new Node(sc.nextInt());

//             if(head==null)
//             {
//                 head=newnode;
//                 temp=newnode;
//             }
//             else{
//                 temp.next=newnode;
//                 temp=newnode;
//             }
//         }
//         return head;
//     }
// }


// import java.util.*;
// public class linked_list{
    
//     public static void main(String args[])
//     {
//         class Node{
//         int data;
//         Node next;
//         Node(int data)
//         {
//             this.data=data;
//             this.next=null;
//         }
//     }
//         Scanner sc =new Scanner(System.in);

//         int n=sc.nextInt();
//         Node head=null,temp=null;
//         for(int i=0;i<n;i++)
//         {
//             Node newnode=new Node(sc.nextInt());
//             if(head==null)
//             {
//                 head=newnode;
//                 temp=newnode;
//             }
//             else{
//                 temp.next=newnode;
//                 temp=newnode;
//             }
//         }
//         int t=sc.nextInt();

//         Node p=head;
//         boolean found=false;
//         int index=0;
//         while (p!=null) {
//             if(t==p.data){
//             System.out.print(index+" ");
//             found=true;
//             break;
//             }
//             p=p.next;
//             index++;
//         }
//         if(!found)
//         {
//             System.out.println("Not found");
//         }

//     }
// }


// import java.util.*;
// class Node 
// {
//   int data;
//   Node next;
//   Node(int data)
//   {
//     this.data = data;
//     this.next = null;
//   }
    
// }
// class Single
// {
//     Node head,tail;
//     void insert(int data)
//     {
//         Node n = new Node(data);
//         if(head==null)
//         {
//             head=tail=n;
//         }
//         else
//         {
//             tail.next = n;
//             tail = n;
//         }
//     }
//     void print()
//     {
//         Node temp = head;
//         while(temp != null)
//         {
//             System.out.print(temp.data);
//             if(temp.next != null)
//             {
//                 System.out.print(" -> ");
//             }
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     void min()
//     {
//         int min=head.data;
//         Node temp=head;
//         while (temp!=null) {
//             if(temp.data<min)
//             {
//                 min=temp.data;
//             }
//             temp=temp.next;
//         }
//         System.out.println("Minimum :"+min);
//     }
//     void max()
//     {
//         int max=head.data;
//         Node temp=head;
//         while (temp!=null) {
//             if(temp.data>max){
//                 max=temp.data;
//             }
//             temp=temp.next;
//         }
//         System.out.print("Maximum :"+max);
//     }
// }
// public  class linked_list 
// {
//     public static void main(String[] args) 
//     {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         Single l = new Single();
//         for(int i = 0;i<n;i++)
//         {
//             l.insert(obj.nextInt());
//         }
//         l.print();
//         l.min();
//         l.max();    
//     }    
// }


// import java.util.*;

// class Node {
//     int data;
//     Node next;

//     Node(int d) {
//         data = d;
//         next = null;
//     }
// }

// public class linked_list{

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         Node head = null, tail = null;

//         // create linked list
//         for(int i = 0; i < n; i++){
//             int x = sc.nextInt();
//             Node newNode = new Node(x);

//             if(head == null){
//                 head = newNode;
//                 tail = newNode;
//             } else {
//                 tail.next = newNode;
//                 tail = newNode;
//             }
//         }

//         Node temp = head;

//         while(temp != null){
//             Node nextNode = temp.next;
//             int ans = 0;

//             while(nextNode != null){
//                 if(nextNode.data > temp.data){
//                     ans = nextNode.data;
//                     break;
//                 }
//                 nextNode = nextNode.next;
//             }

//             System.out.print(ans + " ");
//             temp = temp.next;
//         }
//     }
// }


// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }

// public class linked_list {
//     static Node part(Node head,int x)
//     {
//         Node lesshead=new Node(0);
//         Node greadhead=new Node(0);

//         Node lesstail=lesshead;
//         Node greadtail=greadhead;

//         Node temp=head;
//         while (temp!=null) {
//             if(temp.data<x)
//             {
//                 lesstail.next=temp;
//                 lesstail=lesstail.next;
//             }
//             else{
//                 greadtail.next=temp;
//                 greadtail=greadtail.next;
//             }
//             temp=temp.next;
//         }

//         greadtail.next=null;

//         lesstail.next=greadhead.next;
//         return lesshead.next;
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//          int n=sc.nextInt();

//          Node head=null,tail=null;
//          for(int i=0;i<n;i++)
//          {
//             Node newnode=new Node(sc.nextInt());

//             if(head==null)
//             {
//                 head=tail=newnode;
//             }
//             else{
//                 tail.next=newnode;
//                 tail=newnode;
//             }
//          }
//          int x=sc.nextInt();
//          head=part(head,x);

//          Node temp=head;
//          while (temp!=null) {
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//          }

//     }
// }

// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data)
//     {
//         this.data=data;
//         this.next=null;
//     }
// }

// public class linked_list{

// static void print(Node head){
//     Node temp=head;
//     while (temp!=null) {
//         System.out.print(temp.data+" ");
//         temp=temp.next;
//     }
// }
//     static Node reverse(Node head){
//         Node pre=null,cur=head;
//         while (cur!=null) {
//             Node next=cur.next;
//             cur.next=pre;
//             pre=cur;
//             cur=next;
//         }
//         return pre;
//     }  
//      public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         Node head=null,tail=null;

//         for(int i=0;i<n;i++)
//         {
//             Node newnode =new Node(sc.nextInt());
//             if(head==null)
//             {
//                 head=tail=newnode;
//             }
//             else{
//                 tail.next=newnode;
//                 tail=newnode;
//             }
//         }
//         print(head);
//         Node result =reverse(head);
//         System.out.println();
//         print(result);
//     }

// }



// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int d)
//     {
//         this.data=d;
//         this.next=null;
//     }
// }
// public class linked_list {

//     static Node nthnode(Node head,int nth)
//     {
//         Node dummy=new Node(0);
//         dummy.next=head;

//         Node fast=dummy,slow=dummy;
//         for(int i=0;i<nth;i++)
//         {
//             fast=fast.next;
//         }
//         while (fast.next!=null) {
//             fast=fast.next;
//             slow=slow.next;
//         }
//         slow.next=slow.next.next;
//         return dummy.next;
//     }

//     static void print(Node head)
//     {
//         Node temp=head;
//         while (temp!=null) {
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         Node head=null,tail=null;
//         for(int i=0;i<n;i++)
//         {
//             Node newnode =new Node(sc.nextInt());
//             if(head==null)
//             {
//                 head=tail=newnode;
//             }
//             else{
//                 tail.next=newnode;
//                 tail=newnode;
//             }
//         }
//         int nth=sc.nextInt();

//         head=nthnode(head,nth);
//         print(head);
    
//     }
// }


// import java.util.*;

// class Node{
//     int data;
//     Node next;
//     Node(int data)
//     {
//         this.data=data;
//         this.next=null;
//     }
// }
// public class linked_list {

//     static Boolean palindrom(Node head)
//     {
//         ArrayList<Integer> list =new ArrayList<>();
//         Node temp=head;
//         while (temp!=null) {
//             list.add(temp.data);
//             temp=temp.next;
//         }
//         int left=0;
//         int right=list.size()-1;
//         while (left<right) {
            
//         if(!list.get(left).equals(list.get(right))) return false;
//         left++;
//         right--;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         Node head=null,tail=null;
//         for(int i=0;i<n;i++)
//         {
//             Node newnode=new Node(sc.nextInt());
//             if(head==null)
//             {
//                 head=tail=newnode;
//             }
//             else{
//                 tail.next=newnode;
//                 tail=newnode;
//             }

//         }
//         System.out.print(palindrom(head));
          
//     }
// }