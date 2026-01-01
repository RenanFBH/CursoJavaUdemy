package udemyjava.javacompleto.intermediario.parte1.poo;

public class Aula14 {

    static void main() {

        String[] vect = new String[] {"Teste1", "Teste2", "Teste3"};
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        for(String obj : vect) {
            System.out.println(obj);
        }

    }

}
