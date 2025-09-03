package Musica;

public class Personagem {

    String nome;
    String origem;
    boolean estaVivo;

    public Personagem(String nome, String origem, boolean estaVivo) {
        this.nome = nome;
        this.origem = origem;
        this.estaVivo = estaVivo;
    }

    public void viajar(String destino) {
        System.out.println("O personagem " + nome + " viajou para " + destino);
    }
}
