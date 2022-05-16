package co.edu.uniajc.biblioteca.service

import co.edu.uniajc.biblioteca.model.GeneroModel
import co.edu.uniajc.biblioteca.repository.GeneroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GeneroService {
    @Autowired
    private val GeneroRepository: GeneroRepository? = null

    fun createGenero(genero: GeneroModel): GeneroModel {
        return GeneroRepository!!.save(genero)
    }

}