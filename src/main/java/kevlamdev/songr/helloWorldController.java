package kevlamdev.songr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloWorldController {
    @ResponseBody
    @GetMapping("/hello")
    public String getGreeting() {
        return "hello world";
    }

}
