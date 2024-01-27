package br.com.fiap.tech.challenge.bdd.fixture;

import br.com.fiap.tech.challenge.bdd.dto.CustomerInputDTO;
import org.instancio.Instancio;
import org.instancio.Model;

import static org.instancio.Select.field;

public class CustomerInputDTOFixture {

    private CustomerInputDTOFixture(){}

    public static Model<CustomerInputDTO> customerInputDTO() {
        return Instancio.of(CustomerInputDTO.class)
                .generate(field(CustomerInputDTO::getId), gen -> gen.text().uuid())
                .generate(field(CustomerInputDTO::getEmail), gen -> gen.text().pattern("#a#a#a#a#a#a@domain.com"))
                .set(field(CustomerInputDTO::getDocument), "19748826325")
                .toModel();
    }
}
