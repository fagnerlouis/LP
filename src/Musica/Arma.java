package Musica;

public class Arma {

    String modelo;
    int qtdtiros;
    String dono;

    public Arma(String modelo, int qtdtiros, String dono) {
        this.modelo = modelo;
        this.qtdtiros = qtdtiros;
        this.dono = dono;
    }

    public void atirar(int tiros) {
        System.out.println("A arma " + modelo + " disparou " + tiros + " tiros");

        for (int i = 1; i <= tiros; i++) {
            System.out.println("pow");
        }

    }
}
