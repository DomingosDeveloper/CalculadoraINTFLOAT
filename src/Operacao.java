public class Operacao {
    private String tipoData;
    private String operacaoMatematica;
    private boolean temOperacaoMatematica;
    private int resultadoInt;

    public void setTipoData (String tipo){this.tipoData = tipo;}

    public String getTipoData (){return this.tipoData;}

    public void setOperacaoMatematica (String operacaoMatematica){
        this.operacaoMatematica = operacaoMatematica;
    }

    public String getOperacaoMatematica() {
        return operacaoMatematica;
    }

    public Boolean getTemOperacaoMatematica(){
        return this.temOperacaoMatematica;
    }
}
