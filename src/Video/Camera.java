package Video;

public class Camera {
    String resolucao;
    int fps;
    boolean gravando;

    public Camera(String resolucao, int fps, boolean gravando) {
        this.resolucao = resolucao;
        this.fps = fps;
        this.gravando = gravando;
    }

    public void gravar() {
        gravando = true;
        System.out.println("Gravando em " + resolucao + " @" + fps + "fps.");
    }

    public void parar() {
        gravando = false;
        System.out.println("Parou de gravar.");
    }

    public void trocarBateria() {
        System.out.println("Bateria trocada.");
    }
}