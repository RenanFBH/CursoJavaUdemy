package udemyjava.javacompleto.intermediario.parte1.poo;

import udemyjava.javacompleto.intermediario.parte1.entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        exercicio12();

    }

    public static void exercicio1() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe quantos números você quer digitar: ");
        int n = sc.nextInt();
        int[] arrayNumber = new int[n];
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = sc.nextInt();
        }
        System.out.print("\nNúmeros negativos: \n");
        for (int num : arrayNumber) {
            if (num < 0) {
                System.out.println(num);
            }
        }
        sc.close();

    }

    public static void exercicio2() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe quantos números você vai digitar: ");
        int n = sc.nextInt();
        double[] arrayReais = new double[n];
        for (int i = 0; i < arrayReais.length; i++) {
            arrayReais[i] = sc.nextDouble();
        }

        System.out.print("\nValores: ");
        double sum = 0;
        for (int i = 0; i < arrayReais.length; i++) {
            System.out.print(arrayReais[i] + " ");
            sum += arrayReais[i];
        }
        System.out.print("\nSoma: " + sum);
        System.out.print("\nMedia: " + sum / arrayReais.length);
        sc.close();

    }

    public static void exercicio3() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int qtyPeople = sc.nextInt();
        People[] peoples = new People[qtyPeople];
        for (int i = 0; i < peoples.length; i++) {
            System.out.print("\nDados da " + (i+1) + "° pessoa: ");
            System.out.print("\nNome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            peoples[i] = new People(name, age, height);
        }
        double avgHeight = 0;
        int avgPeopleUnder16 = 0;
        for (int i = 0; i < peoples.length; i++) {
            avgHeight += peoples[i].getHeight();
            if (peoples[i].getAge() < 16) {
                ++avgPeopleUnder16;
            }
        }
        avgPeopleUnder16 = (avgPeopleUnder16 * 100) / peoples.length;
        System.out.print("\nAltura média: " + avgHeight / peoples.length);
        System.out.print("\nPessoas com menos de 16 anos: " + avgPeopleUnder16 + "%\n");
        for (int i = 0; i < peoples.length; i++) {
            if (peoples[i].getAge() < 16) {
                System.out.println(peoples[i].getName());
            }
        }

        sc.close();

    }

    public static void exercicio4() {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nQuantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] arrayNumeros = new int[n];
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print("Digite um número: ");
            arrayNumeros[i] = sc.nextInt();
        }
        int contadorPar = 0;
        System.out.print("\nNúmeros pares: ");
        for (int num : arrayNumeros) {
            if (num % 2 == 0) {
                contadorPar++;
                System.out.print(num + " ");
            }
        }
        System.out.print("\nQuantidade de números pares: " + contadorPar);

        sc.close();

    }

    public static void exercicio5() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int num = sc.nextInt();
        double[] vetorReais = new double[num];
        for (int i = 0; i < vetorReais.length; i++) {
            System.out.print("\nDigite um número: ");
            vetorReais[i] = sc.nextDouble();
        }
        double maiorValor = 0;
        int posicaoMaiorValor = 0;
        for (int i = 0; i < vetorReais.length; i++) {
            if (i > 0 && vetorReais[i] > vetorReais[i-1]) {
                maiorValor = vetorReais[i];
                posicaoMaiorValor = i;
            }
            else {
                maiorValor = vetorReais[i];
                posicaoMaiorValor = i;
            }
        }
        System.out.println("Maior valor = " + maiorValor);
        System.out.println("Posição do maior valor = " + posicaoMaiorValor);
        sc.close();

    }

    public static void exercicio6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        int[] vetorNum1 = new int[n];
        int[] vetorNum2 = new int[n];
        int[] vetorResultante = new int[n];
        System.out.print("\nVetor A:\n");
        for (int i = 0; i < vetorNum1.length; i++) {
            vetorNum1[i] = sc.nextInt();
        }
        System.out.print("\nVetor B:\n");
        for (int i = 0; i < vetorNum2.length; i++) {
            vetorNum2[i] = sc.nextInt();
        }
        System.out.print("\nVetor resultante:\n");
        for (int i = 0; i < n; i++) {
            vetorResultante[i] = vetorNum1[i] + vetorNum2[i];
            System.out.println(vetorResultante[i]);
        }



        sc.close();
    }

    public static void exercicio7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int num = sc.nextInt();
        double[] vetorMedia = new double[num];
        for (int i = 0; i < vetorMedia.length; i++) {
            System.out.print("Digite um número: ");
            vetorMedia[i] = sc.nextDouble();
        }
        double media = 0;
        for (double n : vetorMedia) {
            media += n;
        }
        media /= vetorMedia.length;
        System.out.printf("\nMedia do vetor = %.3f", media);
        System.out.print("\nElementos abaixo da média:\n");
        for (double n : vetorMedia) {
            if (n < media) {
                System.out.print(n + " ");
            }
        }
        sc.close();
    }

    public static void exercicio8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }
        double mediaPares = 0;
        int quantidadePares = 0;
        for (double num : vetor) {
            if (num % 2 == 0) {
                mediaPares += num;
                quantidadePares++;
            }
        }
        mediaPares /= quantidadePares;
        if (quantidadePares != 0) {
            System.out.printf("Média dos pares = %.1f", mediaPares);
        } else {
            System.out.print("Nenhum número par");
        }

        sc.close();
    }

    public static void exercicio9() {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai digitar? ");
        int qtdPessoas = sc.nextInt();
        String[] nomePessoas = new String[qtdPessoas];
        int[] idadePessoas = new int[qtdPessoas];
        for (int i = 0; i < qtdPessoas; i++) {
            System.out.print("Dados da " + (i + 1) + "° pessoa\n");
            System.out.print("Nome: ");
            sc.nextLine();
            nomePessoas[i] = sc.nextLine();
            System.out.print("Idade: ");
            idadePessoas[i] = sc.nextInt();
        }
        int pessoaComMaiorIdade = 0;
        for (int i = 0; i < qtdPessoas; i++) {
            if (idadePessoas[i] > idadePessoas[pessoaComMaiorIdade]) {
                pessoaComMaiorIdade = i;
            }
        }
        System.out.print("Pessoa mais velha: " + nomePessoas[pessoaComMaiorIdade]);
        sc.close();
    }

    public static void exercicio10() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serão digitados? ");
        int qtdAlunos = sc.nextInt();
        String[] nomeAlunos = new String[qtdAlunos];
        double[][] notaAlunos = new double[qtdAlunos][2];
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.print("Digite o nome, primeira nota e segunda nota do " + (i+1) + " aluno: \n");
            sc.nextLine();
            nomeAlunos[i] = sc.nextLine();
            notaAlunos[i][0] = sc.nextDouble();
            notaAlunos[i][1] = sc.nextDouble();
        }
        double media = 0;
        System.out.print("\nAlunos aprovados: ");
        for (int i = 0; i < qtdAlunos; i++) {
            media = notaAlunos[i][0] + notaAlunos[i][1];
            if (media > 6) {
                System.out.print(nomeAlunos[i]);
            }
        }


        sc.close();
    }

    public static void exercicio11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int qtdPessoas = sc.nextInt();
        double[] altura = new double[qtdPessoas];
        char[] genero = new char[qtdPessoas];
        for (int i = 0; i < qtdPessoas; i++) {
            System.out.print("Altura da " + (i+1) + "° pessoa: ");
            altura[i] = sc.nextDouble();
            System.out.print("Gênero da " + (i + 1) + "° pessoa: ");
            genero[i] = sc.next().charAt(0);
        }
        double maiorAltura = 0;
        double menorAltura = 100;
        double mediaAlturaDasMulheres = 0;
        int numeroDeHomens = 0;
        for (int i = 0; i < qtdPessoas; i++) {

            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            } else if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }

            if (genero[i] == 'M') {
                numeroDeHomens++;
            } else {
                mediaAlturaDasMulheres += altura[i];
            }

        }
        mediaAlturaDasMulheres /= (qtdPessoas - numeroDeHomens);
        System.out.printf("Menor altura = %.2f", menorAltura);
        System.out.printf("\nMaior altura = %.2f", maiorAltura);
        System.out.printf("\nMédia das alturas das mulheres = %.2f", mediaAlturaDasMulheres);
        System.out.print("\nNúmero de homens = " + numeroDeHomens);

        sc.close();
    }

    public static void exercicio12() {

        Scanner sc = new Scanner(System.in);
        String[] quartos = new String[10];
        System.out.print("Quantidade de estudantes que vão alugar quartos: ");
        int qtdEstudantes = sc.nextInt();
        String[] nomeEstudantes = new String[qtdEstudantes];
        String[] emailEstudantes = new String[qtdEstudantes];
        int quartoDoEstudante;
        for (int i = 0; i < qtdEstudantes; i++) {
            System.out.print("Aluno " + (i+1) + ":\n");
            System.out.print("Nome: ");
            sc.nextLine();
            nomeEstudantes[i] = sc.nextLine();
            System.out.print("Email: ");
            emailEstudantes[i] = sc.nextLine();
            System.out.print("Quarto: ");
            quartoDoEstudante = sc.nextInt();
            quartos[quartoDoEstudante] = nomeEstudantes[i] + ", " + emailEstudantes[i];
        }
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.print((i+1) + ": " + quartos[i] + "\n");
            }
        }


        sc.close();

    }

}
