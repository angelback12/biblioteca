package co.edu.uniajc.biblioteca.controller

import co.edu.uniajc.biblioteca.model.Libro
import co.edu.uniajc.biblioteca.model.RevistaModel
import co.edu.uniajc.biblioteca.service.RevistaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/revista")

class RevistaController {
    @Autowired
    var revistaService: RevistaService? = null

    constructor(service: RevistaService?) {}
    constructor()

    @PostMapping("/crearRevista" , consumes = arrayOf("application/json"))
    fun CrearRevista(@RequestBody revista: RevistaModel): ResponseEntity<RevistaModel> {
        return ResponseEntity.ok(revistaService!!.createRevista(revista))
    }
    @PostMapping("/updateRevista" , consumes = arrayOf("application/json"))
    fun updateRevista(@RequestBody revista: RevistaModel): ResponseEntity<RevistaModel> {
        return ResponseEntity.ok(revistaService!!.updateRevista(revista))
    }
    @GetMapping("/listarRevista")
    fun ListarLibros(): ResponseEntity<List<RevistaModel>> {
        return ResponseEntity.ok(revistaService!!.ListarRevista())
    }
}