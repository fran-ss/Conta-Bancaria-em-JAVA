/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

/**
 *
 * @author Laboratório
 */
public class Funcionario {

    String nome;
    double salario;

    void aumento(double valor) {
       this.salario += valor;
       
    }

    void Consulta() {
        System.out.println("Salario atual : " + this.salario);
    }
}
