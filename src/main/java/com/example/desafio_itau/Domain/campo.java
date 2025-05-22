package com.example.desafio_itau.Domain;

import jakarta.persistence.Entity;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
public class campo {
    private BigDecimal valor;
    private OffsetDateTime dataHora;
}
