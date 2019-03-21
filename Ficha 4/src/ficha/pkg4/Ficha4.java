/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha.pkg4;


public class Ficha4 {

    //ou static user user1; 
    
    public static void main(String[] args) {
       user user1 = null;
       user user2 = null;
       
       user1.id[0] = 'A';
       user1.id[1] = 'B';
       user1.id[2] = 'c';
       user1.name = new char[]{'P' , 'A', 'U', 'L', 'O'};
       user1.email = new char[]{'p', 'a'};
       
       System.out.println(user1.id);
       System.out.println(user1.name);
       System.out.println(user1.email);
       
       user2.id[0] = '1';
       user2.id[1] = '2';
       user2.id[2] = '3';
       user2.name = new char[]{'A', 'N', 'A'};
       user2.email = new char[]{'A','N','A','@'};
       
       System.out.println(user2.id);
       System.out.println(user2.name);
       System.out.println(user2.email);
       
    }
    
}
