import java.net.PortUnreachableException;

public class Pessoa {

    private String nome;
    private int idade;
    private char sexo;
    private double peso;
    private double consumoDiarioDeagua;


    public Pessoa(String nome, int idade, char sexo,
    double peso, double consumoDiarioDeagua){

        this.nome = nome;
        this.idade =  idade;
        this.sexo = sexo;
        this.peso = peso;
        this.consumoDiarioDeagua = consumoDiarioDeagua;

    }


    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public char getSexo(){
        return sexo;
    }

    public double getPeso(){
        return peso;
    }

    public double getConsumoDiarioDeagua(){
        return consumoDiarioDeagua;
    }
    
}
