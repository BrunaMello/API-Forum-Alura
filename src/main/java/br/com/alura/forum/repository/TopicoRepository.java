package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    //filtrar pelo relacionamento
    Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);
}
