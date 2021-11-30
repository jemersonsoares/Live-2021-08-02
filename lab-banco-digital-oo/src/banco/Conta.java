/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author SUP08
 */
public abstract class Conta implements iConta {

    private static final String AGENCIA_PADRAO = "0001";
    private static int SEQUENCIAL = 1;
    private String agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;
   
    
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
                
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;

    }

    @Override
    public void transferir(double valor, iConta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void extrato(Banco banco) {
        System.out.println("===============================");    
        System.out.println("Titular: " + banco.getNome());
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println(String.format("Número %d :", this.numero));
        System.out.println(String.format("Saldo %.2f :", this.saldo));
        System.out.println("===============================");

        
    }

}
