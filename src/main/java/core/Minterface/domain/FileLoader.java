package core.Minterface.domain;

public class FileLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando os dados do arquivos");
    }

    @Override
    public void remove() {
        System.out.println("Removendo o dado do arquivo");
    }

    @Override
    public void update() {
        System.out.println("Fazendo update dos dados do arquivo");
    }
}
