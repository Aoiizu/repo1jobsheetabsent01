
public class StudentScoresMain {

    public static void main(String[] args) {
        int[] midtermScores = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] finalScores = {82, 88, 87, 79, 95, 85, 83, 84};

        StudentScores studentScores = new StudentScores(midtermScores, finalScores);

        System.out.println("Highest Midterm Score (UTS): " + studentScores.findMaxUTS(0, midtermScores.length - 1));
        System.out.println("Lowest Midterm Score (UTS): " + studentScores.findMinUTS(0, midtermScores.length - 1));
        System.out.println("Average Final Score (UAS): " + studentScores.calculateAverageUAS());
    }
}
