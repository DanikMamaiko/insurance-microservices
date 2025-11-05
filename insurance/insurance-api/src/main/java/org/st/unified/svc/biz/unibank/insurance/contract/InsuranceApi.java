package org.st.unified.svc.biz.unibank.insurance.contract;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.st.unified.svc.biz.unibank.insurance.model.Insurance;
import org.st.unified.svc.biz.unibank.insurance.model.InsuranceAddRequest;
import org.st.unified.svc.biz.unibank.insurance.model.InsuranceComparisonData;
import org.st.unified.svc.biz.unibank.insurance.model.InsuranceComparisonResult;
import org.st.unified.svc.biz.unibank.insurance.model.InsuranceUpdateRequest;
import org.st.unified.svc.biz.unibank.insurance.model.InsuranceView;
import jakarta.validation.Valid;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@Tag(name = "insurance")
@RequestMapping(value = "api/insurances")
public interface InsuranceApi {

    @ApiResponse(responseCode = "200", description = "OK")
    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    InsuranceView create(@RequestBody @Validated InsuranceAddRequest request);

    @ApiResponse(responseCode = "200", description = "OK")
    @PutMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    InsuranceView update(@RequestBody @Validated InsuranceUpdateRequest request);

    @ApiResponse(responseCode = "200", description = "OK")
    @PutMapping(value = "merge/list", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    List<InsuranceView> mergeList(@RequestBody @Validated List<@Valid InsuranceUpdateRequest> request);

    @ApiResponse(responseCode = "200", description = "OK")
    @GetMapping(value = "{id}", produces = APPLICATION_JSON_VALUE)
    Insurance read(@PathVariable(name = "id") String id);

    @ApiResponse(responseCode = "204", description = "No Content")
    @DeleteMapping(value = "{id}", produces = APPLICATION_JSON_VALUE)
    void delete(@PathVariable(name = "id") String id);

    @ApiResponse(responseCode = "200", description = "OK")
    @GetMapping(value = "{id}/view", produces = APPLICATION_JSON_VALUE)
    InsuranceView readView(@PathVariable(name = "id") String id);

    @ApiResponse(responseCode = "200", description = "OK")
    @PostMapping(value = "find", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    Page<InsuranceView> find(@RequestBody Object filter);

    @ApiResponse(responseCode = "200", description = "OK")
    @PostMapping(value = "compare", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    InsuranceComparisonResult compare(@RequestBody List<InsuranceComparisonData> requests);
}