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
@Table (name = "autor")
class AutorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private var id : Integer? = null

    @Column(name = "name")
    private var name : String? = null

    @Column(name = "nation")
    private  var nation : String? = null

    @Column(name = "numlib")
    private  var numlib : Integer? = null

    fun getId(): Integer? {
        return id
    }

    fun getName(): String? {
        return name
    }

    fun getNation(): String? {
        return nation
    }

    fun getNumlib(): Integer? {
        return numlib
    }
}