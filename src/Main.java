import Musica.Arma;
import Musica.Cidade;
import Musica.Personagem;

import ImagemVikMuniz.img1Lampedusa.Barco;
import ImagemVikMuniz.img1Lampedusa.Jornal;

import Doodle.Astronauta;
import Doodle.Perifericos;
import Doodle.Robo;

public class Main {
    public static void main(String[] args) {
        // -------- Música (classe aparece na letra) --------
        Personagem joao = new Personagem("João de Santo Cristo", "Interior", true);
        Cidade brasilia = new Cidade("Brasília", "Plano Piloto", true);
        Arma winchester = new Arma("Winchester .22", 6, "João");

        joao.viajar("Brasília");
        brasilia.transformar();
        winchester.atirar(5);

        // -------- Imagem Vik Muniz: Lampedusa --------
        Barco barcoDePapel = new Barco("papel", 5.0, 2);
        ImagemVikMuniz.img1Lampedusa.Cidade veneza = new ImagemVikMuniz.img1Lampedusa.Cidade("Veneza", 3000, "Itália");
        Jornal jornal = new Jornal("Centinaia di morti", "Italiano", 24);

        barcoDePapel.navegar();
        veneza.descricao();
        jornal.exibirNoticia();

        // -------- Doodle --------
        Astronauta astro = new Astronauta("Neil", "Exploração Lunar", 70);
        Perifericos mouse = new Perifericos("Mouse", "Logitech", false);
        Robo robo = new Robo("RX-78", 50, true);

        astro.explorar();
        astro.comunicar();
        astro.reabastecerOxigenio();

        mouse.status();
        mouse.conectar();
        mouse.status();

        robo.apresentar();
        robo.executarTarefa();
        robo.recarregar();
    }
}
