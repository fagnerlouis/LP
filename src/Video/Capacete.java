package Video;

public class Capacete {
    String tamanho;
    String material;
    boolean preso;

    public Capacete(String tamanho, String material, boolean preso) {
        this.tamanho = tamanho;
        this.material = material;
        this.preso = preso;
    }

    public void ajustar() {
        System.out.println("Ajustando capacete tamanho " + tamanho + ".");
    }

    public void prender() {
        preso = true;
        System.out.println("Capacete preso.");
    }

    public void inspecionar() {
        System.out.println("Capacete de " + material + " inspecionado.");
    }
}
