package br.com.fiap.tech.challenge.bdd.response;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class PurchaseResponse implements Serializable {

    private String id;
    private CustomerResponse customer;
    private String status;
    private LocalDate date;
    private List<PurchaseItemResponse> items;
    private PaymentResponse payment;

    public String getId() {
        return id;
    }

    public PurchaseResponse setId(String id) {
        this.id = id;
        return this;
    }

    public CustomerResponse getCustomer() {
        return customer;
    }

    public PurchaseResponse setCustomer(CustomerResponse customer) {
        this.customer = customer;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PurchaseResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public PurchaseResponse setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public List<PurchaseItemResponse> getItems() {
        return items;
    }

    public PurchaseResponse setItems(List<PurchaseItemResponse> items) {
        this.items = items;
        return this;
    }

    public PaymentResponse getPayment() {
        return payment;
    }

    public PurchaseResponse setPayment(PaymentResponse payment) {
        this.payment = payment;
        return this;
    }
}
