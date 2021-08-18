package br.com.letscode.controller;

import br.com.letscode.entity.Curso;
import br.com.letscode.entity.Usuario;
import br.com.letscode.repository.PerfilRepository;
import br.com.letscode.repository.UsuarioRepository;
import br.com.letscode.request.CursoRequest;
import br.com.letscode.request.UsuarioRequest;
import br.com.letscode.response.CursoResponse;
import br.com.letscode.response.UsuarioResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PerfilRepository perfilRepository;

    @GetMapping
    public Page<UsuarioResponse> buscarUsuarios(Pageable pageable){
        Page<Usuario> usuarios = usuarioRepository.findAll(pageable);
        return  UsuarioResponse.convert(usuarios);
    }

    @PostMapping
    public ResponseEntity<UsuarioResponse> cadastrar(
            @RequestBody UsuarioRequest usuarioRequest,
            UriComponentsBuilder uriComponentsBuilder
    ){
        Usuario usuario = usuarioRequest.convert(perfilRepository);
        usuarioRepository.save(usuario);
        URI uri = uriComponentsBuilder.path("/users/{id}")
                .buildAndExpand(usuario.getId()).toUri();

        return ResponseEntity.created(uri).body(new UsuarioResponse(usuario));
    }
}
