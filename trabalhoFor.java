import java.util.Locale;
import java.util.Scanner;

public class trabalhoFor {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a quantidade de registros: ");
        int n = leitor.nextInt();
    
        double soma = 0.0;
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= n; i++){
            System.out.print("Digite o tempo " + i + ": ");
            double tempo = leitor.nextDouble();

            soma += tempo;

            if (tempo > maior) {
                maior = tempo;
            }
            if (tempo < menor) {
                menor = tempo;
            }
        }

        double media = soma / n;

        System.out.printf("soma : %.2f%n", soma);
        System.out.printf("média: %.2f%n", media);
        System.out.printf("maior: %.2f%n", maior);
        System.out.printf("menor: %.2f%n", menor);

        leitor.close();

    }
}
