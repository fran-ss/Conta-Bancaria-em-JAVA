/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

/**
 *
 * @author Laboratório
 */
public class Coonta {
       Agencia agencia;
       
     public Coonta (Agencia agencia){
         
    this.agencia =agencia;
    }
    
    void transfere(Coonta,destino, double valor){
    if(valor <=0 ){
        System.out.println("Valor da tranferencia invalido.");
        return;
    }
    if (this.saldo < valor){
        System.out.println("Saldo Insuficiente.");
    }
    
    this.saldo-=valor;
    destino.saldo += valor;
    
        System.out.println("tranferencia de " + valor+ "realizada com sucesso´para a conta da agência " + destino.agencia.getNumero());
    
    } 
}

    

