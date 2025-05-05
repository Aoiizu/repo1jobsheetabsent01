
public class Student1 {

    String nama;
    String nim;
    String className;
    int grade;

    public Student1(String nama, String nim, String className, int grade) {
        this.nama = nama;
        this.nim = nim;
        this.className = className;
        this.grade = grade;
    }

    public void grading(int grade) {
        this.grade = grade;
    }
}
