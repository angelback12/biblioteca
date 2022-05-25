package co.edu.uniajc.biblioteca.controller

import co.edu.uniajc.biblioteca.model.GeneroModel
import co.edu.uniajc.biblioteca.model.Libro
import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.post

@SpringBootTest
@AutoConfigureMockMvc
internal class GeneroControllerTest @Autowired constructor(
        val mockMvc: MockMvc,
        val objectMapper: ObjectMapper
) {
    @Nested
    @DisplayName("GET /genero/listarGeneros")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    inner class CrearLibro {
        @Test
        fun `listar libros`() {
            mockMvc.get("/genero/listarGeneros")
                    .andDo { print() }
                    .andExpect {
                        status { isOk() }
                        content { (MediaType.APPLICATION_JSON) }
                    }
        }
    }
/*
    @Nested
    @DisplayName("POST /genero/crearGenero")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    inner class PostNewGenero {
        @Test
        fun `crear genero`() {
            val newGenero = GeneroModel(null, "sancho pansa", "sancho pansa")
            val newGeneroEspect = GeneroModel(Integer(7), "sancho pansa", "sancho pansa")

            val performPost = mockMvc.post("/genero/crearGenero") {
                contentType = MediaType.APPLICATION_JSON
                content = objectMapper.writeValueAsString(newGenero)
            }

            performPost
                    .andDo { print() }
                    .andExpect {
                        status { isOk() }
                        content {
                            contentType(MediaType.APPLICATION_JSON)
                            json(objectMapper.writeValueAsString(newGeneroEspect))
                        }
                    }
        } */
        @Nested
        @DisplayName("POST /genero/updateGenero")
        @TestInstance(TestInstance.Lifecycle.PER_CLASS)
        inner class PostUpdateGenero {
            @Test
            fun `actualizar genero`() {
                val newGeneroExped = GeneroModel(Integer(2), "sancho pansa", "sancho pansa")

                val performPost = mockMvc.post("/genero/updateGenero") {
                    contentType = MediaType.APPLICATION_JSON
                    content = objectMapper.writeValueAsString(newGeneroExped)
                }

                performPost
                        .andDo { print() }
                        .andExpect {
                            status { isOk() }
                            content {
                                contentType(MediaType.APPLICATION_JSON)
                                json(objectMapper.writeValueAsString(newGeneroExped))
                            }
                        }
            }

    }
}
