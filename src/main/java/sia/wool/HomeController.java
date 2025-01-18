package sia.wool;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // identify component like bean
public class HomeController {@GetMapping("/") //HTTP requests with GET and path /
    public String home() {
    return "home";
    }
}