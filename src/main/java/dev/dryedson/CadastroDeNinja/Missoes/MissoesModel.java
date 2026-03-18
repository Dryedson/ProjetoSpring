package dev.dryedson.CadastroDeNinja.Missoes;

import dev.dryedson.CadastroDeNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeDaMissao;

    private String dificuldade;

    @OneToMany(mappedBy = "missoes", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<NinjaModel> ninjas = new ArrayList<>();


}
