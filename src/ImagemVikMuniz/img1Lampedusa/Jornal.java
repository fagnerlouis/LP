package ImagemVikMuniz.img1Lampedusa;

public class Jornal {

    String titulo;
    String idioma;
    int numeroDePaginas;

    public void exibirNoticia() {
        System.out.println("Manchete: " + titulo + " (" + idioma + ")");
    }

    public static void main(String[] args) {
        Jornal jornal = new Jornal();
        jornal.titulo = "Centenaia di morti";
        jornal.idioma = "Italiano";
        jornal.numeroDePaginas = 24;

        jornal.exibirNoticia();
    }
}

