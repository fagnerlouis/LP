package ImagemVikMuniz.img1Lampedusa;

public class Barco {

    String material;
    double tamanho;
    int capacidade;

    public void navegar() {
        System.out.println("O barco de " + material + " está navegando.");
    }

    public static void main(String[] args) {
        Barco barcoDePapel = new Barco();
        barcoDePapel.material = "papel";
        barcoDePapel.tamanho = 5.0;
        barcoDePapel.capacidade = 2;

        barcoDePapel.navegar();
    }
}

