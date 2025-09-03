package ImagemVikMuniz.img1Lampedusa;

public class Barco {

    String material;
    double tamanho;
    int capacidade;

    public Barco(String material, double tamanho, int capacidade) {
        this.material = material;
        this.tamanho = tamanho;
        this.capacidade = capacidade;
    }

    public void navegar() {
        System.out.println("O barco de " + material + " está navegando.");
    }
}
