package dev.dryedson.CadastroDeNinja.Missoes;

import dev.dryedson.CadastroDeNinja.Ninjas.NinjaModel;
import jakarta.annotation.Generated;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;
import sun.util.resources.Bundles;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeDaMissao;

    private String dificudade;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public MissoesModel(Long id, String nomeDaMissao, String dificudade) {
        this.id = id;
        this.nomeDaMissao = nomeDaMissao;
        this.dificudade = dificudade;
    }

    public String getNomeDaMissao() {
        return nomeDaMissao;
    }

    public void setNomeDaMissao(String nomeDaMissao) {
        this.nomeDaMissao = nomeDaMissao;
    }

    public String getDificudade() {
        return dificudade;
    }

    public void setDificudade(String dificudade) {
        this.dificudade = dificudade;
    }

    @Override
    public String toString() {
        return "MissoesModel{" +
                "id=" + id +
                ", nomeDaMissao='" + nomeDaMissao + '\'' +
                ", dificudade='" + dificudade + '\'' +
                '}';
    }
}
