package br.com.letscode;

import br.com.letscode.entity.Curso;
import br.com.letscode.entity.Modalidade;
import br.com.letscode.repository.CursoRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@DataJpaTest
@RunWith(SpringRunner.class)
public class CursoTest {

    @Autowired
    CursoRepository cursoRepository;

    @Test
    void findCurso(){
        Curso curso = new Curso(12,"banco",4,20, Modalidade.PRESENCIAL);
        cursoRepository.save(curso);
        List<Curso> cursos = cursoRepository.findAll();
        assertFalse(cursos.isEmpty());
    }
    @Test
    void saveCurso(){
        Curso curso = new Curso(12,"banco",4,20, Modalidade.PRESENCIAL);
        Curso cursoSave = cursoRepository.save(curso);
        assertEquals(cursoSave.getCodigoCurso(),12);
    }
}
