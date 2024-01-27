package br.com.fiap.tech.challenge.bdd.response;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PaymentResponse {

    private String id;
    private LocalDate date;
    private String status;
    private String method;
    private BigDecimal amount;

    public String getId() {
        return id;
    }

    public PaymentResponse setId(String id) {
        this.id = id;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public PaymentResponse setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PaymentResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public PaymentResponse setMethod(String method) {
        this.method = method;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public PaymentResponse setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }
}
