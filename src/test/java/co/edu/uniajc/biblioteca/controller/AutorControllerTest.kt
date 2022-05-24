package co.edu.uniajc.biblioteca.controller

import co.edu.uniajc.biblioteca.model.AutorModel
import co.edu.uniajc.biblioteca.model.GeneroModel
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
internal class AutorControllerTest  @Autowired constructor(
        val mockMvc: MockMvc,
        val objectMapper: ObjectMapper

) {

    @Nested
    @DisplayName("GET /autor/listarAutores")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    inner class ListarAutores {
        @Test
        fun `listar Autores`() {
            mockMvc.get("/autor/listarAutores")
                    .andDo { print() }
                    .andExpect {
                        status { isOk() }
                        content { (MediaType.APPLICATION_JSON) }
                    }
        }
    }
/*
    @Nested
    @DisplayName("POST /autor/crearAutor")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    inner class PostNewAutor {
        @Test
        fun `crear autor`() {
            val newAutor = AutorModel(null, "JUAN", "Colombia", Integer(2))
            val newAutorEspect = AutorModel(Integer(3), "JUAN", "Colombia", Integer(2))

            val performPost = mockMvc.post("/autor/crearAutor") {
                contentType = MediaType.APPLICATION_JSON
                content = objectMapper.writeValueAsString(newAutorEspect)
            }

            performPost
                    .andDo { print() }
                    .andExpect {
                        status { isOk() }
                        content {
                            contentType(MediaType.APPLICATION_JSON)
                            json(objectMapper.writeValueAsString(newAutorEspect))
                        }
                    }
        }
        */
        @Nested
        @DisplayName("POST /autor/updateAutor")
        @TestInstance(TestInstance.Lifecycle.PER_CLASS)
        inner class PostUpdateGenero {
            @Test
            fun `actualizar autor`() {
                val newAutorEspect = AutorModel(Integer(2), "JUAN", "Colombia", Integer(2))

                val performPost = mockMvc.post("/autor/updateAutor") {
                    contentType = MediaType.APPLICATION_JSON
                    content = objectMapper.writeValueAsString(newAutorEspect)
                }

                performPost
                        .andDo { print() }
                        .andExpect {
                            status { isOk() }
                            content {
                                contentType(MediaType.APPLICATION_JSON)
                                json(objectMapper.writeValueAsString(newAutorEspect))
                            }
                        }
            }
        }
    }
