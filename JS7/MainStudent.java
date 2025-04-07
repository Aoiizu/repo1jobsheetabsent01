
import java.util.Scanner;

public class MainStudent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int amountStudents = sc.nextInt();

        SearchStudent data = new SearchStudent(amountStudents);

        for (int i = 0; i < amountStudents; i++) {
            System.out.println("-----------------------------");
            System.out.println("Enter data for student " + (i + 1));

            System.out.print("NIM     : ");
            int nim = sc.nextInt();
            System.out.print("Age     : ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Name    : ");
            String name = sc.nextLine();
            System.out.print("GPA     : ");
            double gpa = sc.nextDouble();

            Students s = new Students(nim, age, name, gpa);
            data.add(s);
        }

        System.out.println("\n===============================");
        System.out.println("All Student Data:");
        data.display();

        System.out.print("\nEnter NIM to search: ");
        int search = sc.nextInt();

        System.out.println("\n===== Sequential Search =====");
        int posSeq = data.findSeqSearch(search);
        data.showPosition(search, posSeq);
        data.showData(search, posSeq);

        data.sortByNIMAscending();
        System.out.println("\n===== Binary Search (after sorting) =====");
        int posBin = data.FindBinarySearch(search, 0, amountStudents - 1);
        data.showPosition(search, posBin);
        data.showData(search, posBin);
    }
}
