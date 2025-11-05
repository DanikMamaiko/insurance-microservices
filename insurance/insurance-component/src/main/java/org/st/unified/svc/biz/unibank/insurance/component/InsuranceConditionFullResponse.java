package org.st.unified.svc.biz.unibank.insurance.component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Schema(description = "Full detail model for insurance condition")
public class InsuranceConditionFullResponse implements Serializable {

    @Schema(description = "Identifier of insurance condition", example = "101", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long id;

    @Schema(description = "Name of the insurance condition", example = "Standard Life Insurance", requiredMode = Schema.RequiredMode.REQUIRED)
    private String name;

    @Schema(description = "Full description of the insurance condition", example = "Comprehensive life insurance policy covering a wide list of risks")
    private String description;

    @Schema(description = "Base tariff of this insurance condition (amount per policy)", example = "100.50")
    private BigDecimal baseTariff;

    @Schema(description = "List of covered risks", example = "[\"DEATH\",\"ACCIDENT\"]")
    private List<String> coveredRisks;

    @Schema(description = "List of exclusions", example = "[\"SUICIDE\",\"WAR_ACTIONS\"]")
    private List<String> exclusions;

    @Schema(description = "Currency of the base tariff", example = "USD")
    private String currency;
}