/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

/**
 *
 * @author Laboratório
 */
public class TestContaEAgencia {

   
    public static void main(String[] args) {
       
        Agencia a = new Agencia(999);
        Conta origem = new Conta(a);
        origem.saldo = 100;
        
        Conta destino = new Conta(a);
        destino.saldo = 20;

        origem.transfere(destino, 50);

        // Imprimir saldos após a transferência
        System.out.println("Saldo da conta de origem: " + origem.saldo);
        System.out.println("Saldo da conta de destino: " + destino.saldo);
      
    }
   }
