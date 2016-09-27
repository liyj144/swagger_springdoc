package com.wanda.swagger.swagger;

import org.springframework.context.annotation.Bean;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by yanjie on 2016/9/26.
 */
@EnableSwagger2
public class ApplicationSwaggerConfig {
    @Bean
    public Docket addUserDocket(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        ApiInfo apiInfo = new ApiInfo(
                "restful API",
                "API Document管理",
                "V1.0.0",
                "blog.liyanjie.top",
                "liyj144@163.com",
                "",
                ""
        );
        docket.apiInfo(apiInfo);
        return docket;
    }
}
