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

