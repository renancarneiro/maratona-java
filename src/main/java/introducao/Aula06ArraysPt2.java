package introducao;

public class Aula06ArraysPt2 {
    public static void main(String[] args) {
        //valores padroes sem inicialização
        // byte, short, int, long, float e double serão 0
        // char '\u0000' será vazio
        // boolean false
        // String null

        String[] idades = new String[3];
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
