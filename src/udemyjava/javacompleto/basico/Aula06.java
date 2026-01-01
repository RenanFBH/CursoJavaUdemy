package udemyjava.javacompleto.basico;

import java.util.Scanner;

public class Aula06 {

    public static void main(String[] args) {

        double i = 25;
        i = Math.sqrt(i);
        System.out.println(i);

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        showResult(higher(a, b, c));


        sc.close();


    }

    public static int higher (int x, int y, int z) {

        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > x && y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;

    }

    public static void showResult (int value) {

        System.out.println("Higher = " + value);

    }


}
