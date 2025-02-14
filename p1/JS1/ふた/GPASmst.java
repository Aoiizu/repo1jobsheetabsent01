import java.util.Scanner;

class StudentData {
    static String[] courseName = { 
        "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
        "Matematika Dasar", "Bahasa Inggris", "Dasar Pemograman", 
        "Praktikum Dasar Pemograman", "Kesehatan & Keselamatan Kerja" 
    };
    static String[] letterGrade = new String[8];
    static double[] nilaiSetara = new double[8];
    static double[] scores = new double[8];
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
        for (int i = 0; i < StudentData.courseName.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + StudentData.courseName[i] + ": ");
            StudentData.scores[i] = scanner.nextDouble();
        }
    }

    public static void convertToNilaiSetara() {
        for (int i = 0; i < StudentData.courseName.length; i++) {
            double score = StudentData.scores[i];
            if (score > 80) { StudentData.letterGrade[i] = "A"; StudentData.nilaiSetara[i] = 4; }
            else if (score > 73) { StudentData.letterGrade[i] = "B+"; StudentData.nilaiSetara[i] = 3.5; }
            else if (score > 65) { StudentData.letterGrade[i] = "B"; StudentData.nilaiSetara[i] = 3; }
            else if (score > 60) { StudentData.letterGrade[i] = "C+"; StudentData.nilaiSetara[i] = 2.5; }
            else if (score > 50) { StudentData.letterGrade[i] = "C"; StudentData.nilaiSetara[i] = 2; }
            else if (score > 39) { StudentData.letterGrade[i] = "D"; StudentData.nilaiSetara[i] = 1; }
            else { StudentData.letterGrade[i] = "E"; StudentData.nilaiSetara[i] = 0; }
        }
    }

    public static void calculateIP() {
        StudentData.totalNilaiSetara = 0;
        for (double nilai : StudentData.nilaiSetara) {
            StudentData.totalNilaiSetara += nilai;
        }
        StudentData.ip = StudentData.totalNilaiSetara / StudentData.courseName.length;
    }

    public static void viewScores() {
        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-43s %-20s %-20s %-20s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < StudentData.courseName.length; i++) {
            System.out.printf("%-43s %-20.2f %-20s %-20.2f\n", 
                StudentData.courseName[i], StudentData.scores[i], 
                StudentData.letterGrade[i], StudentData.nilaiSetara[i]);
        }
        System.out.println("==============================");
        System.out.printf("IP: %-1.2f", StudentData.ip);
    }
}
