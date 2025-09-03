package Doodle;

public class Perifericos {
    String tipo;       // exemplo: mouse, teclado, headset
    String marca;
    boolean conectado;

    public void conectar() {
        conectado = true;
        System.out.println("O periférico " + tipo + " da marca " + marca + " foi conectado.");
    }

    public void desconectar() {
        conectado = false;
        System.out.println("O periférico " + tipo + " da marca " + marca + " foi desconectado.");
    }

    public void status() {
        System.out.println("Tipo: " + tipo + ", Marca: " + marca + ", Conectado: " + conectado);
    }
}