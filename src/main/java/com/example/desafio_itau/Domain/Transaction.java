package com.example.desafio_itau.Domain;

import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@Entity
public class Transaction {

    private double valor;
    private OffsetDateTime dataHora;

}
