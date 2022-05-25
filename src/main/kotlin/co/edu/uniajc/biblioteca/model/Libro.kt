package co.edu.uniajc.biblioteca.model

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.RequiredArgsConstructor
import lombok.Setter
import javax.persistence.*

@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "libro")
class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private var id : Integer? = null

    @Column(name = "name")
    private var name: String? = null

    @Column(name = "description")
    private var description: String? = null

    constructor(id: Integer?, name: String?, description: String?) {
        this.id = id
        this.name = name
        this.description = description
    }

    fun getId(): Integer? {
        return id
    }

    fun getName(): String? {
        return name
    }

    fun getDescription():String? {
        return  description
    }


}