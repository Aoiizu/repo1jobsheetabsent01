import java.util.Scanner;

public class CubeCalculator {
    public static void main(String[] args) {
        Scanner kotakscanner = new Scanner(System.in);

        int pilihan, panjang;

        System.out.print("Please input the cube lengths: ");
        panjang = kotakscanner.nextInt();

        while (true) {
            System.out.println("=============== Cube Calculator ================");

            System.out.println("1. Calculate Volume");
            System.out.println("2. Calculate Surface Area");
            System.out.println("3. Calculate Perimeter of the cube");
            System.out.println("4. Exit");
            System.out.print("Please select the calculation type: ");
            System.out.println("================================================");
            pilihan = kotakscanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("The volume of the cube is: " + calcVol(panjang));
                    break;
                case 2:
                    System.out.println("The surface area of the cube is: " + calcSurfaceArea(panjang));
                    break;
                case 3:
                    System.out.println("The perimeter of the cube is: " + calcPerimeter(panjang));
                    break;
                case 4:
                    System.out.println("Exiting the program....");
                    return;
            }
        }
    }
    public static int calcVol(int panjang) {
        return (panjang * panjang * panjang);
    }
    public static int calcSurfaceArea(int panjang) {
        return (6 * panjang * panjang);
    }
    public static int calcPerimeter(int panjang) {
        return (12 * panjang);
    }
}