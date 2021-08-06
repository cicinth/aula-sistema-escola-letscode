package br.com.letscode.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@Entity
@Table(name = "professor")
public class Professor {
    @Id
    @Column(name = "registro_professor")
    @Getter @Setter private int registroProfessor;
    @Getter @Setter private String nome;
}
