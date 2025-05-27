
public class Node {

    Student1 data;
    Node next;
    Node prev;

    public Node() {
    }

    Node(Student1 data) {
        this.data = data;
        prev = null;
        next = null;
    }

    Node(Node prev, Student1 data, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
