import java.util.Scanner;


public class temperaturaMedia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double soma = 0.0;
        int cont = 0;
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        System.out.println("Digite o valor da temperatura(°C): ");
        double temperatura = entrada.nextDouble();

        while (temperatura != 999){
            if (temperatura >= -50 && temperatura <= 50){
           
                if (cont == 0){
                maior = temperatura;
                menor = temperatura;
                }else {
                if (temperatura > maior) {
                maior = temperatura;
                }
                if (temperatura < menor) {
                menor = temperatura;
                }
            }
                soma += temperatura;
                cont++;        
            }else {
                System.out.println("Valor da temperatura inválido, digite outro valor.");
            }
            temperatura = entrada.nextDouble();
        }
        
        
        if (cont > 0) {
            System.out.println("Soma: " + soma);
            System.out.println("Cont: " + cont);
            System.out.println("Média: " + String.format("%.1f", soma / cont));
            System.out.println("Maior temperatura: " + maior);
            System.out.println("Menor temperatura: " + menor);

        }else {
            System.out.print("Nenhuma temperatura válida");
        }
        entrada.close();
    }

}
