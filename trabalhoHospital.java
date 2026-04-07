import java.util.Locale;
import java.util.Scanner;


public class trabalhoHospital {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Pulsação do paciente: ");
        int pulso = leitor.nextInt();

            if (pulso < 60) {
            System.out.println("Bradicardia");
            }else if (pulso <= 100) {
            System.out.println("Normal");
            }else {
            System.out.println("Taquicardia");
            }

            System.out.print("Escreva 1 para emergencia, 2 para consulta de rotina e 3 para retirada de exames: ");
            int opcao = leitor.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Emergencia");
                    break;
                case 2:
                    System.out.println("consulta de rotina");
                    break;
                case 3:
                    System.out.println("retirada de exames");
                    break;
                default:
                    System.out.println("Opção não existente, favor colocar um número de 1 a 3");
                    break;

            }
            
            leitor.close();
    }
    
}
