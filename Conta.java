/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

/**
 *
 * @author Laboratório
 */
public class Conta {

    private int numero;
    private String dono;
    double saldo ;
    private double limite ;
    private double saque;
    Agencia agencia;
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }
 
    
    
    void deposita(double valor) {
        this.saldo += valor;
    }
 
    boolean saca(double valor) {
        if (valor <= this.saldo) {
            return true;
        } else {
            return false;
        }
    }

    double consultaSaldoDisponivel() {
        return this.saldo + this.limite;
    }

    /*boolean transfere(double valor) {
        if (valor > this.saldo) {
            return false;
        } else if (saca(valor)) {
            System.out.println(this.saldo -= valor);
        }
        return true;
        */
        
    //}
    
    public Conta (Agencia agencia){
    this.agencia =agencia;
    }
     void transfere(Conta destino, double valor) {
        if (valor <= 0) {
            System.out.println("Valor de transferência inválido.");
            return;
        }

        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente para realizar a transferência.");
            return;
        }

        this.saldo -= valor;
        destino.saldo += valor;

        System.out.println("Transferência de " + valor + " realizada com sucesso para a conta da agência " + destino.agencia.getNumero());
    }
    
   
}
