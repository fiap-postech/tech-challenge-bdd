package br.com.fiap.tech.challenge.bdd.dto;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class PurchaseInputDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -8440508890936918851L;

    private String id;
    private CustomerInputDTO customer;
    private String status;
    private LocalDate date;
    private List<PurchaseItemInputDTO> items;
    private PaymentInputDTO payment;

    public String getId() {
        return id;
    }

    public PurchaseInputDTO setId(String id) {
        this.id = id;
        return this;
    }

    public CustomerInputDTO getCustomer() {
        return customer;
    }

    public PurchaseInputDTO setCustomer(CustomerInputDTO customer) {
        this.customer = customer;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PurchaseInputDTO setStatus(String status) {
        this.status = status;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public PurchaseInputDTO setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public List<PurchaseItemInputDTO> getItems() {
        return items;
    }

    public PurchaseInputDTO setItems(List<PurchaseItemInputDTO> items) {
        this.items = items;
        return this;
    }

    public PaymentInputDTO getPayment() {
        return payment;
    }

    public PurchaseInputDTO setPayment(PaymentInputDTO payment) {
        this.payment = payment;
        return this;
    }
}
