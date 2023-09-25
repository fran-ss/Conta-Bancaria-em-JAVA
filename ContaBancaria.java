/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabancaria;


public class ContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        System.out.println("Consulta Saldo disponivel: " + minhaConta.consultaSaldoDisponivel());
        minhaConta.setDono("fdbshbjgfsb");
        minhaConta.getDono() ;
        minhaConta.getSaldo(); 
        minhaConta.getSaque();

        System.out.println("Cliente: "+minhaConta.getDono() + "\n" + "saldo: " + minhaConta.getSaldo());
      //  System.out.print(minhaConta.getLimite());
        System.out.print(minhaConta.consultaSaldoDisponivel());
        System.out.println("\n");
     //   System.out.println("posso transferir? " + minhaConta.transfere(30.00));
        System.out.println("psso sacar 30 reais? " + minhaConta.saca(30.00));
      
    }
}
