package tacos.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig { // cross-origin requests Angular/React Frontend
    /*
    @Value("${frontend.url}")
    private String frontendUrl;
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return addCorsMappings(registry) -> {
            registry.addMapping(pathPattern: "/api/**")
                    .allowedOrigins(frontendUrl)
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                    .allowedHeaders("*")
                    .allowCredentials(true);
        };
    }
    */
}
