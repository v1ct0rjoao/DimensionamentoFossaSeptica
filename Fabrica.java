public class Fabrica {

    private Pessoa[] fucionarios;
    private double consumoDiarioDeagua;

    public Fabrica(Pessoa[] funcionarios, double consumoDiarioDeagua){

        this.fucionarios = funcionarios;
        this.consumoDiarioDeagua = consumoDiarioDeagua;
    }

    public Pessoa[] getFuncionarios(){
        return fucionarios;
    }

    public double getConsumoDiarioDeagua(){
        return consumoDiarioDeagua;
    }
}
