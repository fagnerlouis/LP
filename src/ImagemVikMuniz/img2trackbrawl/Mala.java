package ImagemVikMuniz.img2trackbrawl;

public class Mala {
    String cor;
    String material;
    boolean aberta;

    public Mala(String cor, String material, boolean aberta) {
        this.cor = cor;
        this.material = material;
        this.aberta = aberta;
    }

    public void abrir() {
        aberta = true;
        System.out.println("A mala de cor " + cor + " foi aberta.");
    }
}