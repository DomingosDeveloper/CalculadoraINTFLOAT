import java.util.Objects;

public class OperacaoFloat extends Operacao{

    private float numero1;
    private float numero2;

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float realizaOperacaoMatematicaFloat(String operacaoMatematica, float numero2, float numero1) {
        String operacaoMatematicaString = operacaoMatematica;

        if (Objects.equals(operacaoMatematicaString, "-")){
            float sub = numero1 - numero2;
            return sub;
        }

        if (Objects.equals(operacaoMatematicaString, "+")){
            float soma =  numero1 + numero2;
            return soma;
        }

        if (Objects.equals(operacaoMatematicaString, "/")){
            float divisao = numero2 / numero1;
            return divisao;
        }

        if (Objects.equals(operacaoMatematicaString, "*")){
            float mult = numero1 * numero2;
            return mult;
        }
        return 0;
    }
}
