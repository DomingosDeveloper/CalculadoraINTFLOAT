import java.util.Objects;
import java.util.Scanner;

public class CalculadoraIntFloat {
    public static void main(String[] args) {
        entrada();
        OperacaoInt operacaoInt = new OperacaoInt();
        OperacaoFloat operacaoFloat = new OperacaoFloat();
        Scanner scanner = new Scanner(System.in);

        System.out.print("SUA OPERAÇÃO É TIPO FLOAT OU INTEIRO? digite F para decimais, I para números inteiros.\n");

        divisoriaConsole();
        //--------------------------------------------------------------------------------------------

        String respostaTipoOperacao = scanner.nextLine();

        divisoriaConsole();
        // -------------------------------------------------------------------------------------------
        if (Objects.equals(respostaTipoOperacao, "I")) {
            System.out.println("Digite seu primeiro número inteiro: ");
            String numero1I_S = scanner.nextLine();
            int numero1I_Par = Integer.parseInt(numero1I_S);
            operacaoInt.setNumero1(numero1I_Par);

            divisoriaConsole();
            //----------------

            System.out.println("Digite seu segundo número inteiro: ");
            String numero2I_S = scanner.nextLine();
            int numero2I_Par = Integer.parseInt(numero2I_S);
            operacaoInt.setNumero2(numero2I_Par);

            divisoriaConsole();
            //----------------
        }
        // -------------------------------------------------------------------------------------------
        if (Objects.equals(respostaTipoOperacao, "F")) {
            System.out.println("Digite seu primeiro número decimal: ");
            String numero1F_S = scanner.nextLine();
            float numero1F_Par = Float.parseFloat(numero1F_S);
            operacaoFloat.setNumero1(numero1F_Par);

            divisoriaConsole();
            //----------------
            System.out.println("Digite seu segundo número decimal: ");
            String numero2F_S = scanner.nextLine();
            float numero2F_Par = Float.parseFloat(numero2F_S);
            operacaoFloat.setNumero2(numero2F_Par);

            divisoriaConsole();
            //----------------
        }
        // -------------------------------------------------------------------------------------------

        System.out.println("DESEJA REALIZAR QUE TIPO DE OPERAÇÃO? \n" +
                            "(-) PARA SUBTRAÇÃO .\n" +
                            "(+) PARA ADIÇÃO. \n" +
                            "(*) PARA MULTIPLICAÇÃO. \n" +
                            "(/) PARA DIVISÃO.");

        divisoriaConsole();
        // -------------------------------------------------------------------------------------------

        String operacaoMatematica = scanner.nextLine();

        if(Objects.equals(respostaTipoOperacao, "I")) {
            int total = operacaoInt.realizaOperacaoMatematicaInt(operacaoMatematica, operacaoInt.getNumero1(), operacaoInt.getNumero2());
            System.out.println("O resultado da sua conta de " + operacaoMatematica + " é: " + total);
        }

        if(Objects.equals(respostaTipoOperacao, "F")) {
            float totalF = operacaoFloat.realizaOperacaoMatematicaFloat(operacaoMatematica, operacaoFloat.getNumero1(), operacaoFloat.getNumero2());
            System.out.println("O resultado da sua conta de " + operacaoMatematica + " é: " + totalF);

        }

        divisoriaConsole();
    }

    //Entrada Calculadora
    private static void entrada (){
        double rand = Math.random();
        System.out.print("----5---BEM-VINDO---0----\n");
        System.out.print("---2---4---À----3---8----\n");
        System.out.print("-5-----CALCULADORA----9--\n");
        System.out.print("----6-----DE----6--------\n");
        System.out.print("-9-----MATEMÁTICA---2----\n");
        System.out.print("--0----1---5----6----9---\n");
    }

    //Divisória no console
    private static void divisoriaConsole(){
        System.out.println("-------------------------");
    }
}