import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String n = sc.next();
        String result = "";
        for (int i = 0; i < n.length(); i++) {
            if (i % 2 == 1) {
                result += n.charAt(i) + "*";
            } else {
                result += n.charAt(i);
            }
        }
        System.out.println(result);
    }
}

