package com.green.security.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(title = "ToDo 리스트"
                , description = "Spring Security Exam"
                , version = "v0.0.1"
        ),
        security = @SecurityRequirement(name="authorization")
)
@SecurityScheme(
        type = SecuritySchemeType.HTTP,
        name = "authorization",
        in = SecuritySchemeIn.HEADER,
        bearerFormat = "JWT",
        scheme = "Bearer")

public class SwaggerConfiguration {
//    private final String JWT_TYPE;
//    private final String HEADER_SCHEME_NAME;
//
//    public SwaggerConfiguration(@Value("${springboot.jwt.token-type}") String jwtType
//            , @Value("${springboot.jwt.header-scheme-name}") String headerSchemeName) {
//        this.JWT_TYPE = jwtType;
//        this.HEADER_SCHEME_NAME = headerSchemeName;
//    }
//
//    @Bean
//    public OpenAPI openAPI() {
//        final Info info = new Info()
//                .version("v0.0.1")
//                .title("ToDo 리스트")
//                .description("Spring Security Exam");
//
//        SecurityRequirement securityRequirement = new SecurityRequirement().addList(HEADER_SCHEME_NAME);
//
//        SecurityScheme securityScheme = new SecurityScheme()
//                .name(HEADER_SCHEME_NAME)
//                .type(SecurityScheme.Type.HTTP)
//                .scheme(JWT_TYPE)
//                .in(SecurityScheme.In.HEADER)
//                .bearerFormat("JWT");
//
//        Components components = new Components()
//                .addSecuritySchemes(HEADER_SCHEME_NAME, securityScheme);
//
//        // SecuritySchemes 등록
//        return new OpenAPI()
//                .info(info)
//                .addSecurityItem(securityRequirement)
//                .components(components);
//    }
}
