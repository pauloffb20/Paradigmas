/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2.ex2;

/**
 *
 * @author Paulo Brito
 */
public class Ficha2Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       user user1 = null;
       user user2 = null;
       
       user1.id[0] = 'A';
       user1.id[1] = 'B';
       user1.id[2] = 'c';
       user1.name = new char[]{'P' , 'A', 'U', 'L', 'O'};
       user1.email = new char[]{'p', 'a'};
       user1.expenses.number = 1;
       user1.expenses.number2 = 1;
       
       for(int i = 0; i < user1.expenses.carValues.length; i++){
           user1.expenses.carValues[i] = i+1;
       }
       
         for(int i = 0; i < user1.expenses.carValues.length; i++){
           user1.expenses.foodValues[i] = i+1;
       }
       
      int gastoscarro = 0;
      int gastoscomida = 0;
         
      for(int i = 0; i < user1.expenses.carValues.length; i++){
          gastoscarro += user1.expenses.carValues[i];
          gastoscomida += user1.expenses.foodValues[i];
      }
      
       
       System.out.println(user1.id);
       System.out.println(user1.name);
       System.out.println(user1.email);
       System.out.println("Gastos com o carro:" + gastoscarro);
       System.out.println("Gastos com o comida:" + gastoscomida);
       System.out.println("Média: " + (gastoscarro + gastoscomida)/31);
       
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
