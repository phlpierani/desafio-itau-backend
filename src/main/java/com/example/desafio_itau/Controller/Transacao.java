package com.example.desafio_itau.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Transacao {

    @PostMapping("/transacao")
    @ResponseStatus(HttpStatus.CREATED)
    public
}
