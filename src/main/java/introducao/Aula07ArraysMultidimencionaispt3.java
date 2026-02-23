package introducao;

public class Aula07ArraysMultidimencionaispt3 {

    public static void main(String[] args) {
        int[][] dias = new int[3][5];

        for(int[] array: dias){
            System.out.println(array);
            for(int num: array){
                System.out.println(num);
            }
        }
    }
}
