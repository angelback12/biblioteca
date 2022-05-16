package co.edu.uniajc.biblioteca.repository

import co.edu.uniajc.biblioteca.model.AutorModel
import org.springframework.data.repository.CrudRepository

interface AutorRepository : CrudRepository<AutorModel, Long>{

    
}