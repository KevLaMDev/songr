package kevlamdev.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class capitalizeController {
    @GetMapping("/capitalize/{toBeCapitalized}") // assign route to route handler method
    public String toUpperCase(Model model, @PathVariable String toBeCapitalized)
    {
        String nowCapitalized = toBeCapitalized.toUpperCase(); // transform path var
        model.addAttribute("toBeCapitalized", nowCapitalized);
        return "capitalize.html";
    }
}
