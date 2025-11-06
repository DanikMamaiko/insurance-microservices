//package org.st.unified.svc.biz.unibank.insurance.provider.service;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//import org.st.unified.svc.biz.unibank.insurance.component.InsuranceConditionFullResponse;
//import org.st.unified.svc.biz.unibank.insurance.component.InsuranceConditionShortResponse;
//import org.st.unified.svc.biz.unibank.insurance.component.InsuranceTariffCalculateRequest;
//import org.st.unified.svc.biz.unibank.insurance.component.InsuranceTariffCalculateResponse;
//import org.st.unified.svc.biz.unibank.insurance.provider.client.InsuranceProviderClient;
//import org.st.unified.svc.biz.unibank.insurance.provider.locator.InsuranceProviderLocator;
//
//import java.util.List;
//
//@Service
//public class InsuranceProviderService {
//    private final InsuranceProviderLocator locator;
//
//    @Value("${insurance.provider.url:http://localhost:8098}")
//    private String insuranceProviderUrl;
//
//    public InsuranceProviderService(InsuranceProviderLocator locator) {
//        this.locator = locator;
//    }
//
//    public List<InsuranceConditionShortResponse> getConditions() {
//        InsuranceProviderClient client = locator.getClient(insuranceProviderUrl);
//        return client.getInsuranceConditions();
//    }
//
//    public InsuranceConditionFullResponse getConditionById(Long id) {
//        InsuranceProviderClient client = locator.getClient(insuranceProviderUrl);
//        return client.getInsuranceConditionById(id);
//    }
//
//    public InsuranceTariffCalculateResponse calculate(InsuranceTariffCalculateRequest request) {
//        InsuranceProviderClient client = locator.getClient(insuranceProviderUrl);
//        return client.calculateInsuranceTariff(request);
//    }
//}