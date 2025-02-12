import java.util.Scanner;

public class UI1 {
    private String name, NIM, studentClass, letterGrade, qualification;
    private int absenNumber;
    private double quizGrade, assignmentGrade, examGrade, utsGrade, finalGrade;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================");
        System.out.print("Masukkan nama: "); name = sc.nextLine();
        System.out.print("Masukkan NIM: "); NIM = sc.nextLine();
        System.out.print("Masukkan kelas: "); studentClass = sc.nextLine();
        System.out.print("Masukkan nomor absen: "); absenNumber = sc.nextInt();
        System.out.println("===============================");
        System.out.print("Masukkan nilai kuis: "); quizGrade = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: "); assignmentGrade = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: "); utsGrade = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: "); examGrade = sc.nextDouble();
        System.out.println("===============================");
        finalGrade = (quizGrade + assignmentGrade + utsGrade + examGrade) / 4;
    }

    public void convertGrade() {
        if (finalGrade >= 80) { letterGrade = "A"; qualification = "Sangat Baik"; }
        else if (finalGrade >= 73) { letterGrade = "B+"; qualification = "Lebih dari Baik"; }
        else if (finalGrade >= 65) { letterGrade = "B"; qualification = "Baik"; }
        else if (finalGrade >= 60) { letterGrade = "C+"; qualification = "Lebih dari Cukup"; }
        else if (finalGrade >= 50) { letterGrade = "C"; qualification = "Cukup"; }
        else if (finalGrade >= 39) { letterGrade = "D"; qualification = "Kurang"; }
        else { letterGrade = "E"; qualification = "Gagal"; }
    }

    public void displayResult() {
        System.out.println("Mahasiswa: " + name + " (NIM " + NIM + ")");
        System.out.println("Kelas:  " + studentClass + " no. absen " + absenNumber);
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

