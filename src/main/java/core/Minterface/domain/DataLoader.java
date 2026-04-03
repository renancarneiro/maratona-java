package core.Minterface.domain;

public interface DataLoader {
    void load();
    //private -> default -> protected -> public
    //- Nível de sobrescrita: private > default (pacote) > protected > public;
    //- Toda variável em interface é uma constante;
    //- Tod métod estático é do nível da classe/interface, não permitindo Override;
    //- Não podemos criar objetos de Interfaces, Podemos chamar o métod diretamente pela interface
    default void update(){
        System.out.println("Fazendo update nos dados!");
    }


}
