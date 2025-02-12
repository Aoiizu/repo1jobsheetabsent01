import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GPASmst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> matKul = new HashMap<>();

        System.out.println("Program Menghitung IP Semester");
        System.out.println("-----");

        String[] courses = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };

        for (String course : courses) {
            System.out.print("Masukkan Nilai Angka untuk MK " + course + ": ");
            matKul.put(course, getmatKul(scanner));
        }

        System.out.println("Hasil Konversi Nilai");
        System.out.println("=");

        double totalNilaiSetara = 0;
        double totalSKS = 0;

        for (String courseName : matKul.keySet()) {
            double nilaiAngka = matKul.get(courseName);
            double nilaiSetara = getNilaiSetara(nilaiAngka);
            double sks = getSKS(courseName);

            totalNilaiSetara += nilaiSetara * sks;
            totalSKS += sks;

            System.out.printf("Mata Kuliah: %s, Nilai Angka: %.2f, Nilai Setara: %.2f, SKS: %.1f%n",
                    courseName, nilaiAngka, nilaiSetara, sks);
        }

        double ipSemester = totalNilaiSetara / totalSKS;
        System.out.printf("IP Semester: %.2f%n", ipSemester);

        scanner.close();
    }

    private static double getmatKul(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Input tidak valid. Silakan masukkan nilai angka: ");
            }
        }
    }

    private static double getNilaiSetara(double nilaiAngka) {
        if (nilaiAngka >= 85) return 4.0;
        else if (nilaiAngka >= 80) return 3.7;
        else if (nilaiAngka >= 75) return 3.3;
        else if (nilaiAngka >= 70) return 3.0;
        else if (nilaiAngka >= 65) return 2.7;
        else if (nilaiAngka >= 60) return 2.3;
        else if (nilaiAngka >= 55) return 2.0;
        else if (nilaiAngka >= 50) return 1.0;
        else return 0.0;
    }

    private static double getSKS(String courseName) {
        switch (courseName) {
            case "Pancasila":
            case "Keselamatan dan Kesehatan Kerja":
                return 2;
            case "Konsep Teknologi Informasi":
            case "Critical Thinking dan Problem Solving":
            case "Matematika Dasar":
            case "Bahasa Inggris":
            case "Dasar Pemrograman":
                return 3;
            case "Praktikum Dasar Pemrograman":
                return 4;
            default:
                return 0;
        }
    }
}

