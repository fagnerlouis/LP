package ImagemVikMuniz.img2trackbrawl;

public class Lutador {
    String nome;
    int forca;
    boolean cansado;

    public Lutador(String nome, int forca, boolean cansado) {
        this.nome = nome;
        this.forca = forca;
        this.cansado = cansado;
    }

    public void lutar() {
        System.out.println(nome + " está lutando com força " + forca + ".");
    }
}
