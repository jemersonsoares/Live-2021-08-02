/*
 * Armazenar a lista de contas criada
 * 
 * 
 */
package banco;

import java.util.List;

/**
 *
 * @author SUP08
 */
public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome=nome;
    }

    @Override
    public String toString() {
        return this.getNome();
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}
