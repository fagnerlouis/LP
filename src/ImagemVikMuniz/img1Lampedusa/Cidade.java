package ImagemVikMuniz.img1Lampedusa;

public class Cidade {

    String nome;
    int numeroDePredios;
    String pais;

    public void descricao() {
        System.out.println(nome + " está localizada em " + pais + " e possui cerca de " + numeroDePredios + " prédios.");
    }

    public static void main(String[] args) {
        Cidade veneza = new Cidade();
        veneza.nome = "Veneza";
        veneza.numeroDePredios = 3000;
        veneza.pais = "Itália";

        veneza.descricao();
    }
}

