import java.util.Scanner;


public class desafioFor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de registros: ");
        int n = entrada.nextInt();

        double soma = 0.0;
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        for (int i = 0; i < n; i++ ){
            System.out.print("Digite o tempo "+ (i+1) + ": ");
            double tempo = entrada.nextDouble();

            soma += tempo;

            if (tempo > maior){
                maior = tempo;
            }
            if (tempo < menor){
                menor = tempo;                
            }
        }
            double media = soma / n;

        System.out.printf("soma : %.2f%n", soma);
        System.out.printf("média: %.2f%n", media);
        System.out.printf("maior: %.2f%n", maior);
        System.out.printf("menor: %.2f%n", menor);
   
        
        entrada.close();
    }
}
