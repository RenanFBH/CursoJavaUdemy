package udemyjava.javacompleto.intermediario.parte1.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula15 {

    static void main() {

        List<String> list = new ArrayList<>();
        list.add("Renan");
        list.add("Teste1");
        list.add("Teste2");
        list.add("Teste3");
        list.add(2, "A");
        for (String nome : list) {
            System.out.println(nome);
        }
        System.out.println(list.size());
        System.out.println("----------------");
        list.removeIf(x -> x.charAt(0) == 'T');
        for (String nome : list) {
            System.out.println(nome);
        }
        System.out.println(list.indexOf("Renan"));
        System.out.println("----------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String nome : result) {
            System.out.println(nome);
        }
        System.out.println("----------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);


    }

}
