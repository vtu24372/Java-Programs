// Node has the information of data and next
class Node {
    int data;
    Node next;

    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
// node is starts with head
class LinkedListsss {
    Node head;

    
    LinkedListsss() {
        this.head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    
    public void insertAtMiddle(int position, int data) {
        if (position < 0) {
            throw new IllegalArgumentException("position cannot be negative");
        }

        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                throw new IllegalArgumentException("position not found");
            }
            current = current.next;
        }

        if (current == null) {
            throw new IllegalArgumentException("position not found");
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class InsertionOps {
    public static void main(String[] args) {
        LinkedListsss list = new LinkedListsss();
        list.insertAtBeginning(10);
        list.insertAtEnd(40);
        list.insertAtMiddle(1, 20);
        list.insertAtMiddle(2, 30);


        list.printList();
    }
}
