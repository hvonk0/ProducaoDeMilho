import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0, maior = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Produção da semana " + i + ": ");
            double producao = sc.nextDouble();

            total += producao;

            if (producao > maior) {
                maior = producao;
            }
        }

        double media = total / 7;

        System.out.println("\nProdução total: " + total + " toneladas");
        System.out.println("Média semanal: " + media + " toneladas");
        System.out.println("Maior produção: " + maior + " toneladas");

        sc.close();
    }
}