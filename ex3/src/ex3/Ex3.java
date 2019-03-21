/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author Paulo Brito
 */
public class Ex3 {

    public static void main(String[] args) {
        int[] lista = new int[]{12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        int maiornr = 0;
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > 0) {
                System.out.println("positivo:" + lista[i]);
            } else if(lista[i] < 0) {
            System.out.println("Negativo:" + lista[i]);
            }
        }
        for(int i = 0; i< lista.length; i++){
            if(lista[i] > maiornr){
            maiornr = lista[i];
            }  
        }
        System.out.println("Maior numero:" + maiornr);
    }
}
