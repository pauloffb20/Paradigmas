/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author Paulo Brito
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       char[] nomes = args[0].toCharArray();
       
       System.out.print("Apelido:");
       for(int i = 6; i < nomes.length; i++){
        System.out.print(nomes[i]);
       }
    
     System.out.print("\nNome:");
       for(int i = 0; i < 6; i++){
        System.out.print(nomes[i]);
       }
    }
    
}
