public class LectureMain1 {

    public static void main(String[] args) {
        Lecture1 lecturer1 = new Lecture1();
        lecturer1.lecturerID = "123456789";
        lecturer1.name = "Yudi";
        lecturer1.startYear = 2006;
        lecturer1.expertiseField = "Android";

        lecturer1.setStatus(true);
        System.out.println("Before Changes");
        lecturer1.print();
        lecturer1.changeExpertiseField("Apple");
        System.out.println("\nAfter Changes");
        lecturer1.print();
        lecturer1.calculateTenure(2025);
        
        System.out.println();

        Lecture1 lecturer2 = new Lecture1("246810", "Nunung", 1920, "Chinese Android");
        lecturer2.setStatus(false);
        System.out.println("Before Changes");
        lecturer2.print();
        lecturer2.changeExpertiseField("Android");
        System.out.println("\nAfter Changes");
        lecturer2.print();
        lecturer2.calculateTenure(2023);
    }

}