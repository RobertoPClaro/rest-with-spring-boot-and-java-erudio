package restwithspringbootandjavaerudio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpemApiConfig {

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("RESTFul API with JAVA 17 and Spring Boot 3")
						.version("v1")
						.description("Some description about your api")
						.termsOfService("https://robertopclaro.github.io/RobertoPachecoClaroCv/")
						.license(new License()
								.name("Apache 2.0")
								.url("https://robertopclaro.github.io/RobertoPachecoClaroCv/")
								)
						);
	}
}
