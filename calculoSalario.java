import java.util.Scanner;

public class calculoSalario {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o sálario bruto: ");
        double salarioBruto = leitor.nextDouble();

        double inss = calcularINSS(salarioBruto);
        double ir = calcularIR(salarioBruto);

        double salarioLiquido = salarioBruto - inss - ir;

        System.out.println("\n    RESULTADO   ");
        System.out.println(" Sálario Bruto: R$ " + salarioBruto);
        System.out.println("Desconto INSS: R$ " + inss);
        System.out.println("Desconto IR: R$ " + ir);
        System.out.println("Sálario Líquido: R$ " + salarioLiquido);

        leitor.close();
    }

    public static double calcularINSS(double salario) {
        if (salario <= 1412) {
            return salario * 0.08;
        } else if (salario <= 2666) {
            return salario * 0.09;
        } else if (salario <=4000) {
            return salario * 0.12;
        } else {
            return salario * 0.14;
        }
}

    public static double calcularIR(double salario) {
        if (salario <= 2112) {
            return 0;
        } else if (salario <= 2826) {
            return salario * 0.075;
        } else if (salario <= 3751) {
            return salario * 0.15;
        } else if (salario <= 4664) {
            return salario * 0.225;
        } else {
            return salario * 0.275;
        }
    }
}
