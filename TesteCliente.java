/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

/**
 *
 * @author Laboratório
 */
public class TesteCliente {
     public static void main(String[] args) {
           Cliente euCliente;
           euCliente = new Cliente();
           
           euCliente.nome ="Hagata";
           euCliente.codigo= 12345;
       
        System.out.println(euCliente.nome + "\n" + "codigo: " + euCliente.codigo);
        
     }
}
