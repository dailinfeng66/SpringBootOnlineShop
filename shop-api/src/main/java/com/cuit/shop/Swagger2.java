package com.cuit.shop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
//                下面写的是controller所在的包
                //去扫描这个这个包（并不仅限于当前工程下的包）下所有标记了@restcontroller的类，去扫描里面的每一个方法
                .apis(RequestHandlerSelectors.basePackage("com.cuit"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact =new Contact("name","http://dlf.com","dailinfeng66@163.com");
        return new ApiInfoBuilder()
                .title("在线商城接口文档")
                .description("用于学习springboot实战项目")
                .termsOfServiceUrl("http://blog.csdn.net/saytime")
                .version("1.0")
                .contact(contact)
                .build();
    }

}
