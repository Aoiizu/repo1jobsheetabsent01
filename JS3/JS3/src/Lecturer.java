public class Lecturer {
    private String id;
    private String name;
    private boolean gender;
    private int age;

    public Lecturer(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Gender: " + (gender ? "Male" : "Female") + ", Age: " + age);
    }
}
