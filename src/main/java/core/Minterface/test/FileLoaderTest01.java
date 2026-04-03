package core.Minterface.test;

import core.Minterface.domain.DataLoader;
import core.Minterface.domain.FileLoader;

public class FileLoaderTest01 {
    public static void main(String[] args) {
        FileLoader fileLoader = new FileLoader();
        fileLoader.load();
        fileLoader.remove();
        fileLoader.update();
    }
}
