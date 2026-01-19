package br.com.gustavoInagaki.CadastroPessoas.Pessoas;

import br.com.gustavoInagaki.CadastroPessoas.Profissao.profissaoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//Transforma uma classe em uma entidade do banco de dados
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor

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


}
