package br.com.gustavoInagaki.CadastroPessoas.Pessoas;

import br.com.gustavoInagaki.CadastroPessoas.Profissao.profissaoModel;
import jakarta.persistence.*;


//Transforma uma classe em uma entidade do banco de dados
@Entity
@Table(name = "tb_cadastro")
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private String email;

    //Unica profissão
    @ManyToOne
    @JoinColumn(name = "profissao_id") //chave estrangeira
    private profissaoModel profissoes;

    public PessoaModel(){
    }

    public PessoaModel(int idade, String nome, String email) {
        this.idade = idade;
        this.nome = nome;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
