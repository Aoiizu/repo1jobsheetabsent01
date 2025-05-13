
public class KRSQueue {

    private final int MAX_SIZE = 10;
    private Student1[] queue;
    private int front;
    private int rear;
    private int totalProcessed;

    public KRSQueue() {
        queue = new Student1[MAX_SIZE];
        front = 0;
        rear = 0;
        totalProcessed = 0;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == MAX_SIZE;
    }

    public void clear() {
        front = 0;
        rear = 0;
        totalProcessed = 0;
        System.out.println("Queue has been cleared.");
    }

    public void enqueue(Student1 s) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add student.");
        } else {
            queue[rear] = s;
            rear++;
            System.out.print("Student added: ");
            s.print();
        }
    }

    public void dequeueTwo() {
        int available = rear - front;
        if (available < 2) {
            System.out.println("Not enough students to process.");
        } else {
            System.out.println("Processing 2 students for KRS approval:");
            for (int i = 0; i < 2; i++) {
                Student1 s = queue[front];
                System.out.print("Approved: ");
                s.print();
                queue[front] = null;
                front++;
                totalProcessed++;
            }
        }
    }

    public void showAllStudents() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("All students in queue:");
        for (int i = front; i < rear; i++) {
            queue[i].print();
        }
    }

    public void showFirstTwo() {
        if (rear - front >= 1) {
            System.out.print("First student: ");
            queue[front].print();
        }
    }

    public void showLastStudent() {
        if (!isEmpty()) {
            System.out.print("Last student: ");
            queue[rear - 1].print();
        }
    }

    public void stats() {
        System.out.println("Total students in queue: " + (rear - front));
        System.out.println("Total students completed KRS approval: " + totalProcessed);
        System.out.println("Students yet to be approved: " + (rear - front));
    }
}
