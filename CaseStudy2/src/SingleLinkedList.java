public class SingleLinkedList {
    Node head;
    Node tail;
    int size = 0;
    int maxSize;

    public SingleLinkedList(int maxSize) {
        this.maxSize = maxSize;
    }

    boolean isEmpty() {
        return (head==null);
    }

    void print() {
        if(!isEmpty()) {
            Node tmp = head;
            System.out.println("\n-- Antrian Kendaraan --");
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
        } else {
            System.out.println("-- Antrian Kosong --");
        }
    }

    void add(Kendaraan kdr) {
        if (size >= maxSize) {
            System.out.println("Antrian penuh");
            return;
        }

        Node newNode = new Node (kdr, null);
        if(isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    void printSize() {
        System.out.println("Jumlah kendaraan dalam antrian: " + size);
    }

    void removeFirst() {
        if(isEmpty()) {
            System.out.println("-- Antrian Kosong --");
        } else if(head==tail) {
            head = tail = null;
            size--;
        } else {
            head = head.next;
            size--;
        }
    }
}

