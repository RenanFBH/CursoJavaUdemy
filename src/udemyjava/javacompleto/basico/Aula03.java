package udemyjava.javacompleto.basico;

import java.util.Scanner;

public class Aula03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int c = 0;
        do {
            System.out.println(++c);

        } while (c < 10);

        System.out.println(soma);

    }

}
