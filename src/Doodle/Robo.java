package Doodle;

public class Robo {
    String modelo;
    int nivelEnergia;
    boolean temIA;

    public Robo(String modelo, int nivelEnergia, boolean temIA) {
        this.modelo = modelo;
        this.nivelEnergia = nivelEnergia;
        this.temIA = temIA;
    }

    public void executarTarefa() {
        System.out.println("O robô " + modelo + " está executando uma tarefa.");
    }

    public void recarregar() {
        nivelEnergia += 20;
        System.out.println("O robô " + modelo + " recarregou. Energia atual: " + nivelEnergia);
    }

    public void apresentar() {
        System.out.println("Modelo: " + modelo + ", Energia: " + nivelEnergia + ", IA: " + temIA);
    }
}
