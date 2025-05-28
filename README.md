# Desafio Backend - Itaú Unibanco 🏦

Este projeto foi desenvolvido como solução para o **Desafio de Programação Backend Júnior do Itaú Unibanco**, cujo objetivo era construir uma **API REST de Transações** com persistência em memória e estatísticas em tempo real.

🔗 Desafio original: [Vídeo explicativo](https://youtu.be/uke3i4uOejs)

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Maven**
- **Persistência em memória**
- **Java 8+ API (OffsetDateTime, DoubleSummaryStatistics, etc)**

## 📌 Requisitos do Desafio

- Criar uma API REST em Java ou Kotlin com Spring Boot.
- Armazenar as transações somente em memória (sem banco de dados, cache ou arquivos).
- Seguir rigorosamente os endpoints e formatos definidos.
- Implementar os seguintes endpoints:

---

## 📎 Endpoints da API

### 🔹 `POST /transacao`

Registra uma nova transação.

#### Requisição:

```json
{
  "valor": 123.45,
  "dataHora": "2020-08-07T12:34:56.789-03:00"
}
```
---

Regras de Validação:
valor deve ser ≥ 0.

dataHora deve estar no passado (não pode ser futura).

Campos obrigatórios: valor, dataHora.

--- 
Respostas:
201 Created → Transação válida registrada.

422 Unprocessable Entity → Transação inválida (ex: valor negativo).

400 Bad Request → Erro de formatação do JSON.
