package co.edu.uniajc.biblioteca.service


import co.edu.uniajc.biblioteca.model.GeneroModel
import co.edu.uniajc.biblioteca.model.RevistaModel
import co.edu.uniajc.biblioteca.repository.RevistaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RevistaService {

    @Autowired
    private val RevistaRepository: RevistaRepository ? = null

    fun createRevista(revista: RevistaModel): RevistaModel {
        return RevistaRepository!!.save(revista)
    }

}