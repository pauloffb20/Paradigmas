/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

/**
 *
 * @author Paulo Brito
 */
public class Ex6 {

    public static void main(String[] args) {
        int[] listaA = new int[]{2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
        int[] listaB = new int[]{6, 99, -1, 12, 1, -2};
        int repetidos = 0;
        int[] posicao = new int [10];
        

        for (int i = 0; i < listaA.length; i++) {
            for (int j = 0; j < listaB.length; j++) {
                if (listaA[i] == listaB[j]) {
                    posicao[i] = 1;
                    repetidos++;
                }
            }
        }
        System.out.print(repetidos +"\n");
        
        int[] listasjuntas = new int[listaA.length + listaB.length -1];
        int posicaojuntas = 0;
        
       
                
                for(int i = 0; i < listaA.length; i++){
                    if (posicao[i] != 1){
                        listasjuntas[posicaojuntas] = listaA[i];
                        posicaojuntas++;
                    }
                }
                for(int i = 0; i < listaB.length; i++){
             
                        listasjuntas[posicaojuntas] = listaB[i];
                        posicaojuntas++;
                    
                }
        
             for(int i = 0; i < listasjuntas.length; i++){
                 System.out.print( "" + listasjuntas[i] + ",");
             }
    }
}
