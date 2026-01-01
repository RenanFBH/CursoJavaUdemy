package udemyjava.javacompleto.basico;

public class Aula05 {

    public static void main(String[] args) {

        String original = "AAVAVAVKnk najdnjsajnBNAJB   ";
        System.out.println(original);
        String s1 = original.toLowerCase();
        System.out.println(s1);
        String s2 = original.toUpperCase();
        System.out.println(s2);
        String s3 = original.trim();
        System.out.println(s3);
        String s4 = original.substring(3, 10);
        System.out.println(s4);
        String s5 = original.replace('A', 'B');
        System.out.println(s5);
        int x = original.indexOf("K");
        System.out.println(x);
        int y = original.lastIndexOf("A");
        System.out.println(y);

        String s = "Teste1 Teste2 Teste3";
        String[] vetor = s.split(" ");
        for (String p : vetor) {
            System.out.println(p);
        }


    }

}
