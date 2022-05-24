package co.edu.uniajc.biblioteca.controller

import co.edu.uniajc.biblioteca.model.Libro
import co.edu.uniajc.biblioteca.model.RevistaModel
import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.*

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.post

@SpringBootTest
@AutoConfigureMockMvc
internal class RevistaControllerTest  @Autowired constructor(
        val mockMvc: MockMvc,
        val objectMapper: ObjectMapper
) {

    @Nested
    @DisplayName("GET /revista/listarRevista")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    inner class listarRevista {
        @Test
        fun `listar revistas`() {
            mockMvc.get("/revista/listarRevista")
                    .andDo { print() }
                    .andExpect {
                        status { isOk() }
                        content { (MediaType.APPLICATION_JSON) }
                    }
        }
    }
/*
    @Nested
    @DisplayName("POST /revista/crearRevista")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    inner class PostNewRevista {
        @Test
        fun `crear revista`() {
            val newRevista = RevistaModel(null, "sancho pansa", "sancho pansa")
            val newRevistaEspect = RevistaModel(Integer(3), "sancho pansa", "sancho pansa")

            val performPost = mockMvc.post("/revista/crearRevista") {
                contentType = MediaType.APPLICATION_JSON
                content = objectMapper.writeValueAsString(newRevista)
            }

            performPost
                    .andDo { print() }
                    .andExpect {
                        status { isOk() }
                        content {
                            contentType(MediaType.APPLICATION_JSON)
                            json(objectMapper.writeValueAsString(newRevistaEspect))
                        }
                    }
        }

 */
        @Nested
        @DisplayName("POST /libro/updateRevista")
        @TestInstance(TestInstance.Lifecycle.PER_CLASS)
        inner class PostNewBank {
            @Test
            fun `actualizar revista`() {
                val newRevista = RevistaModel(null, "sancho pansa", "sancho pansa")
                val newRevistaEspect = RevistaModel(Integer(2), "sancho pansa", "sancho pansa")

                val performPost = mockMvc.post("/revista/updateRevista") {
                    contentType = MediaType.APPLICATION_JSON
                    content = objectMapper.writeValueAsString(newRevistaEspect)
                }

                performPost
                        .andDo { print() }
                        .andExpect {
                            status { isOk() }
                            content {
                                contentType(MediaType.APPLICATION_JSON)
                                json(objectMapper.writeValueAsString(newRevistaEspect))
                            }
                        }

            }
        }
    }


