package Video;

public class Bicicleta {
    String quadro;
    int marchas;
    int aro;

    public Bicicleta(String quadro, int marchas, int aro) {
        this.quadro = quadro;
        this.marchas = marchas;
        this.aro = aro;
    }

    public void pedalar() {
        System.out.println("Bicicleta " + quadro + " pedalando.");
    }

    public void frear() {
        System.out.println("Bicicleta freando.");
    }

    public void trocarMarcha() {
        System.out.println("Trocando marcha. Total: " + marchas);
    }
}
