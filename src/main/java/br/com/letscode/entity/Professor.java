package br.com.letscode.entity;
import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "professor")
@ToString
public class Professor {
    @Id
    @Column(name = "registro_professor")
    @Getter @Setter private int registroProfessor;
    @Getter @Setter private String nome;
}
