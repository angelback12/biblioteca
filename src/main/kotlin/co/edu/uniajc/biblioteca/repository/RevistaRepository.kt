package co.edu.uniajc.biblioteca.repository

import co.edu.uniajc.biblioteca.model.RevistaModel
import org.springframework.data.repository.CrudRepository

interface RevistaRepository : CrudRepository<RevistaModel, Long> {
}