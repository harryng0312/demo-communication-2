package org.harryng.communication.main

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.ImportResource

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class, ManagementWebSecurityAutoConfiguration::class])
@ImportResource("classpath:spring-cfg.xml")
open class Application : SpringBootServletInitializer() {

    companion object{
        val logger : Logger = LoggerFactory.getLogger(Application::class.java)
    }

//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        super.onStartup(servletContext);
//        logger.info("===== web init =====");
//        Filter keycloakOIDCFilter = new KeycloakOIDCFilter();
//        FilterRegistration filterRegistration = servletContext.addFilter("kl-filter", keycloakOIDCFilter);
//        filterRegistration.setInitParameter(KeycloakOIDCFilter.CONFIG_FILE_PARAM, "/WEB-INF/auth/keycloak.json");
//        filterRegistration.getUrlPatternMappings().add("/api");
//    }

    @Override
    override fun configure(application: SpringApplicationBuilder) : SpringApplicationBuilder {
        return application.sources(Application::class.java)
    }
}
fun main(args: Array<String>) {
	SpringApplication.run(Application::class.java, *args)
}