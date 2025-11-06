package org.st.unified.svc.biz.unibank.insurance.controller;

import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;
import org.st.unified.svc.biz.unibank.insurance.contract.InsuranceApi;
import org.st.unified.svc.biz.unibank.insurance.model.Insurance;
import org.st.unified.svc.biz.unibank.insurance.model.InsuranceAddRequest;
import org.st.unified.svc.biz.unibank.insurance.model.InsuranceComparisonData;
import org.st.unified.svc.biz.unibank.insurance.model.InsuranceComparisonResult;
import org.st.unified.svc.biz.unibank.insurance.model.InsuranceUpdateRequest;
import org.st.unified.svc.biz.unibank.insurance.model.InsuranceView;
import org.st.unified.svc.biz.unibank.insurance.provider.client.InsuranceProviderClient;

import java.util.List;

@RestController
@Validated
public class InsuranceRest implements InsuranceApi {

    private final InsuranceProviderClient providerClient;

    public InsuranceRest(InsuranceProviderClient providerClient) {
        this.providerClient = providerClient;
    }

    @Override
    public InsuranceView create(InsuranceAddRequest request) {
        return null;
    }

    @Override
    public InsuranceView update(InsuranceUpdateRequest request) {
        return null;
    }

    @Override
    public List<InsuranceView> mergeList(List<InsuranceUpdateRequest> request) {
        return null;
    }

    @Override
    public Insurance read(String id) {

        var conditions = providerClient.getInsuranceConditions();
        System.out.println(conditions);

        return null;
    }

    @Override
    public void delete(String id) {
    }

    @Override
    public InsuranceView readView(String id) {
        return null;
    }

    @Override
    public Page<InsuranceView> find(Object filter) {
        return null;
    }

    @Override
    public InsuranceComparisonResult compare(List<InsuranceComparisonData> requests) {
        return null;
    }
}