package br.com.fiap.tech.challenge.bdd.fixture;

import br.com.fiap.tech.challenge.bdd.dto.ComboInputDTO;
import br.com.fiap.tech.challenge.bdd.dto.ProductInputDTO;
import org.instancio.Instancio;
import org.instancio.Model;

import java.math.BigDecimal;

import static org.instancio.Select.field;

public class ProductInputDTOFixture {

    private ProductInputDTOFixture(){}

    public static Model<ProductInputDTO> beverageInputDTO() {
        return Instancio.of(ProductInputDTO.class)
                .generate(field(ProductInputDTO::getId), gen -> gen.text().uuid())
                .set(field(ProductInputDTO::getName), "Bebida")
                .generate(field(ProductInputDTO::getPrice), gen -> gen.math().bigDecimal().min(BigDecimal.valueOf(3.00)))
                .generate(field(ProductInputDTO::getFullPrice), gen -> gen.math().bigDecimal().max(BigDecimal.valueOf(2.00)))
                .set(field(ProductInputDTO::getDiscount), BigDecimal.ZERO)
                .toModel();
    }

    public static Model<ProductInputDTO> sandwichInputDTO() {
        return Instancio.of(ProductInputDTO.class)
                .generate(field(ProductInputDTO::getId), gen -> gen.text().uuid())
                .set(field(ProductInputDTO::getName), "Lanche")
                .generate(field(ProductInputDTO::getPrice), gen -> gen.math().bigDecimal().min(BigDecimal.valueOf(3.00)))
                .generate(field(ProductInputDTO::getFullPrice), gen -> gen.math().bigDecimal().max(BigDecimal.valueOf(2.00)))
                .set(field(ProductInputDTO::getDiscount), BigDecimal.ZERO)
                .toModel();
    }



}
