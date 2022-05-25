package co.edu.uniajc.applicor.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfig {
    @Bean
    fun swaggerPlugin(): Docket {
        return Docket(DocumentationType.SWAGGER_2) // SWAGGER_12, SWAGGER_2, SWAGGER_I have a WEB but I don't really know which one is better
            .select() //Generate ApiSelectorBuilder
            .apis(RequestHandlerSelectors.any()) //Set the RequestHandler that is the target of the document
            .paths(PathSelectors.regex("/V1.*")) //Set the target path of the document
            .build()
    }
}







