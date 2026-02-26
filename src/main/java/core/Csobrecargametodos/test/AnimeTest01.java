package core.Csobrecargametodos.test;

import core.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.setNome("DEATH NOTE");
//        anime.setTipo("STREAMING");
//        anime.setEpisodios(10);

        anime.init("DEATH NOTE", "STREAMING");
        anime.imprime();
        anime.init("DEATH NOTE", "STREAMING", 10);
        anime.imprime();

    }
}
