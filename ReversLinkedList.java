
class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class ReversLinkedList {
    Node head;

    void add(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void reverseNode() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (head.next == null) {
            return;
        }
        Node currNode = head.next;
        Node prev = head;
        while (currNode != null) {
            Node nextNode = currNode.next;
            
            currNode.next = prev;
            prev = currNode;

            currNode = nextNode;
        }
        head.next = null;
        head = prev;
    }

    void prinLinkeList() {

        if (head == null) {
            System.out.println("Linked is empty");
            return;
        }
        if (head.next == null) {
            System.out.println(head.data + "-->");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String arg[]) {
        ReversLinkedList obj = new ReversLinkedList();
        obj.add(90);
        obj.add(34);
        obj.add(90090);
        obj.prinLinkeList();
        System.out.println();
        obj.reverseNode();
        obj.prinLinkeList();
    }
}
