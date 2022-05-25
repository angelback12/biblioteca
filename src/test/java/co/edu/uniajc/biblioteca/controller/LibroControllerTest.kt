package co.edu.uniajc.biblioteca.controller

import co.edu.uniajc.biblioteca.model.Libro
import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.Lifecycle
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.post

@SpringBootTest
@AutoConfigureMockMvc
internal class LibroControllerTest @Autowired constructor(
        val mockMvc: MockMvc,
        val objectMapper: ObjectMapper
) {

    @Nested
    @DisplayName("GET /libro/listarlibros")
    @TestInstance(Lifecycle.PER_CLASS)
    inner class CrearLibro {
        @Test
        fun `listar libros`() {
            mockMvc.get("/libro/listarLibros")
                    .andDo { print() }
                    .andExpect {
                        status { isOk() }
                        content { (MediaType.APPLICATION_JSON) }
                    }
        }
    }
/*
    @Nested
    @DisplayName("POST /libro/crearLibro")
    @TestInstance(Lifecycle.PER_CLASS)
    inner class PostNewBank {
        @Test
        fun `crear libros`() {
            val newLibro = Libro(null, "sancho pansa", "sancho pansa")
            val newLibroEspect = Libro(Integer(15), "sancho pansa", "sancho pansa")

            val performPost = mockMvc.post("/libro/crearLibro") {
                contentType = MediaType.APPLICATION_JSON
                content = objectMapper.writeValueAsString(newLibro)
            }

            performPost
                    .andDo { print() }
                    .andExpect {
                        status { isOk() }
                        content {
                            contentType(MediaType.APPLICATION_JSON)
                            json(objectMapper.writeValueAsString(newLibroEspect))
                        }
                    }
        }

*/
        @Nested
        @DisplayName("POST /libro/updateLibro")
        @TestInstance(Lifecycle.PER_CLASS)
        inner class PostNewBank {
            @Test
            fun `actualizar libros`() {
                val newLibro = Libro(null, "sancho pansa", "sancho pansa")
                val newLibroEspect = Libro(Integer(2), "sancho pansa", "sancho pansa")

                val performPost = mockMvc.post("/libro/updateLibro") {
                    contentType = MediaType.APPLICATION_JSON
                    content = objectMapper.writeValueAsString(newLibroEspect)
                }

                performPost
                        .andDo { print() }
                        .andExpect {
                            status { isOk() }
                            content {
                                contentType(MediaType.APPLICATION_JSON)
                                json(objectMapper.writeValueAsString(newLibroEspect))
                            }
                        }
            }

        }
    }


