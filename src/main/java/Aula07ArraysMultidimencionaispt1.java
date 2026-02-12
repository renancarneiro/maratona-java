package org.example;

public class Aula07ArraysMultidimencionaispt1
{
    public static void main(String[] args) {
        int[][] dias = new int[3][4];
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;
        dias[0][3] = 4;

        dias[1][0] = 5;
        dias[1][1] = 6;
        dias[1][2] = 7;
        dias[1][3] = 8;

        dias[2][0] = 9;
        dias[2][1] = 10;
        dias[2][2] = 11;
        dias[2][3] = 12;

        for(int i=0; i<dias.length;i++){
            for (int j=0; j<dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("=====================================");

        for(int[] arr: dias){
            for(int num: arr){
                System.out.println(num);
            }
        }
    }
}
