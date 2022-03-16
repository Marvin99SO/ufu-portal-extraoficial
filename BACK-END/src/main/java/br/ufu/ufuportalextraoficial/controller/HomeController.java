package br.ufu.ufuportalextraoficial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api")
public class HomeController {
    @GetMapping(value = "/home")
    public String home() {
        //return "home.html";
        //return "/public/index.html";

        return "localhost:3000";
    }
}
