package br.com.letscode.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUsuario is a Querydsl query type for Usuario
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUsuario extends EntityPathBase<Usuario> {

    private static final long serialVersionUID = -179195039L;

    public static final QUsuario usuario = new QUsuario("usuario");

    public final StringPath email = createString("email");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final ListPath<Perfil, QPerfil> perfis = this.<Perfil, QPerfil>createList("perfis", Perfil.class, QPerfil.class, PathInits.DIRECT2);

    public final StringPath senha = createString("senha");

    public QUsuario(String variable) {
        super(Usuario.class, forVariable(variable));
    }

    public QUsuario(Path<? extends Usuario> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUsuario(PathMetadata metadata) {
        super(Usuario.class, metadata);
    }

}

