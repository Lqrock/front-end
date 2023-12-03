package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientForwardController {

    @RequestMapping("/atm-web-new")
    public String handleRequest() {
        System.out.println("Inside the handleRequest method");
        return "forward:/atm-web-2/index.html";
    }

}
