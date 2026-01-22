class Node {
    int data;
    Node next;

    Node(int data) {              
        this.data = data;
        this.next = null;
    }
}

class LinkedListt {
    Node head;

    LinkedListt() {
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
        while (current.next != null) 
        current = current.next;
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
                throw new IllegalArgumentException("Position not found"); 
            }
            current = current.next;
        }

        if (current == null) {
            throw new IllegalArgumentException("Position not found"); 
        }

        newNode.next = current.next;
        current.next = newNode;
    }
    public void deleteAtBeginning() {
        if (head == null) return;
        head = head.next;
    }

    
    public void deleteAtEnd() {
        if (head == null) return;

        if (head.next == null) { 
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }


    public void deleteAtPosition(int position) {
        if (position < 0) throw new IllegalArgumentException("position cannot be negative");
        if (head == null) throw new IllegalArgumentException("list is empty");

        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current.next == null) throw new IllegalArgumentException("position not found");
            current = current.next;
        }

        if (current.next == null) throw new IllegalArgumentException("position not found");

        current.next = current.next.next; 
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

public class DeletionOps {
    public static void main(String[] args) {
        LinkedListt l = new LinkedListt();
        l.insertAtBeginning(10);
        l.insertAtBeginning(20);
        l.deleteAtBeginning();
        l.insertAtEnd(40);
        l.insertAtEnd(50);
        l.deleteAtEnd();
        l.insertAtMiddle(1, 30);
        l.deleteAtPosition(1);

        l.printList(); 
    }
}
