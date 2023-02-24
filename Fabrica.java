public class Fabrica {

    //a que a gente ta criando um modelo de fabrica, ou seja, uma fabrica tem pessoas e tem consumo de agua
    private Pessoa[] fucionarios;
    private double consumoDiarioDeagua;

    public Fabrica(Pessoa[] funcionarios, double consumoDiarioDeagua){

        this.fucionarios = funcionarios;
        this.consumoDiarioDeagua = consumoDiarioDeagua;
        //esse é o cosntrutor de de fabrica
    }

    public Pessoa[] getFuncionarios(){
        return fucionarios;
    }

    public double getConsumoDiarioDeagua(){
        return consumoDiarioDeagua;
    }
}
