package loja;

import com.sun.source.tree.ParenthesizedTree;

public class Cliente extends Pessoa{
    private int id;
    private Pessoa pessoa;
    private Endereco endereco;
    private Telefone telefone;
    
    

    public Cliente(String nome, String dataDeNascimento, int id) {
        super(nome, dataDeNascimento);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
}
