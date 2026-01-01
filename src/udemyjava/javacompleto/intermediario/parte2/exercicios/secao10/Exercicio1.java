package udemyjava.javacompleto.intermediario.parte2.exercicios.secao10;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número M e o número N da matriz: ");
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = input.nextInt();
            }
        }
        System.out.print("\nDigite o número X que pertence a matriz: ");
        int x = input.nextInt();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.print("\nPosição: " + i + ", " + j);
                    if (j > 0) {
                        System.out.print("\nValor à esquerda: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.print("\nValor acima: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.print("\nValor à direita: " + mat[i][j+1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.print("\nValor abaixo: " + mat[i+1][j]);
                    }
                }
            }
        }

        input.close();
    }
}
