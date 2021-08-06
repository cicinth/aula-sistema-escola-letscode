package br.com.letscode.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@Entity
@Table(name = "curso")
public class Curso {
    @Column(name = "codigo_curso") @Id
    @Getter @Setter private int codigoCurso;

    @Column(name = "nome_curso")
    @Getter @Setter private String nomeCurso;

    @Getter @Setter private int duracao;

    @Column(name = "numero_alunos")
    @Getter @Setter private int numeroAlunos;

    @Enumerated(EnumType.STRING)
    @Getter @Setter private Modalidade modalidade;

}
