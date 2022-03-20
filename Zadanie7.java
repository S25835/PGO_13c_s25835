package PGO_01;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n < 5 || n % 2 == 0) {
            System.out.print("Podaj n: ");
            n = sc.nextInt();
        }
        draw(n);
    }

    static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            String line = "*";
            for (int j = 2; j < n; j++) {
                if (i == 1 || i == n) {
                    line += "*";
                } else
                    line += j == i ?  "*" : " ";
            }
            line += "*";
            System.out.println(line);
        }
    }
}
