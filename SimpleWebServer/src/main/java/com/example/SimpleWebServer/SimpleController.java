import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("users")
public class SimpleController{

    @GetMapping("/result")
    public String result() {
        System.out.println("it works");
        return "it works";
    }

}