package co.edu.uniajc.biblioteca.repository

import co.edu.uniajc.biblioteca.model.GeneroModel
import org.springframework.data.repository.CrudRepository

interface GeneroRepository : CrudRepository<GeneroModel, Long> {
}