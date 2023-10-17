package com.jinbemarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import javax.xml.stream.events.StartElement;
@RestController
@RequestMapping("/saludar")
public class HolaMundoController {
    @GetMapping("/hola")
    public String saludar(){
        return "Si lo puedes imaginar lo puedes programar";
    }
}
