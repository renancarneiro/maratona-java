package introducao;

public class Aula06ArraysPt3 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Fulano";
        System.out.println(nomes[0]);

        //quando tem uma nova instancia, as referencias da instancia anterior são perdidas
        nomes = new String[5];
        System.out.println(nomes[0]);
    }
}
