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
@Table(name = "genero")


class GeneroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private var id : Long? = null

    @Column(name = "name")
    private var name: String? = null

    @Column(name = "description")
    private var description: String? = null

}