/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SUP08
 */
public class Principal {

    public static void main(String[] args) {
        Banco banco = new Banco("Felicidade SA");
       
        List<Conta> contas = new ArrayList<>();
        Cliente c = new Cliente();
        ContaCorrente cc = new ContaCorrente(c);
        ContPoupanca p = new ContPoupanca(c);
        cc.setNumero(169790);
        cc.setSaldo(98);
        c.setNome("Jemerson");       
        contas.add(cc);
        contas.add(p);
        banco.setContas(contas);

        cc.extrato(banco);
        p.extrato(banco);

    }
}
