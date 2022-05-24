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

<<<<<<< HEAD
=======
    fun updateRevista(revista: RevistaModel): RevistaModel {
        return RevistaRepository!!.save(revista)
    }

    fun ListarRevista(): List<RevistaModel> {
        return RevistaRepository!!.findAll() as List<RevistaModel>
    }
>>>>>>> d7fdc88be518217b99ef0521d0fa2b44f50be169
}