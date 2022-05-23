package co.edu.uniajc.biblioteca.service

import co.edu.uniajc.biblioteca.model.Libro
import co.edu.uniajc.biblioteca.repository.LibroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LibroService {
    @Autowired
    private val libroRepository: LibroRepository ? = null

    fun createLibro(libro: Libro): Libro {
        return libroRepository!!.save(libro)
    }

    fun ListarLibros(): List<Libro> {
        return libroRepository!!.findAll() as List<Libro>
    }

}