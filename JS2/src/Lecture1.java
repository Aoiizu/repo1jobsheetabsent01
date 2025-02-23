public class Lecture1 {
    
    String lecturerID;
    String name;
    boolean status;
    int startYear;
    String expertiseField;
    int tenure;

    void print() {
        System.out.println("Lecturer Name: " + name);
        System.out.println("Lecturer ID: " + lecturerID);
        System.out.print("Lecturer Status: ");
        if (status != true) {
            System.out.println("Inactive");
        } else {
            System.out.println("Active");
        }

        System.out.println("Year the lecturer joined: " + startYear);
        System.out.println("Lecturer's field of expertise: " + expertiseField);
    }

    void setStatus(boolean newStatus) {
        status = newStatus;
    }

    void calculateTenure(int yearNow) {
        tenure = yearNow - startYear;

        if (status != true) {
            System.out.println("\nThe lecturer named " + name + " had worked for " + tenure + " years.");
        } else {
            System.out.println("\nThe lecturer named " + name + " has worked for " + tenure + " years.");
        }
        
    }

    void changeExpertiseField(String newField) {
        expertiseField = newField;
    }

    public Lecture1() {

    }

    public Lecture1(String lecturerID, String name, int startYear, String expertiseField) {
        this.lecturerID = lecturerID;
        this.name = name;
        this.startYear = startYear;
        this.expertiseField = expertiseField;
        this.status = false;
        this.tenure = 0;
    }
}