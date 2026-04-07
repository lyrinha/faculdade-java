import java.util.Locale;
import java.util.Scanner;

public class descontoPrecos {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = leitor.nextDouble();

        double desconto;
        double valorFinal;
        
        if (valorCompra >= 500.00) {
            desconto = valorCompra * 0.20;
        }else if (valorCompra >= 200.00) {
            desconto = valorCompra * 0.10;
        }else {
            desconto = 0.0;
        }
            
        valorFinal = valorCompra - desconto;

        System.out.printf("Valor da compra: %.2f%n", valorCompra);
        System.out.printf("Valor do desconto: %.2f%n", desconto);
        System.out.printf("Valor final da compra: %.2f%n", valorFinal);

        leitor.close();
    }
}