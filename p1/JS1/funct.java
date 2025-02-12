import java.util.HashMap;
import java.util.Map;

public class funct {

    static final int AGLONEMA_PRICE = 75000;
    static final int KELADI_PRICE = 50000;
    static final int ALOCASIA_PRICE = 100000;
    static final int MAWAR_PRICE = 150000;

    public static void main(String[] args) {
        Map<String, int[]> branches = new HashMap<>();
        branches.put("RoyalGarden 1", new int[]{10, 5, 15, 7});
        branches.put("RoyalGarden 2", new int[]{6, 11, 9, 12});
        branches.put("RoyalGarden 3", new int[]{2, 10, 10, 5});
        branches.put("RoyalGarden 4", new int[]{5, 7, 12, 9});

        calculateIncome(branches);
        updateStockRoyalGarden4(branches.get("RoyalGarden 4"));
    }

    public static void calculateIncome(Map<String, int[]> branches) {
        System.out.println("Income of each branch:");

        for (Map.Entry<String, int[]> entry : branches.entrySet()) {
            String branchName = entry.getKey();
            int[] stock = entry.getValue();

            int income = (stock[0] * AGLONEMA_PRICE) + 
                         (stock[1] * KELADI_PRICE) + 
                         (stock[2] * ALOCASIA_PRICE) + 
                         (stock[3] * MAWAR_PRICE);

            System.out.println(branchName + ": Rp " + String.format("%,d", income));
        }
    }

    public static void updateStockRoyalGarden4(int[] stock) {
        int[] stockReduction = {-1, -2, 0, -5};

        for (int i = 0; i < stock.length; i++) {
            stock[i] = Math.max(0, stock[i] + stockReduction[i]);
        }

        System.out.println("\nUpdated stock for RoyalGarden 4 after flower death:");
        System.out.println("Aglonema: " + stock[0]);
        System.out.println("Keladi: " + stock[1]);
        System.out.println("Alocasia: " + stock[2]);
        System.out.println("Mawar: " + stock[3]);
    }
}

