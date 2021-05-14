package br.com.alura.forum.controller;

import br.com.alura.forum.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController //já devolve a pagina como entidade nao precisando mais do response body
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDto> lista() {
        Topico topico = new Topico("Dúvida", "Dúvida com Spring",
                new Curso("Spring", "Programacão"));

        //passando o metodo para fazer a conversao de topico para topicodto
        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }


}

