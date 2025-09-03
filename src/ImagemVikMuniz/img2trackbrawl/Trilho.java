package ImagemVikMuniz.img2trackbrawl;

public class Trilho {
    String material;
    double comprimento;
    boolean emUso;

    public Trilho(String material, double comprimento, boolean emUso) {
        this.material = material;
        this.comprimento = comprimento;
        this.emUso = emUso;
    }

    public void transportar() {
        System.out.println("O trilho de " + material + " conduzindo trem em " + comprimento + " metros.");
    }
}
