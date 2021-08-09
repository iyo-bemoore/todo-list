package bemoore.programming.controller;

import bemoore.programming.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {
    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
      this.demoService = demoService;
    }

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return demoService.getHelloMessage("Imad");
    }

    @GetMapping("welcome")
    public String welcome(@RequestParam String user, Model model){
        model.addAttribute("message",demoService.getHelloMessage(user));
        log.info("model = {}", model);
        return "welcome"; // returns the name of the view => the string is passed the the viewResolver then the prefix and suffix are appended and the full path of the the view is returned. //
    }
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage(){
        log.info("welcome Message Fired");
        return demoService.getWelcomeMessage();
    }
}
