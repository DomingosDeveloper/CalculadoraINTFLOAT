import java.util.Objects;

public class OperacaoInt extends Operacao {

        private int numero1;
        private int numero2;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int realizaOperacaoMatematicaInt(String operacaoMatematica, int numero1, int numero2){
        String operacaoMatematicaString = operacaoMatematica;

        if (Objects.equals(operacaoMatematicaString, "-")){
            int sub = numero1 - numero2;
            return sub;
        }

        if (Objects.equals(operacaoMatematicaString, "+")){
            int soma =  numero1 + numero2;
            return soma;
        }

        if (Objects.equals(operacaoMatematicaString, "/")){
            int divisao = numero1 / numero2;
            return divisao;
        }

        if (Objects.equals(operacaoMatematicaString, "*")){
            int mult = numero1 * numero2;
            return mult;
        }
        return 0;
    }
}
