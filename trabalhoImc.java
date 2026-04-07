import java.util.Scanner;


public class trabalhoImc {

    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         
         System.out.print("Digite seu peso (kg): ");
         double peso = leitor.nextDouble();

         System.out.print("Digite sua altura: ");
         double altura = leitor.nextDouble();

         double imc = peso / (altura*altura);

         System.out.printf("Seu IMC é: %.2f%n", imc );

         leitor.close();

    }
}