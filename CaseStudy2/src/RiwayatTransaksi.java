
public class RiwayatTransaksi {

    TransaksiPengisian[] data;
    int front, rear, size, max;

    public RiwayatTransaksi(int n) {
        max = n;
        data = new TransaksiPengisian[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int i = front;
        while (i != rear) {
            data[i].print();
            i = (i + 1) % max;
        }
        data[i].print();
        System.out.println("Number of element: " + size);
    }

    void enqueue(TransaksiPengisian tp) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = tp;
        size++;
    }
}
