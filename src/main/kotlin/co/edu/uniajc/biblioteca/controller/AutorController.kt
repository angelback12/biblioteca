package co.edu.uniajc.biblioteca.controller;

import co.edu.uniajc.biblioteca.model.AutorModel
import co.edu.uniajc.biblioteca.service.AutorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    var autorService: AutorService? = null

    constructor(service: AutorService?) {}

    @PostMapping("/crearAutor", consumes = arrayOf("application/json"))
    fun CrearAutor(@RequestBody autor: AutorModel): ResponseEntity<AutorModel> {
        return ResponseEntity.ok(autorService!!.createAutor(autor))
    }

}
