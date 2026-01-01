package udemyjava.javacompleto.intermediario.parte2.exercicios.secao12.exercicioresolvido2.test;

import udemyjava.javacompleto.intermediario.parte2.exercicios.secao12.exercicioresolvido2.entities.Comment;
import udemyjava.javacompleto.intermediario.parte2.exercicios.secao12.exercicioresolvido2.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        LocalDateTime d1 = LocalDateTime.parse("21/06/2018 13:05:44", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        Post p1 = new Post(d1, "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
        p1.addComment(c1);
        p1.addComment(c2);
        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        LocalDateTime d2 = LocalDateTime.parse("28/07/2018 23:14:19", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        Post p2 = new Post(d2, "Good night guys", "See you tomorrow", 5);
        p2.addComment(c3);
        p2.addComment(c4);
        System.out.println(p1);
        System.out.println();
        System.out.println(p2);
    }
}
