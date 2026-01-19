package br.com.gustavoInagaki.CadastroPessoas.Profissao;



import br.com.gustavoInagaki.CadastroPessoas.Pessoas.PessoaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_profissaos")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class profissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int cargaHorariaSemanal;

    //Uma profissão pode ter varias pessoas
    @OneToMany(mappedBy = "profissoes")
    private List<PessoaModel> pessoas;



}
