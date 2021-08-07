package br.com.letscode.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "curso_disciplina")
public class CursoDisciplinaProfessor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne @JoinColumn(name = "codigo_curso", referencedColumnName = "codigo_curso")
    @Getter @Setter Curso codigoCurso;

    @ManyToOne @JoinColumn(name = "codigo_disciplina", referencedColumnName = "codigo_disciplina")
    @Getter @Setter Disciplina codigoDisiciplina;

    @ManyToOne @JoinColumn(name = "registro_professor", referencedColumnName = "registro_professor")
    @Getter @Setter Professor registroProfessor;
}
