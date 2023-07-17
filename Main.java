import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВедите первую строку: ");
        String a = sc.nextLine();
        System.out.println("Введите вторую строку: ");
        String b = sc.nextLine();
        System.out.println(a.substring(0, a.length() / 2) + b.substring(b.length() / 2));
    }
}


