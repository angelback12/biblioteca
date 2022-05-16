package co.edu.uniajc.biblioteca.repository

import co.edu.uniajc.biblioteca.model.Libro
import org.springframework.data.repository.CrudRepository

interface LibroRepository  : CrudRepository<Libro, Long> {


}