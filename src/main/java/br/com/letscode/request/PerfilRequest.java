package br.com.letscode.request;

import br.com.letscode.entity.Curso;
import br.com.letscode.entity.Modalidade;
import br.com.letscode.entity.Perfil;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PerfilRequest {
    private String nome;

    public Perfil convert() {
        return new Perfil(nome);
    }
}
