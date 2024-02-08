package com.example.springproject.Controle;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")



public class pessoas2 {
    @PostMapping

    public void cadastro(@RequestBody String json){
       System.out.println(json);
       
    }
}
