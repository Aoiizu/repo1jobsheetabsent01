import java.util.Scanner;

class Flowers {
    static int[][] stocks = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
    static int[] prices = {75000, 50000, 60000, 10000};
    static int[] dead = {1, 2, 0, 5};

    static final String[] flowerNames = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
}

public class funct {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n========================================");
            System.out.println("======= Royal Garden Flower Shop =======");
            System.out.println("========================================");
            System.out.println("1. Display income of each branch if sold out");
            System.out.println("2. Find stock for branch 4");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) displayIncome();
            else if (choice == 2) findStock4();
            else if (choice == 3) break;
            else System.out.println("Invalid choice. Try again.");
        }
    }

    public static void displayIncome() {
        System.out.println("\n========= Total Income =========");
        int[] totalIncome = new int[4];
        for (int i = 0; i < Flowers.stocks.length; i++) {
            for (int j = 0; j < Flowers.stocks[i].length; j++) {
                totalIncome[i] += Flowers.stocks[i][j] * Flowers.prices[j];
            }
            System.out.printf("RoyalGarden %d: Rp. %d%n", i + 1, totalIncome[i]);
        }
    }

    public static void findStock4() {
        System.out.println("\n========= Branch 4 Stock =========");
        int[] stockAfterDead = new int[4];
        for (int i = 0; i < Flowers.stocks[3].length; i++) {
            stockAfterDead[i] = Flowers.stocks[3][i] - Flowers.dead[i];
        }
        System.out.print("Before: ");
        for (int i = 0; i < Flowers.stocks[3].length; i++) {
            System.out.printf("%s: %d ", Flowers.flowerNames[i], Flowers.stocks[3][i]);
        }
        System.out.println();
        System.out.print("After: ");
        for (int i = 0; i < stockAfterDead.length; i++) {
            System.out.printf("%s: %d ", Flowers.flowerNames[i], stockAfterDead[i]);
        }
        System.out.println();
    }
}

