package udemyjava.javacompleto.intermediario.parte1.entities;

public class Student {

    public String name;
    public double[] score = new double[3];

    public void finalScore () {

        double finalScore = 0;
        for (double scoreFor : score) {
            finalScore += scoreFor;
        }
        if (finalScore >= 60) {
            String report = "FINAL GRADE = %.2f%nPASS";
            System.out.printf(report, finalScore);
        } else {
            String report = "FINAL GRADE = %.2f%nFAILED!%nMISSING%n%.2f POINTS";
            System.out.printf(report, finalScore, (60 - finalScore));
        }
    }


}
