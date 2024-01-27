package br.com.fiap.tech.challenge.bdd.fixture;

import br.com.fiap.tech.challenge.bdd.dto.PurchaseInputDTO;
import org.instancio.Instancio;
import org.instancio.Model;

import java.util.List;

import static br.com.fiap.tech.challenge.bdd.fixture.CustomerInputDTOFixture.customerInputDTO;
import static br.com.fiap.tech.challenge.bdd.fixture.PaymentInputDTOFixture.paymentInputDTO;
import static br.com.fiap.tech.challenge.bdd.fixture.PurchaseItemInputDTOFixture.singleBeverageInputItemDTO;
import static br.com.fiap.tech.challenge.bdd.fixture.PurchaseItemInputDTOFixture.singleSandwichInputItemDTO;
import static org.instancio.Select.field;

public class PurchaseInputDTOFixture {

    private PurchaseInputDTOFixture(){}

    public static Model<PurchaseInputDTO> sandwichAndBeveragePurchaseInputDTO() {
        return Instancio.of(PurchaseInputDTO.class)
                .generate(field(PurchaseInputDTO::getId), gen -> gen.text().uuid())
                .generate(field(PurchaseInputDTO::getDate), gen -> gen.temporal().localDate())
                .set(field(PurchaseInputDTO::getCustomer), Instancio.create(customerInputDTO()))
                .set(field(PurchaseInputDTO::getPayment), Instancio.create(paymentInputDTO()))
                .set(field(PurchaseInputDTO::getStatus), "PAID")
                .set(field(PurchaseInputDTO::getItems), List.of(
                        Instancio.create(singleSandwichInputItemDTO()),
                        Instancio.create(singleBeverageInputItemDTO())
                ))
                .toModel();
    }
}
