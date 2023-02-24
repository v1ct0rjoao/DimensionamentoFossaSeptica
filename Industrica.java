public class Industrica {

    private Fabrica fabrica;
    private double producaoDiaria;
    private double cargaOrganica;


    public Industrica(Fabrica fabrica,
     double producaoDiaria, double cargaOrganica){
       
        this.fabrica = fabrica;
        this.producaoDiaria = producaoDiaria;
        this.cargaOrganica = cargaOrganica;
        
    }
    

    public Fabrica getFabrica(){
        return fabrica;
    }

    public double getProducaoDiaria(){
        return producaoDiaria;
    }

    public double getCargaOrganica(){
        return cargaOrganica;
    }
}
