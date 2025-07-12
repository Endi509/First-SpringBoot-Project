package com.example.springbootproject.demo.springproject21.controller;

import com.example.springbootproject.demo.springproject21.Component.MessageComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Ky annotation tregon qe kjo klase eshte nje controller
//Pra pergjigjet ndaj kerkesave HTTP
//Kjo klase komunikon me web-in
//E ben klasen te pergatise pergjigjet direkte si tekst
//Kur dikush shkon tek localhost:8080/message
//Do te merrte kerkesen dhe do te kthente pergjigje

@RestController
public class MainController {

    //tregon qe springu duhet te injektoje automatikisht
    //nje objekt te tipit MessageComponent
    //pra pa perdorur keywordin new
    @Autowired
    private MessageComponent messageComponent;

    //Ky eshte nje annotation per url qe do te vendos
    //i thot springut qe kur vjen nje kerkese GET te /mesazh
    //therret metoden me poshte
    @GetMapping("/mesazh")
    public String shfaqMesazhin(){
        return messageComponent.getMessage();
    }
}
