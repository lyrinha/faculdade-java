import java.util.Scanner;

public class TemposSentinela {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double soma = 0.0;
        int cont = 0;

        System.out.println("Digite o tempo em minutos: ");
        
        double tempo = entrada.nextDouble();

        while (tempo != -1){

            if (tempo >= 0){
                soma += tempo;
                cont++;
            } else {

            System.out.println("Valor Negativo Ignorado (Exceto -1 Para Encerrar).");

            }

            tempo = entrada.nextDouble();
        }

        if (cont > 0) { 
        System.out.println("Média: " + String.format("%.2f", soma / cont));
        System.out.println("Soma: " + soma);
        System.out.println("Cont: " + cont);
        }else {
            System.out.println("Cont: " + cont);
            System.out.println("Nenhum tempo válido foi informado");
        }
    entrada.close();      
       
    }
}