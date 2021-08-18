package br.com.letscode.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCurso is a Querydsl query type for Curso
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCurso extends EntityPathBase<Curso> {

    private static final long serialVersionUID = 1601122703L;

    public static final QCurso curso = new QCurso("curso");

    public final NumberPath<Integer> codigoCurso = createNumber("codigoCurso", Integer.class);

    public final NumberPath<Integer> duracao = createNumber("duracao", Integer.class);

    public final EnumPath<Modalidade> modalidade = createEnum("modalidade", Modalidade.class);

    public final StringPath nomeCurso = createString("nomeCurso");

    public final NumberPath<Integer> numeroAlunos = createNumber("numeroAlunos", Integer.class);

    public QCurso(String variable) {
        super(Curso.class, forVariable(variable));
    }

    public QCurso(Path<? extends Curso> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCurso(PathMetadata metadata) {
        super(Curso.class, metadata);
    }

}

