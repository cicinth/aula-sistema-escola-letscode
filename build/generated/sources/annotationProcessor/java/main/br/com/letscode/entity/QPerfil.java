package br.com.letscode.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPerfil is a Querydsl query type for Perfil
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPerfil extends EntityPathBase<Perfil> {

    private static final long serialVersionUID = -1547413703L;

    public static final QPerfil perfil = new QPerfil("perfil");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath nome = createString("nome");

    public QPerfil(String variable) {
        super(Perfil.class, forVariable(variable));
    }

    public QPerfil(Path<? extends Perfil> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPerfil(PathMetadata metadata) {
        super(Perfil.class, metadata);
    }

}

