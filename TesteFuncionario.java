/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

/**
 *
 * @author Laboratório
 */
public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario novoFuncio;
        novoFuncio = new Funcionario();

        novoFuncio.nome = "ricardo";
        novoFuncio.salario = 3000;
        novoFuncio.aumento(500);
        
        System.out.println("nome do Funcionario : " + novoFuncio.nome);
        System.out.println("Salario Atual : " + novoFuncio.salario);
    }
}
