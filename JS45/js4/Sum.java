
public class Sum {

    double[] profits;

    public Sum(int el) {
        profits = new double[el];
    }

    public void setProfits(double[] values) {
        if (values.length == profits.length) {
            System.arraycopy(values, 0, profits, 0, values.length);
        }
    }

    public double totalBF() {
        double total = 0;
        for (int i = 0; i < profits.length; i++) {
            total += profits[i];
        }
        return total;
    }

    public double totalDC(double[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid + 1, r);
        return lsum + rsum;
    }

    public double totalDC() {
        return totalDC(profits, 0, profits.length - 1);
    }

    public static void main(String[] args) {
        Sum sumObj = new Sum(5);
        double[] values = {10.5, 20.3, 30.7, 40.2, 50.1};
        sumObj.setProfits(values);

        System.out.println("Total using Brute Force: " + sumObj.totalBF());
        System.out.println("Total using Divide and Conquer: " + sumObj.totalDC());
    }

}
