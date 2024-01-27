package br.com.fiap.tech.challenge.bdd.dto;

import java.io.Serial;

public class ComboInputDTO extends ProductInputDTO {
    @Serial
    private static final long serialVersionUID = 7002042207857288411L;

    private ProductInputDTO beverage;
    private ProductInputDTO sandwich;
    private ProductInputDTO sideDish;

    public ProductInputDTO getBeverage() {
        return beverage;
    }

    public ComboInputDTO setBeverage(ProductInputDTO beverage) {
        this.beverage = beverage;
        return this;
    }

    public ProductInputDTO getSandwich() {
        return sandwich;
    }

    public ComboInputDTO setSandwich(ProductInputDTO sandwich) {
        this.sandwich = sandwich;
        return this;
    }

    public ProductInputDTO getSideDish() {
        return sideDish;
    }

    public ComboInputDTO setSideDish(ProductInputDTO sideDish) {
        this.sideDish = sideDish;
        return this;
    }
}
