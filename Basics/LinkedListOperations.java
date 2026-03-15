class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListOperations {

    Node head = null;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Delete node
    void deleteNode(int key) {

        Node temp = head;
        Node prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return;

        prev.next = temp.next;
    }

    // Search element
    boolean search(int key) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == key)
                return true;

            temp = temp.next;
        }

        return false;
    }

    // Display list
    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        LinkedListOperations list = new LinkedListOperations();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        list.insertAtEnd(40);

        System.out.println("Linked List:");
        list.display();

        list.deleteNode(20);

        System.out.println("After deleting 20:");
        list.display();

        if (list.search(30))
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}