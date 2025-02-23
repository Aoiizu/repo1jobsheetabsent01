public class CoursesMain1 {
    public static void main(String[] args) {
        Courses1 course1 = new Courses1();
        course1.name = "Programming";
        course1.courseID = "AAA421-01";
        course1.credit = 22;
        course1.hour = 3;
        System.out.println("Before Changes");
        course1.print();
        course1.changeCredit(52);
        course1.addHour(11);
        course1.reduceHour(4);
        System.out.println("\nAfter Changes");
        course1.print();

        Courses1 course2 = new Courses1("BBB21-01", "User Interface Design and Usability", 24, 6);
        System.out.println("\nBefore Changes");
        course2.print();
        course2.changeCredit(52);
        course2.addHour(15);
        course2.reduceHour(82);
        System.out.println("\nAfter Changes");
        course2.print();
    }
}