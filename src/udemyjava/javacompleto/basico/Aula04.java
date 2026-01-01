package udemyjava.javacompleto.basico;

import java.util.Scanner;

public class Aula04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();


        int mask = 0b000001;

        if ((x & mask) != 0) {
            System.out.println("Sexto bit é verdadeiro");
        }
        else {
            System.out.println("Sexto bit é falso");
        }



    }

}
