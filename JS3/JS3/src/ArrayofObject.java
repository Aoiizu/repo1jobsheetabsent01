import java.util.Scanner;

public class ArrayofObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rectangles: ");
        int n = sc.nextInt();

        Rectangle[] rectanglesArray = new Rectangle[n];

        for (int i = 0; i < n; i++) {
            rectanglesArray[i] = new Rectangle();
            System.out.println("Rectangle " + i);

            System.out.print("Input Length: ");
            rectanglesArray[i].length = sc.nextInt();

            System.out.print("Input Width: ");
            rectanglesArray[i].width = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Rectangle " + i);
            System.out.println("Width: " + rectanglesArray[i].width + ", Length: " + rectanglesArray[i].length);
        }

        sc.close();
    }
}
