
public class StudentScores {

    int[] midtermScores;
    int[] finalScores;

    public StudentScores(int[] midtermScores, int[] finalScores) {
        this.midtermScores = midtermScores;
        this.finalScores = finalScores;
    }

    public int findMaxUTS(int l, int r) {
        if (l == r) {
            return midtermScores[l];
        }
        int mid = (l + r) / 2;
        int leftMax = findMaxUTS(l, mid);
        int rightMax = findMaxUTS(mid + 1, r);
        return Math.max(leftMax, rightMax);
    }

    public int findMinUTS(int l, int r) {
        if (l == r) {
            return midtermScores[l];
        }
        int mid = (l + r) / 2;
        int leftMin = findMinUTS(l, mid);
        int rightMin = findMinUTS(mid + 1, r);
        return Math.min(leftMin, rightMin);
    }

    public double calculateAverageUAS() {
        double total = 0;
        for (int score : finalScores) {
            total += score;
        }
        return total / finalScores.length;
    }
}
