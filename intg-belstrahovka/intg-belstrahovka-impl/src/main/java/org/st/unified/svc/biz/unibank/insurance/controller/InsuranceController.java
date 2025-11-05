package org.st.unified.svc.biz.unibank.insurance.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.st.unified.svc.biz.unibank.insurance.InsuranceProviderApi;
import org.st.unified.svc.biz.unibank.insurance.component.InsuranceConditionFullResponse;
import org.st.unified.svc.biz.unibank.insurance.component.InsuranceConditionShortResponse;
import org.st.unified.svc.biz.unibank.insurance.component.InsuranceTariffCalculateRequest;
import org.st.unified.svc.biz.unibank.insurance.component.InsuranceTariffCalculateResponse;

import java.util.List;

@RestController
public class InsuranceController implements InsuranceProviderApi {

    @Override
    public List<InsuranceConditionShortResponse> getInsuranceConditions() {
        return null;
    }

    @Override
    public InsuranceConditionFullResponse getInsuranceConditionById(Long id) {
        return null;
    }

    @Override
    public InsuranceTariffCalculateResponse calculateInsuranceTariff(InsuranceTariffCalculateRequest request) {
        return null;
    }
}
