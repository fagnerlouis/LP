package Musica;

public class Arma {

    String modelo;
    int qtdtiros;
    String dono;

    public void atirar(int tiros) {
        System.out.println("A arma disparou " + tiros + " tiros");
    }

    public static void main(String[] args) {
        Arma winchester22 = new Arma();
        winchester22.atirar(5);
    }

}