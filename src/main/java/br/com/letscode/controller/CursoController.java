package br.com.letscode.controller;

import br.com.letscode.entity.Curso;
import br.com.letscode.repository.CursoRepository;
import br.com.letscode.request.CursoRequest;
import br.com.letscode.request.CursoRequestAtualizar;
import br.com.letscode.response.AlunoResponse;
import br.com.letscode.response.CursoResponse;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    public Page<CursoResponse> buscarCursos(@QuerydslPredicate(root = Curso.class) Predicate predicate, Pageable pageable){
        Page<Curso> cursos = cursoRepository.findAll(predicate, pageable);
        return  CursoResponse.convert(cursos);
    }
    @PostMapping
    public ResponseEntity<CursoResponse> cadastrar(
            @RequestBody CursoRequest cursoRequest,
            UriComponentsBuilder uriComponentsBuilder
    ){
        Curso curso = cursoRequest.convert();
        cursoRepository.save(curso);
        URI uri = uriComponentsBuilder.path("/cursos/{codigoCurso}")
                .buildAndExpand(curso.getCodigoCurso()).toUri();

        return ResponseEntity.created(uri).body(new CursoResponse(curso));
    }
    @GetMapping("/{codigoCurso}")
    public CursoResponse buscarCursoPorCodigo(@PathVariable int codigoCurso){
        Curso curso = cursoRepository.getById(codigoCurso);
        return new CursoResponse(curso);
    }

    @PutMapping("/{codigoCurso}")
    public ResponseEntity<CursoResponse> atualizar(
            @PathVariable int codigoCurso,
            @RequestBody CursoRequestAtualizar cursoRequestAtualizar
    ){
        Curso curso = cursoRequestAtualizar.convert(codigoCurso);
        cursoRepository.save(curso);
        return  ResponseEntity.ok().body(new CursoResponse(curso));
    }

    @DeleteMapping("/{codigoCurso}")
    public ResponseEntity<?> deletar(@PathVariable int codigoCurso){
        cursoRepository.deleteById(codigoCurso);
        return ResponseEntity.ok().build();
    }



}
