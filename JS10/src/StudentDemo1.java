
import java.util.Scanner;

public class StudentDemo1 {

    public static void main(String[] args) {
        StudentAssignmentStack1 stack = new StudentAssignmentStack1(5);
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Assignment");
            System.out.println("2. Grade Assignment");
            System.out.println("3. View Top Assignment");
            System.out.println("4. View All Assignments");
            System.out.println("5. View First Assignment");
            System.out.print("Choose: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Class: ");
                    String className = scan.nextLine();
                    Student1 student1 = new Student1(nama, nim, className, 0);
                    stack.push(student1);
                    System.out.printf("Assignment %s successfully submitted\n", student1.nama);
                    break;

                case 2:
                    Student1 graded = stack.pop();
                    if (graded != null) {
                        System.out.println("Grading assignment from " + graded.nama);
                        System.out.print("Enter grade (0-100): ");
                        int grade = scan.nextInt();
                        graded.grading(grade);
                        System.out.printf("Grade of assignment %s is %d\n", graded.nama, grade);

                        ConversionStack converter = new ConversionStack();
                        String binary = converter.convertToBinary(grade);
                        System.out.printf("Assignment grade in binary is: %s\n", binary);
                    }
                    break;

                case 3:
                    Student1 view = stack.peek();
                    if (view != null) {
                        System.out.println("Last submitted assignment is from " + view.nama);
                    }
                    break;
                case 4:
                    System.out.println("List of all assignments");
                    System.out.println("Name\tNIM\tClass");
                    stack.print();
                    break;
                case 5:
                    Student1 first = stack.getFirst();
                    if (first != null) {
                        System.out.println("The first student who submitted their assignment is " + first.nama);
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice >= 1 && choice <= 5);

    }

}
