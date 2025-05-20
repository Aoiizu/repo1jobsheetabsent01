
import java.util.Scanner;

public class StudentQueue1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList queue = new SingleLinkedList();
        int choice;

        do {
            System.out.println("\n--- Student Queue Menu ---");
            System.out.println("1. Enqueue Student");
            System.out.println("2. Dequeue Student");
            System.out.println("3. Peek Front Student");
            System.out.println("4. Peek Rear Student");
            System.out.println("5. Total Students in Queue");
            System.out.println("6. Clear Queue");
            System.out.println("7. Print Queue");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Class: ");
                    String className = sc.nextLine();
                    System.out.print("Enter GPA: ");
                    double gpa = sc.nextDouble();
                    sc.nextLine();
                    Student1 s = new Student1(nim, name, className, gpa);
                    queue.addLast(s);
                    break;
                case 2:
                    queue.removeFirst();
                    break;
                case 3:
                    if (!queue.isEmpty()) {
                        System.out.print("Front: ");
                        queue.head.data.print();
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 4:
                    if (!queue.isEmpty()) {
                        System.out.print("Rear: ");
                        queue.tail.data.print();
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 5:
                    System.out.println("Total students in queue: " + queue.getSize());
                    break;
                case 6:
                    while (!queue.isEmpty()) {
                        queue.removeFirst();
                    }
                    System.out.println("Queue cleared.");
                    break;
                case 7:
                    queue.print();
                    break;
                case 0:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 0);
    }
}
