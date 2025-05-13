
import java.util.Scanner;

public class KRSMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KRSQueue krsQueue = new KRSQueue();
        int choice;

        do {
            System.out.println("\n=== KRS Approval Queue Menu ===");
            System.out.println("1. Enqueue student");
            System.out.println("2. Dequeue two students");
            System.out.println("3. Show all students in queue");
            System.out.println("4. Show first and last student");
            System.out.println("5. Show stats");
            System.out.println("6. Clear queue");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (!krsQueue.isFull()) {
                        System.out.print("Enter NIM: ");
                        String nim = scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Study Program: ");
                        String studyProgram = scanner.nextLine();
                        System.out.print("Enter Class Name: ");
                        String className = scanner.nextLine();

                        Student1 student = new Student1(nim, name, studyProgram, className);
                        krsQueue.enqueue(student);
                    } else {
                        System.out.println("Queue is full. Cannot add more students.");
                    }
                    break;
                case 2:
                    krsQueue.dequeueTwo();
                    break;
                case 3:
                    krsQueue.showAllStudents();
                    break;
                case 4:
                    krsQueue.showFirstTwo();
                    krsQueue.showLastStudent();
                    break;
                case 5:
                    krsQueue.stats();
                    break;
                case 6:
                    krsQueue.clear();
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
