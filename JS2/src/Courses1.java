public class Courses1 {
    String courseID;
    String name;
    int credit;
    int hour;

    void print() {
        System.out.println("Course Name: " + name);
        System.out.println("Course ID: " + courseID);
        System.out.println("Credit: " + credit);
        System.out.println("Hours: " + hour);
    }
    void changeCredit(int newCredit) {
        credit = newCredit;
    }
    void addHour(int newHour) {
        hour += newHour;
    }
    void reduceHour(int newHour) {
        if (hour < newHour) {
            newHour -= hour;
        } else if (hour > newHour) {
            hour -= newHour;
        } else {
            hour -= newHour;
        }
    }

    public Courses1() {

    }

    public Courses1(String courseID, String name, int credit, int hour) {
        this.courseID = courseID;
        this.name = name;
        this.credit = credit;
        this.hour = hour;
    } 
}