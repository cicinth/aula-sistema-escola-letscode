package br.com.letscode.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDisciplina is a Querydsl query type for Disciplina
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDisciplina extends EntityPathBase<Disciplina> {

    private static final long serialVersionUID = -1776416167L;

    public static final QDisciplina disciplina = new QDisciplina("disciplina");

    public final NumberPath<Integer> cargaPratica = createNumber("cargaPratica", Integer.class);

    public final NumberPath<Integer> cargaTeorica = createNumber("cargaTeorica", Integer.class);

    public final NumberPath<Integer> codigoDisciplina = createNumber("codigoDisciplina", Integer.class);

    public final StringPath nomeDisciplina = createString("nomeDisciplina");

    public QDisciplina(String variable) {
        super(Disciplina.class, forVariable(variable));
    }

    public QDisciplina(Path<? extends Disciplina> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDisciplina(PathMetadata metadata) {
        super(Disciplina.class, metadata);
    }

}

