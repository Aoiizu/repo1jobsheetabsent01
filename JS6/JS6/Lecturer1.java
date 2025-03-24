
public class Lecturer1 {

    String code;
    String name;
    boolean gender;
    int age;

    public Lecturer1(String code, String name, boolean gender, int age) {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void display() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + (gender ? "Male" : "Female"));
        System.out.println("Age: " + age);
        System.out.println("-------------------------");
    }
}
