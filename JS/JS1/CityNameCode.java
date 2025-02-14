import java.util.Scanner;

public class CityNameCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char cityCode[] = {'A', 'B', 'C', 'D', 'F', 'G', 'H', 'L', 'N', 'T'}; 
        char cityNames[][] = {
        {'B', 'A', 'N', 'T', 'E', 'N'},
        {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
        {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
        {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
        {'B', 'O', 'G', 'O', 'R'},
        {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
        {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
        {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
        {'M', 'A', 'L', 'A', 'N', 'G'},
        {'T', 'E', 'G', 'A', 'L'}
        };

        char choice;
        int index = -1;
        do {
            System.out.print("Input the Code: ");
            choice = scanner.next().charAt(0);
            
            for (int i = 0; i < cityCode.length; i++) {
                if (choice == cityCode[i]) {
                    index = i;
                }
            }
    
            if (index == -1) {
                System.out.println("City not found. Try again.\n");
            }
            else {
                for (int i = 0; i < cityNames[index].length; i++) {
                    System.out.print(cityNames[index][i]);
                }
            }
        } while (index == -1);
        

    }
}
