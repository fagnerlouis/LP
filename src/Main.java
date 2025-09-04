import Musica.Arma;
import Musica.Cidade;
import Musica.Personagem;

import ImagemVikMuniz.img1Lampedusa.Barco;
import ImagemVikMuniz.img1Lampedusa.Jornal;

import Doodle.Astronauta;
import Doodle.Perifericos;
import Doodle.Robo;

import ImagemVikMuniz.img2trackbrawl.Trilho;
import ImagemVikMuniz.img2trackbrawl.Lutador;
import ImagemVikMuniz.img2trackbrawl.Mala;

import Video.Bicicleta;
import Video.Capacete;
import Video.Camera;


public class Main {
    public static void main(String[] args) {
        // -------- Música (classe aparece na letra) --------
        System.out.println("---------------------------------------------------------");
        System.out.println("Música: Faroeste Caboclo");
        System.out.println();
        Personagem joao = new Personagem("João de Santo Cristo", "Interior", true);
        Cidade brasilia = new Cidade("Brasília", "Plano Piloto", true);
        Arma winchester = new Arma("Winchester .22", 5, "João");

        joao.viajar("Brasília");
        brasilia.transformar();
        winchester.atirar(5);
        System.out.println();
        System.out.println();

        // -------- Imagem Vik Muniz: Lampedusa --------
        System.out.println("---------------------------------------------------------");
        System.out.println("Imagem Vik Muniz: Lampedusa");
        System.out.println();
        Barco barcoDePapel = new Barco("papel", 5.0, 2);
        ImagemVikMuniz.img1Lampedusa.Cidade veneza = new ImagemVikMuniz.img1Lampedusa.Cidade("Veneza", 3000, "Itália");
        Jornal jornal = new Jornal("Centinaia di morti", "Italiano", 24);

        barcoDePapel.navegar();
        veneza.descricao();
        jornal.exibirNoticia();
        System.out.println();
        System.out.println();

        // -------- Imagem Vik Muniz: Track Brawl --------
        System.out.println("---------------------------------------------------------");
        System.out.println("Imagem Vik Muniz: Track Brawl");
        System.out.println();
        Trilho trilho = new Trilho("aço", 100.0, true);
        Lutador homem1 = new Lutador("Homem A", 80, false);
        Lutador homem2 = new Lutador("Homem B", 75, false);
        Mala mala = new Mala("marrom", "couro", false);

        trilho.transportar();
        homem1.lutar();
        homem2.lutar();
        mala.abrir();
        System.out.println();
        System.out.println();

        // -------- Doodle --------
        System.out.println("---------------------------------------------------------");
        System.out.println("Doodle");
        System.out.println();
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
        System.out.println();
        System.out.println();


        // -------- Vídeo --------
        System.out.println("---------------------------------------------------------");
        System.out.println("Vídeo Downhill de bicicleta");
        System.out.println();
        Bicicleta bike = new Bicicleta("Alumínio 6061", 21, 29);
        Capacete capacete = new Capacete("M", "ABS", false);
        Camera camera = new Camera("4K", 60, false);

        bike.pedalar();
        bike.trocarMarcha();
        bike.frear();

        capacete.ajustar();
        capacete.prender();
        capacete.inspecionar();

        camera.gravar();
        camera.parar();
        camera.trocarBateria();
        System.out.println();
        System.out.println();

    }
}