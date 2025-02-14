import java.util.Scanner;

class Course {
    static String[] name, days;
    static int[] sks, sem;
}

public class CourseCalenderAh {
    static Scanner jadwalScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input how many courses you want to add: ");
        int n = jadwalScanner.nextInt();
        Course.name = new String[n];
        Course.sks = new int[n];
        Course.sem = new int[n];
        Course.days = new String[n];

        while (true) {
            System.out.println("\n====== Main Menu ======");
            System.out.println("1. Add a course\n2. Display all courses\n3. Display courses by day");
            System.out.println("4. Display courses by semester\n5. Search a course by name\n6. Exit");
            System.out.print("Select menu: ");
            int choice = jadwalScanner.nextInt();
            jadwalScanner.nextLine();

            switch (choice) {
                case 1 -> addCourse(n);
                case 2 -> displayAllCourse(n);
                case 3 -> displayCourseDay(n);
                case 4 -> displayCourseSem(n);
                case 5 -> searchCourse(n);
                case 6 -> {
                    System.out.println("Exiting program...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void addCourse(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Course name: ");
            Course.name[i] = jadwalScanner.nextLine();
            System.out.print("Credit hours: ");
            Course.sks[i] = jadwalScanner.nextInt();
            System.out.print("Semester: ");
            Course.sem[i] = jadwalScanner.nextInt();
            jadwalScanner.nextLine();
            System.out.print("Day: ");
            Course.days[i] = jadwalScanner.nextLine();
        }
    }

    public static void displayAllCourse(int n) {
        System.out.printf("%n%-20s %-15s %-10s %-10s %n", "Subject", "Credit Hours", "Semester", "Day");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-15d %-10d %-10s %n", Course.name[i], Course.sks[i], Course.sem[i], Course.days[i]);
        }
    }

    public static void displayCourseDay(int n) {
        System.out.print("Enter day to search: ");
        String day = jadwalScanner.nextLine();
        displayCourses(n, c -> day.equalsIgnoreCase(Course.days[c]), "day");
    }

    public static void displayCourseSem(int n) {
        System.out.print("Enter semester to search: ");
        int semester = jadwalScanner.nextInt();
        displayCourses(n, c -> semester == Course.sem[c], "semester");
    }

    public static void searchCourse(int n) {
        System.out.print("Enter course name to search: ");
        String name = jadwalScanner.nextLine();
        displayCourses(n, c -> name.equalsIgnoreCase(Course.name[c]), "name");
    }

    private static void displayCourses(int n, java.util.function.IntPredicate predicate, String criteria) {
        boolean found = false;
        System.out.printf("%n%-20s %-15s %-10s %-10s %n", "Subject", "Credit Hours", "Semester", "Day");
        for (int i = 0; i < n; i++) {
            if (predicate.test(i)) {
                found = true;
                System.out.printf("%-20s %-15d %-10d %-10s %n", Course.name[i], Course.sks[i], Course.sem[i], Course.days[i]);
            }
        }
        if (!found) System.out.println("No courses found for the specified " + criteria + ".");
    }
}
