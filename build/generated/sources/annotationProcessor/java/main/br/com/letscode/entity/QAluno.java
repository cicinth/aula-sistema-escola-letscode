package br.com.letscode.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAluno is a Querydsl query type for Aluno
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAluno extends EntityPathBase<Aluno> {

    private static final long serialVersionUID = 1599010270L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAluno aluno = new QAluno("aluno");

    public final QCurso codigoCurso;

    public final DatePath<java.sql.Date> dataNascimento = createDate("dataNascimento", java.sql.Date.class);

    public final StringPath nome = createString("nome");

    public final NumberPath<Integer> ra = createNumber("ra", Integer.class);

    public final StringPath sobrenome = createString("sobrenome");

    public QAluno(String variable) {
        this(Aluno.class, forVariable(variable), INITS);
    }

    public QAluno(Path<? extends Aluno> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAluno(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAluno(PathMetadata metadata, PathInits inits) {
        this(Aluno.class, metadata, inits);
    }

    public QAluno(Class<? extends Aluno> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.codigoCurso = inits.isInitialized("codigoCurso") ? new QCurso(forProperty("codigoCurso")) : null;
    }

}

