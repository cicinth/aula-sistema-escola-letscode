package br.com.letscode.request;

import br.com.letscode.entity.Perfil;
import br.com.letscode.entity.Usuario;
import br.com.letscode.repository.PerfilRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class UsuarioRequest {
    private String email;
    private String senha;
    private List<Integer> perfil;


    public Usuario convert(PerfilRepository perfilRepository) {
        String senhaCrypto = new BCryptPasswordEncoder().encode(this.senha);
        List<Perfil> perfis = new ArrayList<>();
        this.perfil.stream().map(id -> perfis.add(perfilRepository.findById(id).get()));
        return new Usuario(this.email,senhaCrypto,perfis);
    }


}
