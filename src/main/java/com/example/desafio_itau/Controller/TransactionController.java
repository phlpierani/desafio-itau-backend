package com.example.desafio_itau.Controller;

import com.example.desafio_itau.DTO.TransactionRequest;
import com.example.desafio_itau.Service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.DoubleSummaryStatistics;

@RestController
@RequestMapping("/transacao")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<Void> addTransaction(@RequestBody @Valid TransactionRequest transactionRequest) {
        if (transactionRequest.getValor() == 0) {
            return ResponseEntity.unprocessableEntity().build(); // 422
        }

        transactionService.addTransaction(transactionRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build(); // 201
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> clearTransactions() {
        transactionService.clearTransactions();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/estatisticas")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<DoubleSummaryStatistics> getStatistics() {
        DoubleSummaryStatistics statistics = transactionService.getStatistics();
        return new ResponseEntity<>(statistics, HttpStatus.OK);
    }
}
