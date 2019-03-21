/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

/**
 *
 * @author Paulo Brito
 */
public class Ex4 {

    public static void main(String[] args) {
        char[] nome = new char[]{'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
        int numerovogais = 0;
       
        
        System.out.print("Apelido:");
        for (int i = 4; i < nome.length; i++) {
            System.out.print(nome[i]);
        }
        System.out.print("Nome:");
        for (int i = 0; i < 4; i++) {
            System.out.print(nome[i]);
        }
        System.out.print("\n");
        
        for(int i = 0; i < nome.length; i++ ){
            if(nome[i] == 'a' || nome[i ]== 'e' ||  nome[i] == 'i' ||  nome[i] == 'o' ||  nome[i] == 'u' || nome[i] == 'A'){
                    numerovogais++;
                    }
        }
         int numeroconsoantes = 9 - numerovogais;
        System.out.println("Numero de vogais:" + numerovogais);
        System.out.println("Numero de vogais:" + numeroconsoantes);
      
    }
}
