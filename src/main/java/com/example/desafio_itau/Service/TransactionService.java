package com.example.desafio_itau.Service;

import com.example.desafio_itau.DTO.TransactionRequest;
import java.util.List;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;

@Service
public class TransactionService {

    private final List<TransactionRequest> transacao = new ArrayList<>();

    public void addTransaction(TransactionRequest transactionRequest) {
        transacao.add(transactionRequest);
    }

    public void clearTransactions() {
        transacao.clear();
    }

    public DoubleSummaryStatistics getStatistics() {
        return transacao.stream()
                .mapToDouble(TransactionRequest::getValor)
                .summaryStatistics();
    }
}