package app;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Estamos codando em Java");

        int a = 8;
        System.out.println(a);

        double b = 10.54321;
        System.out.println(b);
        System.out.printf("%.2f\n",b);
        System.out.printf("%.3f\n",b);

        System.out.println("4 + 4 = " + a);

        String name = "Abraão";
        int age = 19;
        double salary = 1000.00;

        // %f = float , %d = inteiro, %s = string, %c = char, %n = new line,
        // %2f = duas casas decimais.

        System.out.printf("%s tem %d anos e ganha R$ %.2f\n", name, age, salary);


        String product1 = "Computer";
        String product2 = "Office desk";

        // Exercício de fixação

        //Setando as variáveis
        int age2 = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        //Outputs

        System.out.printf("Products:\n%s, wich price is U$ %.2f\n%s, which price is U$ %.2f\n", product1, price1, product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %c%n", age2, code, gender);

        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }

}
