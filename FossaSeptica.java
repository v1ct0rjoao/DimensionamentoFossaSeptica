public class FossaSeptica{
    private double volume;
    private double altura;
    private double comprimento;
    private double largura;

    //essa é uma fabrica de fossa, onde temos todos os aspectos de uma fossa

    public FossaSeptica(double volume, double altura, 
    double comprimento, double largura){

        this.volume = (altura * comprimento * largura);
        this.altura = altura;
        this.comprimento = comprimento;
        this.largura = largura;
        //aqui é como construir uma fossa
    }

    public double getVolume(){
        return volume;
    }

    public double getAltura(){
        return altura;
    }

    public double getComprimento(){
        return comprimento;
    }

    public double getLargura(){
        return largura;
    }

    public void setVolume(double volume){
        this.volume = volume;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public double calcularVolume(){
        double volumeDaFossa = altura * comprimento *largura;
        return volumeDaFossa;
    }

    public double calcularTempoDeRetencao(double vazaoMedia){
        double tr = volume / vazaoMedia;
        return tr;
    }


}