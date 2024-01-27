package br.com.fiap.tech.challenge.bdd.fixture;

import br.com.fiap.tech.challenge.bdd.dto.PurchaseItemInputDTO;
import org.instancio.Instancio;
import org.instancio.Model;

import java.math.BigDecimal;

import static br.com.fiap.tech.challenge.bdd.fixture.ProductInputDTOFixture.beverageInputDTO;
import static br.com.fiap.tech.challenge.bdd.fixture.ProductInputDTOFixture.sandwichInputDTO;
import static org.instancio.Select.field;

public class PurchaseItemInputDTOFixture {

    private PurchaseItemInputDTOFixture(){}

    public static Model<PurchaseItemInputDTO> singleBeverageInputItemDTO() {
        return Instancio.of(PurchaseItemInputDTO.class)
                .set(field(PurchaseItemInputDTO::getProduct), Instancio.create(beverageInputDTO()))
                .set(field(PurchaseItemInputDTO::getPrice), BigDecimal.valueOf(5.00))
                .set(field(PurchaseItemInputDTO::getFullPrice), BigDecimal.valueOf(5.00))
                .set(field(PurchaseItemInputDTO::getDiscount), BigDecimal.ZERO)
                .set(field(PurchaseItemInputDTO::getQuantity), 1)
                .toModel();
    }


    public static Model<PurchaseItemInputDTO> singleSandwichInputItemDTO() {
        return Instancio.of(PurchaseItemInputDTO.class)
                .set(field(PurchaseItemInputDTO::getProduct), Instancio.create(sandwichInputDTO()))
                .set(field(PurchaseItemInputDTO::getPrice), BigDecimal.valueOf(17.00))
                .set(field(PurchaseItemInputDTO::getFullPrice), BigDecimal.valueOf(17.00))
                .set(field(PurchaseItemInputDTO::getDiscount), BigDecimal.ZERO)
                .set(field(PurchaseItemInputDTO::getQuantity), 1)
                .toModel();
    }
}
