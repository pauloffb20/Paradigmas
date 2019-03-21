/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5ex1;

/**
 *
 * @author Paulo Brito
 */
public class user {
    private static final int ID_SIZE = 3;
    protected char[] id = new char[ID_SIZE];
    protected String nome;
    protected String email;
    protected String date;
    

    public user(char[] id, String nome, String email, String date) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.date = date;
    }
    
}
