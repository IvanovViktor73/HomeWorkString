import java.util.Scanner;


public class Level_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char a = 'A';
        char b = 'B';
        if (str.charAt(0) == a) {
            System.out.print("B");
        } else if (str.charAt(0) == b) {
            System.out.print("A");
        }
        if (str.charAt(1) == a) {
            System.out.print("B");
        } else if (str.charAt(1) == b) {
            System.out.print("A");
        }
        if (str.charAt(2) == a) {
            System.out.print("B");
        } else if (str.charAt(2) == b) {
            System.out.print("A");
        }
        if (str.charAt(3) == a) {
            System.out.print("B");
        } else if (str.charAt(3) == b) {
            System.out.print("A");

        }
    }
}






