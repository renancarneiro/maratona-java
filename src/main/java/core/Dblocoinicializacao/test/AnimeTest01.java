package core.Dblocoinicializacao.test;


import core.Dblocoinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Teste");

        System.out.println(anime.getEpisodios());
    }

}
