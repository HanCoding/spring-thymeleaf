package hello.thymeleafbasic.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyTemplateController {

    @GetMapping("/my/layout")
    public String myLayoutTest() {
        return "template/layouts/layoutTestMain";
    }
}
