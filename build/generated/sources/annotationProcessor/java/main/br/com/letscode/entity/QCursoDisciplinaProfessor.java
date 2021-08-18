package br.com.letscode.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCursoDisciplinaProfessor is a Querydsl query type for CursoDisciplinaProfessor
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCursoDisciplinaProfessor extends EntityPathBase<CursoDisciplinaProfessor> {

    private static final long serialVersionUID = -2097010092L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCursoDisciplinaProfessor cursoDisciplinaProfessor = new QCursoDisciplinaProfessor("cursoDisciplinaProfessor");

    public final QCurso codigoCurso;

    public final QDisciplina codigoDisiciplina;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QProfessor registroProfessor;

    public QCursoDisciplinaProfessor(String variable) {
        this(CursoDisciplinaProfessor.class, forVariable(variable), INITS);
    }

    public QCursoDisciplinaProfessor(Path<? extends CursoDisciplinaProfessor> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCursoDisciplinaProfessor(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCursoDisciplinaProfessor(PathMetadata metadata, PathInits inits) {
        this(CursoDisciplinaProfessor.class, metadata, inits);
    }

    public QCursoDisciplinaProfessor(Class<? extends CursoDisciplinaProfessor> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.codigoCurso = inits.isInitialized("codigoCurso") ? new QCurso(forProperty("codigoCurso")) : null;
        this.codigoDisiciplina = inits.isInitialized("codigoDisiciplina") ? new QDisciplina(forProperty("codigoDisiciplina")) : null;
        this.registroProfessor = inits.isInitialized("registroProfessor") ? new QProfessor(forProperty("registroProfessor")) : null;
    }

}

