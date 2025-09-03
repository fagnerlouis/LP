package Musica;

public class Cidade {

    String nome;
    String regiao;
    boolean eViolenta;

    public Cidade(String nome, String regiao, boolean eViolenta) {
        this.nome = nome;
        this.regiao = regiao;
        this.eViolenta = eViolenta;
    }

    public void transformar() {
        System.out.println("A cidade " + nome + " transformou a pessoa.");
    }
}
