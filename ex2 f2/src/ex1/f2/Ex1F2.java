/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.f2;

/**
 *
 * @author Paulo Brito
 */
public class Ex1F2 {

    public static void main(String[] args) {
        int[][] matriz = new int[][]{{1, 2, 3}, {4, 5, 4}, {4, 3, 9}, {7, 8, 4}};
        int soma = 0;
        int media = 0;
        
//i corre as linhas
//j corre as colunas em função do i(conta na 1 linha quantas colunas ha)

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        
System.out.println("soma = " + soma);
System.out.println("media = " + soma/(matriz.length* matriz[0].length));
    }
}
