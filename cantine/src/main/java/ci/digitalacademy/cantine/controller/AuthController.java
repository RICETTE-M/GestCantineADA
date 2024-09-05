package ci.digitalacademy.cantine.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping
    public class AuthController {

        @GetMapping
        public String showLoginPage(Model model) {
            return "index";
}

}
