package br.com.gustavoInagaki.CadastroPessoas.Profissao;



import br.com.gustavoInagaki.CadastroPessoas.Pessoas.PessoaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_profissaos")
public class profissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int cargaHorariaSemanal;

    //Uma profissão pode ter varias pessoas
    @OneToMany(mappedBy = "profissoes")
    private List<PessoaModel> pessoas;


    public profissaoModel(){

    }

    public profissaoModel(String nome, int cargaHorariaSemanal) {
        this.nome = nome;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }
}
