package com.example.desafio_itau.DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;


@Data
public class TransactionRequest {

    @NotNull(message = "Valor não pode ser nulo")
    @Min(0)
    private Double valor;

    @NotNull(message = "Data e hora não podem ser nulos")
    private OffsetDateTime dataHora;
}
