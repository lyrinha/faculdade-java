import java.util.Locale;
import java.util.Scanner;

public class RegistroAtendimento {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o numero de registros: ");
        int n = leitor.nextInt();

        double soma = 0.0;
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        for (int i=1; i<=n ; i++){
            System.out.print("escreva o tempo " + i + ": ");
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

            System.out.printf("Soma: %.2f%n", soma);
            System.out.printf("Média: %.2f%n", media);
            System.out.printf("Maior: %.2f%n", maior);
            System.out.printf("Menor: %.2f%n", menor);
            leitor.close();

    }
 }