package co.edu.uniajc.biblioteca.controller

import co.edu.uniajc.biblioteca.model.GeneroModel
import co.edu.uniajc.biblioteca.model.Libro
import co.edu.uniajc.biblioteca.service.GeneroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/genero")
class GeneroController {
    @Autowired
    var generoService: GeneroService? = null

    constructor(service: GeneroService?) {}

    @PostMapping("/crearGenero" , consumes = arrayOf("application/json"))
    fun CrearGenero(@RequestBody genero: GeneroModel): ResponseEntity<GeneroModel> {
        return ResponseEntity.ok(generoService!!.createGenero(genero))
    }

    @PostMapping("/updateGenero" , consumes = arrayOf("application/json"))
    fun updateGenero(@RequestBody genero: GeneroModel): ResponseEntity<GeneroModel> {
        return ResponseEntity.ok(generoService!!.updateGenero(genero))
    }
    @GetMapping("/listarGeneros")
    fun listarGeneros(): ResponseEntity<List<GeneroModel>> {
        return ResponseEntity.ok(generoService!!.ListarGeneros())
    }
}