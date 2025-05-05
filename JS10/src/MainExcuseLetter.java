
import java.util.Scanner;

public class MainExcuseLetter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExcuseLetterStack letterStack = new ExcuseLetterStack();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter by Student's Name");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Class Name: ");
                    String className = sc.nextLine();
                    System.out.print("Enter Type of Excuse (S/I): ");
                    char type = sc.nextLine().charAt(0);
                    System.out.print("Enter Duration (days): ");
                    int duration = sc.nextInt();
                    sc.nextLine();
                    ExcuseLetter letter = new ExcuseLetter(id, name, className, type, duration);
                    letterStack.submitLetter(letter);
                    System.out.println("Excuse letter submitted.");
                    break;
                case 2:
                    letterStack.processLetter();
                    break;
                case 3:
                    letterStack.viewLatestLetter();
                    break;
                case 4:
                    System.out.print("Enter student name to search: ");
                    String searchName = sc.nextLine();
                    letterStack.searchLetterByName(searchName);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}
