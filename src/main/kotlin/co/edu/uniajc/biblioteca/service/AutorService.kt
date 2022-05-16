package co.edu.uniajc.biblioteca.service

import co.edu.uniajc.biblioteca.model.AutorModel
import co.edu.uniajc.biblioteca.repository.AutorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AutorService {

    @Autowired
    private val autorRepository: AutorRepository ? = null

    fun createAutor(autor: AutorModel): AutorModel{
        return autorRepository!!.save(autor)
    }
}