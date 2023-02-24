public class Main {

   public static void main(String[] args) {

    Pessoa[] funcionarios = new Pessoa[10];
    Fabrica fabrica = new Fabrica(funcionarios, 10000.0);
    Industrica industria = new Industrica(fabrica, 5000.0, 1000.0);
    FossaSeptica fossa = new FossaSeptica(0.0, 2.0, 4.0, 2.0);
    
    double vazaoMedia =(industria.getProducaoDiaria()*industria.getCargaOrganica()) / 1000;
    double volume = vazaoMedia * fossa.calcularTempoDeRetencao(vazaoMedia);
    fossa.setVolume(volume);

    System.out.println("A indústria produz " + industria.getProducaoDiaria() + " litros de efluente por dia, com uma carga orgânica de " + industria.getCargaOrganica() + " mg/L de DBO.");
    System.out.println("A vazão média de esgoto é de " + vazaoMedia + " m³/dia.");
    System.out.println("O tempo de retenção necessário para o tratamento do esgoto é de " + fossa.calcularTempoDeRetencao(vazaoMedia) + " dias.");
    System.out.println("O volume necessário para a fossa séptica é de " + fossa.getVolume() + " m³.");
}




    }
    
