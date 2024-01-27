package br.com.fiap.tech.challenge.bdd.dto;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class PaymentInputDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 312532141453893566L;

    private String id;
    private LocalDate date;
    private String status;
    private String method;
    private String urlPayment;
    private BigDecimal amount;

    public String getId() {
        return id;
    }

    public PaymentInputDTO setId(String id) {
        this.id = id;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public PaymentInputDTO setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PaymentInputDTO setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public PaymentInputDTO setMethod(String method) {
        this.method = method;
        return this;
    }

    public String getUrlPayment() {
        return urlPayment;
    }

    public PaymentInputDTO setUrlPayment(String urlPayment) {
        this.urlPayment = urlPayment;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public PaymentInputDTO setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }
}
