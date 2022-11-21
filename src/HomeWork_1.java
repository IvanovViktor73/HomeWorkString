import java.util.Scanner;

public class HomeWork_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int strSize = str.length();
        System.out.println(strSize);
        if (strSize > 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        int firstSymbol = str.charAt(0);
        int lastSymbol = str.charAt(strSize-1);
        if (firstSymbol == lastSymbol){
            System.out.println("true");}
        else {
            System.out.println("false");}

        }


    }

