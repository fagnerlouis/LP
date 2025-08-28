package Musica;

public class Personagem {

    String nome;
    String origem;
    boolean estaVivo;

    public void viajar(String destino) {
        System.out.println("O personagem viajou para " + destino);
    }

    public static void main(String[] args) {
        Personagem joaoDeSantoCristo = new Personagem();
        joaoDeSantoCristo.viajar("Brasilia");
    }

}
