
public class CollegeStudentDemo {

    public static void main(String[] args) {
        CollegeStudentAchievements list = new CollegeStudentAchievements();

        list.add(new CollegeStudent1("123", "Zidan", "2A", 3.2));
        list.add(new CollegeStudent1("125", "Ayu", "2A", 3.5));
        list.add(new CollegeStudent1("127", "Sofi", "2A", 3.1));
        list.add(new CollegeStudent1("129", "Sita", "2A", 3.6));
        list.add(new CollegeStudent1("131", "Miki", "2A", 3.7));

        System.out.println("Before sorting:");
        list.display();

        System.out.println("\nData sorted using INSERTION SORT (DESC):");
        list.insertionSortDescending();
        list.display();
    }
}
