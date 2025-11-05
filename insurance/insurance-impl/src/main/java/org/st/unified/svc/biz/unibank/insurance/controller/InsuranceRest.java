package org.st.unified.svc.biz.unibank.insurance.controller;

import org.st.unified.svc.biz.unibank.insurance.contract.InsuranceApi;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;
import org.st.unified.svc.biz.unibank.insurance.model.*;

import java.util.List;

@RestController
@Validated
@RequiredArgsConstructor
public class InsuranceRest implements InsuranceApi {

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