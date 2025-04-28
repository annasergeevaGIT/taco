package tacos.web;
import org.springframework.context.annotation.Configuration;
import
        org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer { //Configures how Spring MVC app handles incoming web requests and maps them to views/controllers within the same origin.
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/login");
    }
}
