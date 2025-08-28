package Musica;

public class Cidade {

    String nome;
    String regiao;
    boolean eViolenta;

    public void transformar() {
        System.out.println("A cidade transformou a pessoa.");
    }

    public static void main(String[] args) {
        Cidade brasilia = new Cidade();
        brasilia.nome = "Brasilia";
        brasilia.regiao = "Plano Piloto";
        brasilia.eViolenta = true;
        brasilia.transformar();
    }

}