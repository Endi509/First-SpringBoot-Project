package com.example.springbootproject.demo.springproject21.Component;

import org.springframework.stereotype.Component;
// Kjo klase eshte nje komponent qe duhet ta menaxhojme vete.
// dhe ta krijosh automatikisht kur nis app
// Nuk kemi nevoje te krijojme vete objektin me new
// Spring krijon nje objekt nga kjo klase
// ky objekt ruhet ne kontekstin e stringut ne nje memorje te perbashket.
// dhe mund ta perdorim kete objekt kudo tjeter ne aplikacion me
// annotation @Autowired
@Component
public class MessageComponent {

    public String getMessage(){
        return "Hello World";


    }

}
