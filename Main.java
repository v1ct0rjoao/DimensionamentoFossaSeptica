public class Main {

   public static void main(String[] args) {

    Pessoa[] funcionarios = new Pessoa[10]; //isso aqui é uma array de funcionarios
    Fabrica fabrica = new Fabrica(funcionarios, 10000.0); //fabrica que é composta de funcionarios e consumo
    Industria industria = new Industria(fabrica, 5000.0, 1000.0);
    //industria que é composta por uma fabrica(funcionarios e consumo), produção, cargaorganica
    FossaSeptica fossa = new FossaSeptica(0.0, 10.0, 4.0, 2.0);
    //essa é a construção da fossa
    
    double vazaoMedia =(industria.getProducaoDiaria()*industria.getCargaOrganica()) / 1000;
    //la na fossa a gente calcula a vazaMedia e agora a gente so add nossos paramentros
    double volume = vazaoMedia * fossa.calcularTempoDeRetencao(vazaoMedia);
    //la na classe fossa tem como calcular volume, so add nossos parametros
    fossa.setVolume(volume);
    //o set armazena o valor atribuido

    System.out.println("A indústria produz " + industria.getProducaoDiaria() + 
    " litros de efluente por dia, com uma carga orgânica de " + industria.getCargaOrganica());
    System.out.println("A vazão média de esgoto é de " + vazaoMedia + " m³/dia.");
    System.out.println("O tempo de retenção necessário para o tratamento do esgoto é de " +
     fossa.calcularTempoDeRetencao(vazaoMedia) + " dias.");
    System.out.println("O volume necessário para a fossa séptica é de " + fossa.getVolume() + " m³.");
}




    }
    
