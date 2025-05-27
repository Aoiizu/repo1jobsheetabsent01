
public class Student1 {

    String nim, name, className;
    double gpa;

    public Student1() {
    }

    public Student1(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        gpa = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }
}
