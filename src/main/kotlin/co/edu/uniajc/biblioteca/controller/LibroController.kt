package co.edu.uniajc.biblioteca.controller

import co.edu.uniajc.biblioteca.model.Libro
import co.edu.uniajc.biblioteca.service.LibroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/categoria")
class LibroController {
   @Autowired
    var libroService: LibroService? = null

    constructor(service: LibroService?) {}

    @PostMapping("/crearLibro" , consumes = arrayOf("application/json"))
    fun CrearLibro(@RequestBody libro: Libro): ResponseEntity<Libro> {
        return ResponseEntity.ok(libroService!!.createLibro(libro))
    }
}