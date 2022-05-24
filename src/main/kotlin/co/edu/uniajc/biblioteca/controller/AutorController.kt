package co.edu.uniajc.biblioteca.controller;

import co.edu.uniajc.biblioteca.model.AutorModel
import co.edu.uniajc.biblioteca.model.GeneroModel
import co.edu.uniajc.biblioteca.service.AutorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    var autorService: AutorService? = null

    constructor(service: AutorService?) {}
    constructor()

    @PostMapping("/crearAutor", consumes = arrayOf("application/json"))
    fun CrearAutor(@RequestBody autor: AutorModel): ResponseEntity<AutorModel> {
        return ResponseEntity.ok(autorService!!.createAutor(autor))
    }

    @PostMapping("/updateAutor" , consumes = arrayOf("application/json"))
    fun updateAutor(@RequestBody autor: AutorModel): ResponseEntity<AutorModel> {
<<<<<<< HEAD
        return ResponseEntity.ok(autorService!!.createAutor(autor))
    }
    @GetMapping("/listarAutor")
    fun listarAutor(): ResponseEntity<List<AutorModel>> {
        return ResponseEntity.ok(autorService!!.listarAutor())
=======
        return ResponseEntity.ok(autorService!!.updateAutor(autor))
    }
    @GetMapping("/listarAutores")
    fun listarAutores(): ResponseEntity<List<AutorModel>> {
        return ResponseEntity.ok(autorService!!.ListarAutor())
>>>>>>> d7fdc88be518217b99ef0521d0fa2b44f50be169
    }
}
