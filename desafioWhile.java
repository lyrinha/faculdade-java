import java.util.Scanner;

public class desafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = 0;
        while (n <= 0){
        System.out.print("numero de amostras: ");
        n = entrada.nextInt();
        }
        
        double soma = 0.0 ;

        for(int i = 0; i < n; i++) {
            double tempo;
            
            while(true){
                System.out.print("Tempo " + (i+1)+ ": ");
                tempo = entrada.nextDouble();

                if(tempo >=0){
                    break;
                }
                

            }
            soma += tempo;
        }
            System.out.printf("Média: %.2f%n", soma/n);
            entrada.close();
        
    }
}



        

        