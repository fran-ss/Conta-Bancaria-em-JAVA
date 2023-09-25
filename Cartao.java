/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

/**
 *
 * @author Laboratório
 */
public class Cartao {
      public static void main(String[] args) {
          
            CartaoCredito meuCredito;
           meuCredito= new CartaoCredito(2);
           
           meuCredito.numero = 25216 ;
            meuCredito.validade = "23/12/2023";
       
        System.out.println( meuCredito.numero + "\n" + "VALIDADE: " +  meuCredito.validade);
    
}
}
