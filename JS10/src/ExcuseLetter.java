
public class ExcuseLetter {

    String id;
    String name;
    String className;
    char typeOfExcuse;
    int duration;

    public ExcuseLetter(String id, String name, String className, char typeOfExcuse, int duration) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.typeOfExcuse = typeOfExcuse;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Class: " + className
                + ", Type: " + typeOfExcuse + ", Duration: " + duration + " days";
    }
}
