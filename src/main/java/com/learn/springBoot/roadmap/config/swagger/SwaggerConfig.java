package com.learn.springBoot.roadmap.config.swagger;


import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String PACKAGE_REST = "com.learn.springBoot.roadmap.web.rest";

    private static final String TITLE = "Spring boot application API";

    private static final String VERSION = "1.0";
    private static final String URL = "https://rebaiahmed.github.io/";
    private static final String EMAIL = "ahmed.bouhmid94@gmail.com";
    private static final String DESCRIPTION = "any description";

    @Bean
    public Docket userApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("swagger-api-first")
                .tags(new Tag(SwaggerTagsConstant.USER_RESOURCE, "Operations pertaining to user"))
                 .apiInfo(apiInfo())
                  .select().paths(userPaths())
                 .build() ;
    }

    private Predicate<String> userPaths() {
        return or(regex("/api/*"));
    }

    private ApiInfo apiInfo() {


        return new ApiInfoBuilder()
                .title(TITLE)
                .description(DESCRIPTION)
                .termsOfServiceUrl(URL)
                .version(VERSION)
                .contact(new Contact("Hello", URL, EMAIL))
                .build();
    }


}
