package br.com.letscode.response;

import br.com.letscode.entity.Curso;
import br.com.letscode.entity.Usuario;
import lombok.Getter;
import org.springframework.data.domain.Page;

public class UsuarioResponse {
    @Getter private String email;

    public UsuarioResponse(Usuario usuario){
        this.email = usuario.getEmail();
    }

    public static Page<UsuarioResponse> convert(Page<Usuario> usuarios){
        return usuarios.map(UsuarioResponse::new);
    }
}
