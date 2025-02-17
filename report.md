     LAB REPORT #1 

2.1.1 Question :

import java.util.Scanner;

public class UI1 {
    private String name, NIM, studentClass, letterGrade, qualification;
    private int absenNumber;
    private double quizGrade, assignmentGrade, examGrade, utsGrade, finalGrade;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================");
        System.out.print("Input Name: "); name = sc.nextLine();
        System.out.print("Input NIM: "); NIM = sc.nextLine();
        System.out.print("Input Class: "); studentClass = sc.nextLine();
        System.out.print("Input Absent Number: "); absenNumber = sc.nextInt();
        System.out.println("===============================");
        System.out.print("Input Quiz Score: "); quizGrade = sc.nextDouble();
        System.out.print("Input Homework Score: "); assignmentGrade = sc.nextDouble();
        System.out.print("Input Middle Test Score: "); utsGrade = sc.nextDouble();
        System.out.print("Input End of Semester Test Score: "); examGrade = sc.nextDouble();
        System.out.println("===============================");
        finalGrade = (quizGrade + assignmentGrade + utsGrade + examGrade) / 4;
    }

    public void convertGrade() {
        if (finalGrade >= 80) { letterGrade = "A"; qualification = "Very Good"; }
        else if (finalGrade >= 73) { letterGrade = "B+"; qualification = "More than Good"; }
        else if (finalGrade >= 65) { letterGrade = "B"; qualification = "Good"; }
        else if (finalGrade >= 60) { letterGrade = "C+"; qualification = "Still Good"; }
        else if (finalGrade >= 50) { letterGrade = "C"; qualification = "Ok"; }
        else if (finalGrade >= 39) { letterGrade = "D"; qualification = "Not enough"; }
        else { letterGrade = "E"; qualification = "Fail"; }
    }

    public void displayResult() {
        System.out.println("Mahasiswa: " + name + " (NIM: " + NIM + ")");
        System.out.println("Kelas:  " + studentClass + " Absent Number:  " + absenNumber);
        if (finalGrade >= 39)
            System.out.println("Nilai akhir: " + finalGrade + ", Nilai huruf: " + letterGrade + ", kualifikasi: " + qualification);
        else
            System.out.println("Nilai akhir: " + finalGrade + ", Nilai huruf: " + letterGrade + ", kualifikasi: Anda gagal");
    }
    
    public static void main(String[] args) {
        UI1 student = new UI1();
        student.inputData();
        student.convertGrade();
        student.displayResult();
    }
}

Output : 

![image](https://github.com/user-attachments/assets/94cde2ea-490c-48ea-9b07-4972f33e1fa5)


2.2 Question : 

import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input NIM: ");
        String nim = scanner.nextLine();
        
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        
        if (n < 10) {
            n += 10;
        }
        
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}

![image](https://github.com/user-attachments/assets/bb23dbb9-a537-45dc-8ee6-25d897f5cf1c)

2.3.1 Array Question : 

import java.util.Scanner;

class DataMurid {
    static String[] courseName = { 
        "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
        "Matematika Dasar", "Bahasa Inggris", "Dasar Pemograman", 
        "Praktikum Dasar Pemograman", "Kesehatan & Keselamatan Kerja" 
    };
    static String[] letterGrade = new String[courseName.length];
    static double[] nilaiSetara = new double[courseName.length];
    static double[] scores = new double[courseName.length];
    static double totalNilaiSetara = 0, ip = 0;
}

public class GPASmst {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inputScores();
        convertToNilaiSetara();
        calculateIP();
        viewScores();
    }

    public static void inputScores() {
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        for (int i = 0; i < DataMurid.courseName.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + DataMurid.courseName[i] + ": ");
            DataMurid.scores[i] = scanner.nextDouble();
        }
    }

    public static void convertToNilaiSetara() {
        for (int i = 0; i < DataMurid.courseName.length; i++) {
            double score = DataMurid.scores[i];
            if (score >= 80) { DataMurid.letterGrade[i] = "A"; DataMurid.nilaiSetara[i] = 4; }
            else if (score >= 73) { DataMurid.letterGrade[i] = "B+"; DataMurid.nilaiSetara[i] = 3.5; }
            else if (score >= 65) { DataMurid.letterGrade[i] = "B"; DataMurid.nilaiSetara[i] = 3; }
            else if (score >= 60) { DataMurid.letterGrade[i] = "C+"; DataMurid.nilaiSetara[i] = 2.5; }
            else if (score >= 50) { DataMurid.letterGrade[i] = "C"; DataMurid.nilaiSetara[i] = 2; }
            else if (score >= 39) { DataMurid.letterGrade[i] = "D"; DataMurid.nilaiSetara[i] = 1; }
            else { DataMurid.letterGrade[i] = "E"; DataMurid.nilaiSetara[i] = 0; }
        }
    }

    public static void calculateIP() {
        DataMurid.totalNilaiSetara = 0;
        for (double nilai : DataMurid.nilaiSetara) {
            DataMurid.totalNilaiSetara += nilai;
        }
        DataMurid.ip = DataMurid.totalNilaiSetara / DataMurid.courseName.length;
    }

    public static void viewScores() {
        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-43s %-20s %-20s %-20s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < DataMurid.courseName.length; i++) {
            System.out.printf("%-43s %-20.2f %-20s %-20.2f\n", 
                DataMurid.courseName[i], DataMurid.scores[i], 
                DataMurid.letterGrade[i], DataMurid.nilaiSetara[i]);
        }
        System.out.println("==============================");
        System.out.printf("IP: %-1.2f", DataMurid.ip);
    }
}



![image](https://github.com/user-attachments/assets/59d7e481-3259-4d70-96f0-d6bf22c28086)


2.4 Function :

import java.util.Scanner;

class Flowers {
    static int[][] stocks = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
    static int[] prices = {75000, 50000, 60000, 10000};
    static int[] dead = {1, 2, 0, 5};

    static final String[] flowerNames = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
}

public class funct {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n========================================");
            System.out.println("======= Royal Garden Flower Shop =======");
            System.out.println("========================================");
            System.out.println("1. Display income of each branch if sold out");
            System.out.println("2. Find stock for branch 4");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) displayIncome();
            else if (choice == 2) findStock4();
            else if (choice == 3) break;
            else System.out.println("Invalid choice. Try again.");
        }
    }

    public static void displayIncome() {
        System.out.println("\n========= Total Income =========");
        int[] totalIncome = new int[4];
        for (int i = 0; i < Flowers.stocks.length; i++) {
            for (int j = 0; j < Flowers.stocks[i].length; j++) {
                totalIncome[i] += Flowers.stocks[i][j] * Flowers.prices[j];
            }
            System.out.printf("RoyalGarden %d: Rp. %d%n", i + 1, totalIncome[i]);
        }
    }

    public static void findStock4() {
        System.out.println("\n========= Branch 4 Stock =========");
        int[] stockAfterDead = new int[4];
        for (int i = 0; i < Flowers.stocks[3].length; i++) {
            stockAfterDead[i] = Flowers.stocks[3][i] - Flowers.dead[i];
        }
        System.out.print("Before: ");
        for (int i = 0; i < Flowers.stocks[3].length; i++) {
            System.out.printf("%s: %d ", Flowers.flowerNames[i], Flowers.stocks[3][i]);
        }
        System.out.println();
        System.out.print("After: ");
        for (int i = 0; i < stockAfterDead.length; i++) {
            System.out.printf("%s: %d ", Flowers.flowerNames[i], stockAfterDead[i]);
        }
        System.out.println();
    }
}


![image](https://github.com/user-attachments/assets/34f29be8-a783-4dbc-adb1-5561403267e7)


3 Assigments :

1.

import java.util.Scanner;

public class CityNameCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char cityCode[] = {'A', 'B', 'C', 'D', 'F', 'G', 'H', 'L', 'N', 'T'}; 
        char cityNames[][] = {
        {'B', 'A', 'N', 'T', 'E', 'N'},
        {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
        {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
        {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
        {'B', 'O', 'G', 'O', 'R'},
        {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
        {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
        {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
        {'M', 'A', 'L', 'A', 'N', 'G'},
        {'T', 'E', 'G', 'A', 'L'}
        };

        char choice;
        int index = -1;
        do {
            System.out.print("Input the Code: ");
            choice = scanner.next().charAt(0);
            
            for (int i = 0; i < cityCode.length; i++) {
                if (choice == cityCode[i]) {
                    index = i;
                }
            }
    
            if (index == -1) {
                System.out.println("City not found. Try again.\n");
            }
            else {
                for (int i = 0; i < cityNames[index].length; i++) {
                    System.out.print(cityNames[index][i]);
                }
            }
        } while (index == -1);
        

    }
}

![image](https://github.com/user-attachments/assets/afd46543-9b70-4b2c-b4f9-e050890ab5bf)

2.

import java.util.Scanner;

public class CubeCalculator {
    public static void main(String[] args) {
        Scanner kotakscanner = new Scanner(System.in);

        int pilihan, panjang;

        System.out.print("Please input the cube lengths: ");
        panjang = kotakscanner.nextInt();

        while (true) {
            System.out.println("=============== Cube Calculator ================");

            System.out.println("1. Calculate Volume");
            System.out.println("2. Calculate Surface Area");
            System.out.println("3. Calculate Perimeter of the cube");
            System.out.println("4. Exit");
            System.out.print("Please select the calculation type: ");
            System.out.println("================================================");
            pilihan = kotakscanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("The volume of the cube is: " + calcVol(panjang));
                    break;
                case 2:
                    System.out.println("The surface area of the cube is: " + calcSurfaceArea(panjang));
                    break;
                case 3:
                    System.out.println("The perimeter of the cube is: " + calcPerimeter(panjang));
                    break;
                case 4:
                    System.out.println("Exiting the program....");
                    return;
            }
        }
    }
    public static int calcVol(int panjang) {
        return (panjang * panjang * panjang);
    }
    public static int calcSurfaceArea(int panjang) {
        return (6 * panjang * panjang);
    }
    public static int calcPerimeter(int panjang) {
        return (12 * panjang);
    }
}

![image](https://github.com/user-attachments/assets/297adda7-d71b-46f7-ba05-4928891bda5a)

3.

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

![image](https://github.com/user-attachments/assets/53b406bd-543e-401b-bd45-c11ffa10baf3)

![image](https://github.com/user-attachments/assets/e734ff57-d707-4ce8-8f17-7d0a1c6aab1c)
