package app;

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
    }

}
