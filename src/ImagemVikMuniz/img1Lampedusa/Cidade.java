package ImagemVikMuniz.img1Lampedusa;

public class Cidade {

    String nome;
    int numeroDePredios;
    String pais;

    public Cidade(String nome, int numeroDePredios, String pais) {
        this.nome = nome;
        this.numeroDePredios = numeroDePredios;
        this.pais = pais;
    }

    public void descricao() {
        System.out.println(nome + " está localizada em " + pais + " e possui cerca de " + numeroDePredios + " prédios.");
    }
}
