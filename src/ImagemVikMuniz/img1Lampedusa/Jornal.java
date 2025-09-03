package ImagemVikMuniz.img1Lampedusa;

public class Jornal {

    String titulo;
    String idioma;
    int numeroDePaginas;

    public Jornal(String titulo, String idioma, int numeroDePaginas) {
        this.titulo = titulo;
        this.idioma = idioma;
        this.numeroDePaginas = numeroDePaginas;
    }

    public void exibirNoticia() {
        System.out.println("Manchete: " + titulo + " (" + idioma + ")");
    }
}
