package br.com.fiap.tech.challenge.bdd.response;

import java.util.List;

public class ProductResponseList {

    private Integer number;
    private Integer size;
    private Integer numberOfElements;
    private Long totalElements;
    private List<ProductResponse> content;

    public Integer getNumber() {
        return number;
    }

    public ProductResponseList setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public ProductResponseList setSize(Integer size) {
        this.size = size;
        return this;
    }

    public Integer getNumberOfElements() {
        return numberOfElements;
    }

    public ProductResponseList setNumberOfElements(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }

    public Long getTotalElements() {
        return totalElements;
    }

    public ProductResponseList setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    public List<ProductResponse> getContent() {
        return content;
    }

    public ProductResponseList setContent(List<ProductResponse> content) {
        this.content = content;
        return this;
    }
}