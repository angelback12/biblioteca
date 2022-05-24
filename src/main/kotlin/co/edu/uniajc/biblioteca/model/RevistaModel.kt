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
@Table(name = "revista")

class RevistaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private var id : Integer? = null

    @Column(name = "name")
    private var name: String? = null

    @Column(name = "description")
    private var description: String? = null

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
