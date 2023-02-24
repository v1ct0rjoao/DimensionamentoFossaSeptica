public class Industria {

    private Fabrica fabrica;
    private double producaoDiaria;
    private double cargaOrganica;

    //esse é mais o menos o modelo que a gente vai usar para uma fabrica
    //na qual temos uma fabrica(pessoa e consumo), a produção e cargaorganica(vou nem explicar)


    public Industria(Fabrica fabrica,
     double producaoDiaria, double cargaOrganica){
       
        this.fabrica = fabrica;
        this.producaoDiaria = producaoDiaria;
        this.cargaOrganica = cargaOrganica;
        //esse é um construtor de uma industria
        
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
