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
public interface iConta {
    public void sacar(double valor);
    public void depositar (double valor);
    public void transferir (double valor, iConta destino);
    public void extrato(Banco banco);
    
}
