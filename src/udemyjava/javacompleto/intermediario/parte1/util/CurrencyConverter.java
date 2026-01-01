package udemyjava.javacompleto.intermediario.parte1.util;

public class CurrencyConverter {

    public static final double TAX = 0.06;
    public static double dollarPrice;
    public static double dollarsWillBeBought;


    public static double paidInReais() {
        return (dollarPrice * dollarsWillBeBought) + dollarPrice * dollarsWillBeBought * TAX;
    }

}
