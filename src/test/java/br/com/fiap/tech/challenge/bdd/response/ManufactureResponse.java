package br.com.fiap.tech.challenge.bdd.response;

import java.time.LocalDate;
import java.util.List;

public class ManufactureResponse {

    private String id;
    private CustomerResponse customer;
    private String status;
    private LocalDate date;
    private String code;
    private List<ManufactureItemResponse> items;

    public String getId() {
        return id;
    }

    public ManufactureResponse setId(String id) {
        this.id = id;
        return this;
    }

    public CustomerResponse getCustomer() {
        return customer;
    }

    public ManufactureResponse setCustomer(CustomerResponse customer) {
        this.customer = customer;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ManufactureResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public ManufactureResponse setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ManufactureResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public List<ManufactureItemResponse> getItems() {
        return items;
    }

    public ManufactureResponse setItems(List<ManufactureItemResponse> items) {
        this.items = items;
        return this;
    }
}
