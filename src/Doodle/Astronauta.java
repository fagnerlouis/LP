package Doodle;

public class Astronauta {
    String nome;
    String missao;
    int nivelOxigenio;

    public Astronauta(String nome, String missao, int nivelOxigenio) {
        this.nome = nome;
        this.missao = missao;
        this.nivelOxigenio = nivelOxigenio;
    }

    public void explorar() {
        System.out.println("O astronauta " + nome + " está explorando a missão " + missao + ".");
    }

    public void comunicar() {
        System.out.println("O astronauta " + nome + " está se comunicando com a base.");
    }

    public void reabastecerOxigenio() {
        nivelOxigenio += 30;
        System.out.println("Oxigênio reabastecido. Nível atual: " + nivelOxigenio);
    }
}
