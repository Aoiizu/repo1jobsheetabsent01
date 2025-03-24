
public class CollegeStudent1 {

    String nim;
    String name;
    String className;
    double gpa;

    CollegeStudent1() {
    }

    CollegeStudent1(String nim, String name, String className, double gpa) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.gpa = gpa;
    }

    void displayInfo() {
        System.out.println("Name  : " + name);
        System.out.println("NIM   : " + nim);
        System.out.println("Class : " + className);
        System.out.println("GPA   : " + gpa);
    }
}
