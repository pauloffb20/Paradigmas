/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2;

/**
 *
 * @author Paulo Brito
 */
public class Ficha2 {

    public static void main(String[] args) {
        int[] numero = new int[10];
        char[] nome = new char[10];

        for (int i = 0; i < 10; i++) {
            numero[i] = i + 1;
            System.out.println(numero[i]);
        }

        int letras = 65;
        for (int i = 0; i < 10; i++) {
            letras += i;
            nome[i] = (char) letras;
            System.out.println(nome[i]);
        }
    }

}
