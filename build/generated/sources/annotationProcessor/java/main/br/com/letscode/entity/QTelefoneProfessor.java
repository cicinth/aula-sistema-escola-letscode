package br.com.letscode.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTelefoneProfessor is a Querydsl query type for TelefoneProfessor
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTelefoneProfessor extends EntityPathBase<TelefoneProfessor> {

    private static final long serialVersionUID = 1463586584L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTelefoneProfessor telefoneProfessor = new QTelefoneProfessor("telefoneProfessor");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> numero = createNumber("numero", Integer.class);

    public final QProfessor registroProfessor;

    public QTelefoneProfessor(String variable) {
        this(TelefoneProfessor.class, forVariable(variable), INITS);
    }

    public QTelefoneProfessor(Path<? extends TelefoneProfessor> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTelefoneProfessor(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTelefoneProfessor(PathMetadata metadata, PathInits inits) {
        this(TelefoneProfessor.class, metadata, inits);
    }

    public QTelefoneProfessor(Class<? extends TelefoneProfessor> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.registroProfessor = inits.isInitialized("registroProfessor") ? new QProfessor(forProperty("registroProfessor")) : null;
    }

}

