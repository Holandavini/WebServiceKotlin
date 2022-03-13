package br.com.holandavini.WebService.controller

import br.com.holandavini.WebService.model.Note
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController // Define a classe como um controller para receber e responder as requesições
@RequestMapping("notes") // Mapeia o caminho que o controller ficara responsavel em responder
class NoteController {
    @GetMapping // Atende as requisições via GET
    fun list(): List<Note>{
        return listOf(Note("Leitura", "Livro de Spring Boot"),
                      Note("Pesquisa", "Ambiente com Docker"))

    }
}
