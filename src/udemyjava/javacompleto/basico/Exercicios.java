package udemyjava.javacompleto.basico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {

        exercicios3();

    }

    public static void prologo() {

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'M';

        double price1 = 2100;
        double price2 = 650.50;
        double measure = 53.234567;

        Locale.setDefault(Locale.GERMAN);
        System.out.printf("Products:%n%s, which price is U$ %.2f%n%s, which price is U$ %.2f%n%n", product1, price1, product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f%nRouded (three decimal places): %.3f%n%n", measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);

    }

    public static void exercicios1() {

        Scanner sc = new Scanner(System.in);

        /**
         *
         * EXERCÍCIOS PARTE 1
         *
         */

        /**
         *
         * EXERCÍCIO 1
         *
         */

        /**int x, y, soma;
        System.out.println("Digite o primeiro número: ");
        x = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        y = sc.nextInt();
        soma = x + y;
        String report = x + " + " + y + " = " + soma;
        System.out.println(report);**/


        /**
         *
         * EXERCÍCIO 2
         *
         */

        /**double r, pi, area;
        pi = 3.14159;
        System.out.println("Digite o valor do raio do circulo: ");
        r = sc.nextDouble();
        area = pi * Math.pow(r, 2);
        System.out.println("Área: " + area);**/

        /**
         *
         * EXERCÍCIO 3
         *
         */

        /**int a, b, c, d, dif;
        System.out.println("Digite 4 números, separados por espaço: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        dif = (a * b) - (c * d);
        System.out.println("A diferença dos produtos de A, B por C, D é " + dif);**/

        /**
         *
         * EXERCÍCIO 4
         *
         */

        /**int id;
        double hoursWorking, payWorking, salary;
        System.out.println("Digite o ID, a quantidade de horas trabalhadas e o valor recebido por hora (SEPARADOS POR ESPAÇO) do funcionário: ");
        id = sc.nextInt();
        hoursWorking = sc.nextDouble();
        payWorking = sc.nextDouble();
        salary = hoursWorking * payWorking;
        Locale.setDefault(Locale.GERMAN);
        System.out.printf("Funcionário %d, salário: R$ %.2f", id, salary);**/

        /**
         *
         * EXERCÍCIO 5
         *
         */

        /**int id1, id2, qty1, qty2;
        double price1, price2, priceTotal;
        System.out.println("Digite o ID, a quantidade e o valor unitário da peça 1 (separados por espaço): ");
        id1 = sc.nextInt();
        qty1 = sc.nextInt();
        price1 = sc.nextDouble();
        System.out.println("Digite o ID, a quantidade e o valor unitário da peça 2 (separados por espaço): ");
        id2 = sc.nextInt();
        qty2 = sc.nextInt();
        price2 = sc.nextDouble();
        priceTotal = (price1 * qty1) + (price2 * qty2);
        Locale.setDefault(Locale.GERMAN);
        System.out.printf("Valor a pagar: R$%.2f", priceTotal);**/

        /**
         *
         * EXERCÍCIO 6
         *
         */

        /**double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo, pi;
        pi = 3.14159;
        System.out.println("Digite o valor A, B e C de uma forma geométrica (separados por espaço): ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        areaTriangulo = (a * c) / 2;
        areaCirculo = pi * Math.pow(c, 2);
        areaTrapezio = ((a + b) * c) / 2;
        areaQuadrado = Math.pow(b, 2);
        areaRetangulo = a * b;
        System.out.printf("Triângulo: %.3f%nCirculo: %.3f%nTrapézio: %.3f%nQuadrado: %.3f%nRetângulo: %.3f", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);**/

        sc.close();
    }

    public static void exercicios2() {

        Scanner sc = new Scanner(System.in);

        /**
         *
         * EXERCÍCIOS PARTE 2
         *
         */

        /**
         *
         * EXERCÍCIO 1
         *
         */

        /**int x;
        System.out.print("Digite um número inteiro: ");
        x = sc.nextInt();
        if (x < 0) {
            System.out.println("\nO número " + x + " é negativo");
        }
        else {
            System.out.println("\nO número " + x + " é positivo");
        }**/

        /**
         *
         * EXERCÍCIO 2
         *
         */

        /**int y;
        System.out.print("Digite um número inteiro: ");
        y = sc.nextInt();
        if (y % 2 == 0) {
            System.out.println("\nO número " + y + " é par");
        }
        else {
            System.out.println("\nO número " + y + " é ímpar");
        }**/

        /**
         *
         * EXERCÍCIO 3
         *
         */

        /**int a, b;
        System.out.print("Digite 2 valores inteiros (separados por espaço): ");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a % b == 0) {
            System.out.println("\nO número " + a + " é multiplo de " + b);
        }
        else if (b % a == 0) {
            System.out.println("\nO número " + b + " é multiplo de " + a);
        }
        else {
            System.out.println("\nNão são multiplos");
        }**/

        /**
         *
         * EXERCÍCIO 4
         *
         */

        /**int horaInicio, horaFim, duracao;
        System.out.print("Digite a hora de início e a hora do fim de um jogo - com a duração mínima de 1 hora e máxima de 24 horas (separados por espaço): ");
        horaInicio = sc.nextInt();
        horaFim = sc.nextInt();
        duracao = horaFim - horaInicio;
        if (duracao == 0) {
            System.out.print("O jogo tem uma duração de 24 horas");
        }
        else {
            System.out.print("O jogo tem uma duração de " + duracao + " horas");
        }**/

        /**
         *
         * EXERCÍCIO 5
         *
         */

        /**int idItem, qtdItem;
        double precoItem, valorFinal;
        System.out.print("Digite o ID e a quantidade do item (separados por espaço): ");
        idItem = sc.nextInt();
        qtdItem = sc.nextInt();
        if (idItem == 1) {
            precoItem = 4;
        }
        else if (idItem == 2) {
            precoItem = 4.5;
        }
        else if (idItem == 3) {
            precoItem = 5;
        }
        else if (idItem == 4) {
            precoItem = 2;
        }
        else if (idItem == 5) {
            precoItem = 1.5;
        }
        else {
            precoItem = 0;
            System.out.println("ID inválido");
        }
        valorFinal = precoItem * qtdItem;
        System.out.printf("Total: R$ %.2f", valorFinal);**/

        /**
         *
         * EXERCÍCIO 6
         *
         */

        /**double i;
        System.out.print("Digite um valor: ");
        i = sc.nextDouble();
        if (i >= 0 && i <= 25) {
            System.out.println("Intervalo [0, 25]");
        }
        else if (i <= 50) {
            System.out.println("Intervalo [26, 50]");
        }
        else if (i <= 75) {
            System.out.println("Intervalo [51, 75]");
        }
        else if (i <= 100) {
            System.out.println("Intervalo [76, 100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }**/

        /**
         *
         * EXERCÍCIO 7
         *
         */

        /**double x, y;
        System.out.print("Digite as coordenadas x, y (com 1 casa decimal, separados por espaço): ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        if (x < 0) {
            if (y < 0) {
                System.out.println("\nQuadrante Q3");
            }
            else if (y == 0) {
                System.out.println("\nEixo y");
            }
            else {
                System.out.println("\nQuadrante Q2");
            }
        }
        else if (x == 0 && y == 0) {
            System.out.println("\nOrigem");
        }
        else {
            if (y < 0) {
                System.out.println("\nQuadrante Q4");
            }
            else if (y == 0) {
                System.out.println("\nEixo x");
            }
            else {
                System.out.println("\nQuadrante Q1");
            }
        }**/

        /**
         *
         * EXERCÍCIO 8
         *
         */

        /**double salario, taxaMinima, taxaMedia, taxaMaxima, taxaFinal;
        taxaMinima = 0.08;
        taxaMedia = 0.18;
        taxaMaxima = 0.28;
        System.out.print("Digite o salário: ");
        salario = sc.nextDouble();
        if (salario <= 2000) {
            System.out.println("\nIsento");
        }
        else if (salario <= 3000) {
            taxaFinal = salario * taxaMinima;
            System.out.printf("\nR$ %.2f", taxaFinal);
        }
        else if (salario <= 4500) {
            taxaFinal = 1000 * taxaMinima + ((salario - 3000) * taxaMedia);
            System.out.printf("\nR$ %.2f", taxaFinal);
        }
        else {
            taxaFinal = 1000 * taxaMinima + 1500 * taxaMedia + ((salario - 4500) * taxaMaxima);
            System.out.printf("\nR$ %.2f", taxaFinal);
        }**/

    }

    public static void exercicios3() {

        Scanner sc = new Scanner(System.in);

        /**
         *
         * EXERCÍCIOS PARTE 2
         *
         */

        /**
         *
         * EXERCÍCIO 1
         *
         */

        /*int senha;
        System.out.println("Digite a senha: ");
        senha = sc.nextInt();
        while (senha != 2002) {
            System.out.println("Senha inválida!");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido!");*/

        /**
         *
         * EXERCÍCIO 2
         *
         */




        /**
         *
         * EXERCÍCIO 3
         *
         */




    }

}