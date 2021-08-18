package br.com.letscode.controller;

import br.com.letscode.entity.Perfil;
import br.com.letscode.entity.Usuario;
import br.com.letscode.repository.PerfilRepository;
import br.com.letscode.request.PerfilRequest;
import br.com.letscode.request.UsuarioRequest;
import br.com.letscode.response.PerfilResponse;
import br.com.letscode.response.UsuarioResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/perfis")
public class PerfilController {

    @Autowired
    PerfilRepository perfilRepository;

    @GetMapping
    public ResponseEntity<Page<PerfilResponse>> buscaPerfis(Pageable pageable){
        Page<Perfil> perfis = perfilRepository.findAll(pageable);
        return ResponseEntity.ok(PerfilResponse.convert(perfis));
    }
    @PostMapping
    public ResponseEntity<PerfilResponse> cadastrar(
            @RequestBody PerfilRequest perfilRequest,
            UriComponentsBuilder uriComponentsBuilder
    ){
        Perfil perfil = perfilRequest.convert();
        perfilRepository.save(perfil);
        URI uri = uriComponentsBuilder.path("/perfis/{id}")
                .buildAndExpand(perfil.getId()).toUri();

        return ResponseEntity.created(uri).body(new PerfilResponse(perfil));
    }
}
