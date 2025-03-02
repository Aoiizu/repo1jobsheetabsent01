import java.util.Scanner;

public class LecturerDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of lecturers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Lecturer[] lecturers = new Lecturer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Lecturer " + (i + 1));
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Gender (true for Male, false for Female): ");
            boolean gender = scanner.nextBoolean();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            lecturers[i] = new Lecturer(id, name, gender, age);
        }

        System.out.println("\nDisplaying all lecturers:");
        LecturerData01.showAllLecturerData(lecturers);

        System.out.println("\nCounting lecturers by gender:");
        LecturerData01.countLecturerByGender(lecturers);

        System.out.println("\nAverage age by gender:");
        LecturerData01.averageLecturerAgeByGender(lecturers);

        System.out.println("\nOldest lecturer info:");
        LecturerData01.showOldestLecturerInfo(lecturers);

        System.out.println("\nYoungest lecturer info:");
        LecturerData01.showYoungestLecturerInfo(lecturers);

        scanner.close();
    }
}
