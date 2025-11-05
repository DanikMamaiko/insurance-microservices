package org.st.unified.svc.biz.unibank.insurance.controller;

import org.springframework.web.bind.annotation.RestController;
import org.st.unified.svc.biz.unibank.insurance.InsuranceProviderApi;
import org.st.unified.svc.biz.unibank.insurance.component.InsuranceConditionFullResponse;
import org.st.unified.svc.biz.unibank.insurance.component.InsuranceConditionShortResponse;
import org.st.unified.svc.biz.unibank.insurance.component.InsuranceTariffCalculateRequest;
import org.st.unified.svc.biz.unibank.insurance.component.InsuranceTariffCalculateResponse;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class InsuranceController implements InsuranceProviderApi {

    @Override
    public List<InsuranceConditionShortResponse> getInsuranceConditions() {
        return List.of(
                new InsuranceConditionShortResponse()
                        .setId(101L)
                        .setName("Standard Life Insurance")
                        .setBriefDescription("Base policy for life insurance")
                        .setActive(true)
                        .setType("LIFE"),
                new InsuranceConditionShortResponse()
                        .setId(102L)
                        .setName("Auto Insurance")
                        .setBriefDescription("Protects your vehicle")
                        .setActive(true)
                        .setType("AUTO")
        );
    }

    @Override
    public InsuranceConditionFullResponse getInsuranceConditionById(Long id) {
        return new InsuranceConditionFullResponse()
                .setId(id)
                .setName("Standard Life Insurance")
                .setDescription("Comprehensive life insurance policy covering a wide list of risks")
                .setBaseTariff(BigDecimal.valueOf(100.50))
                .setCoveredRisks(List.of("DEATH", "ACCIDENT"))
                .setExclusions(List.of("SUICIDE", "WAR_ACTIONS"))
                .setCurrency("USD");
    }

    @Override
    public InsuranceTariffCalculateResponse calculateInsuranceTariff(InsuranceTariffCalculateRequest request) {
        BigDecimal calculatedTariff = BigDecimal.valueOf(150.75);

        InsuranceTariffCalculateResponse response = new InsuranceTariffCalculateResponse();
        response.setCalculatedTariff(calculatedTariff);
        response.setCurrency("USD");

        return response;
    }
}
