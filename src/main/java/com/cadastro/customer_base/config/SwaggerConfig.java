package com.cadastro.customer_base.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


import java.util.Collections;

/**
 * <i>Configuração do documento de apresentação dos serviços REST</i> <br />
 *
 * @author Luiz Santos
 * @Version 1.0.0
 */

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Autowired
    private SwaggerConfiguration sc;

    @Bean
    public Docket serviceApi() {

        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage(sc.getBasePackage())).paths(PathSelectors.any()).build()
                .apiInfo(termosEServicos());
    }

    private ApiInfo termosEServicos() {
        return new ApiInfo(sc.getTitle(), sc.getDescription(), sc.getVersion(), sc.getTermsOfServiceUrl(),
                new Contact(sc.getName(), sc.getUrl(), sc.getEmail()), sc.getLicense(), sc.getLicenseUrl(),
                Collections.emptyList());
    }

}
