package com.example.excercises.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    private UtilityService utilityService;

    @Autowired
    public MyController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String useful(){
        return "index";
    }
    @GetMapping("useful/colored")
    public String getColored (Model model){
        model.addAttribute("color", utilityService.generateRandomColor());


        return "index";
    }
    @GetMapping("/useful/email")
    public String validateEmail(Model model, @RequestParam String email) {
        if (utilityService.emailValidator(email)) {
            model.addAttribute("email"," is valid");
        } else {
            model.addAttribute("email"," is not valid");
        }
        return "index";
    }
    @GetMapping("useful/code")
    public String code(Model model, @RequestParam String text, @RequestParam Integer number) {
        model.addAttribute("code",utilityService.applyCaesarEncryption(text,number));

        return "index";
    }
    @GetMapping("useful/decode")
    public String decode(Model model, @RequestParam String text, @RequestParam Integer number) {
        model.addAttribute("code",utilityService.applyCaesarEncryption(text,-number));

        return "index";
    }


}
