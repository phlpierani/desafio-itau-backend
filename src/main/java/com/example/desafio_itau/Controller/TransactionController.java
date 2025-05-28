package com.example.desafio_itau.Controller;

import com.example.desafio_itau.DTO.TransactionRequest;
import com.example.desafio_itau.Service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacao")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Void> addTransaction(@RequestBody @Valid TransactionRequest transactionRequest) {
        transactionService.addTransaction(transactionRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
