package org.st.unified.svc.biz.unibank.insurance;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.st.unified.svc.biz.unibank.insurance.component.InsuranceConditionFullResponse;
import org.st.unified.svc.biz.unibank.insurance.component.InsuranceConditionShortResponse;
import org.st.unified.svc.biz.unibank.insurance.component.InsuranceTariffCalculateRequest;
import org.st.unified.svc.biz.unibank.insurance.component.InsuranceTariffCalculateResponse;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@Tag(name = "insurance-provider", description = "Insurance provider description")
@RequestMapping(value = "/inner-api/payment-system/insurance")
public interface InsuranceProviderApi {

    @Operation(operationId = "getInsuranceConditions",
            summary = "Get list of insurance conditions",
            description = "Returns the list of all available insurance conditions"
    )
    @GetMapping(value = "condition/list", produces = APPLICATION_JSON_VALUE)
    List<InsuranceConditionShortResponse> getInsuranceConditions();

    @Operation(operationId = "getInsuranceConditionById",
            summary = "Get insurance condition by ID",
            description = "Returns detailed information about insurance condition by its id"
    )
    @GetMapping(value = "condition/{id}", produces = APPLICATION_JSON_VALUE)
    InsuranceConditionFullResponse getInsuranceConditionById(
            @Parameter(description = "Insurance condition id", required = true)
            @PathVariable("id") Long id);

    @Operation(operationId = "calculateInsuranceTariff",
            summary = "Calculate insurance tariff",
            description = "Calculates insurance tariff based on provided parameters"
    )
    @PostMapping(value = "condition/tariff/calculate", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    InsuranceTariffCalculateResponse calculateInsuranceTariff(
            @RequestBody InsuranceTariffCalculateRequest request);
}