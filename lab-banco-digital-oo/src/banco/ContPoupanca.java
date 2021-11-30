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
public class ContPoupanca extends Conta{

    public ContPoupanca(Cliente c) {
        super(c);
        
    }

    @Override
    public void extrato(Banco banco) {
        System.out.println("Extrato Conta Poupança");
        super.extrato(banco);
    
    }
    
    
    
    
}
