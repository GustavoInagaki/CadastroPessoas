package br.com.gustavoInagaki.CadastroPessoas.Model;

import jakarta.persistence.*;

//Transforma uma classe em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private String profissao;

    public PessoaModel(){

    }

    public PessoaModel(int idade, String nome, String profissao) {
        this.idade = idade;
        this.nome = nome;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
