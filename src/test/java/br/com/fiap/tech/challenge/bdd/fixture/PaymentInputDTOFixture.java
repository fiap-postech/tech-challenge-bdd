package br.com.fiap.tech.challenge.bdd.fixture;

import br.com.fiap.tech.challenge.bdd.dto.PaymentInputDTO;
import org.instancio.Instancio;
import org.instancio.Model;

import java.math.BigDecimal;

import static org.instancio.Select.field;

public class PaymentInputDTOFixture {

    private PaymentInputDTOFixture(){}

    public static Model<PaymentInputDTO> paymentInputDTO() {
        return Instancio.of(PaymentInputDTO.class)
                .generate(field(PaymentInputDTO::getId), gen -> gen.text().uuid())
                .generate(field(PaymentInputDTO::getDate), gen -> gen.temporal().localDate())
                .generate(field(PaymentInputDTO::getAmount), gen -> gen.math().bigDecimal().min(BigDecimal.valueOf(20.00)))
                .set(field(PaymentInputDTO::getMethod), "PAID_MARKET")
                .set(field(PaymentInputDTO::getStatus), "PAID")
                .set(field(PaymentInputDTO::getUrlPayment), "http://paga.eu/12345")
                .toModel();
    }

}
