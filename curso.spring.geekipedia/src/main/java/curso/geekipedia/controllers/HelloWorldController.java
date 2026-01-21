package curso.geekipedia.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String HelloWorld(){
        System.out.println("Solicitud Hola Mundo ejecutada");
        return "Hello World!!";
    }

}
