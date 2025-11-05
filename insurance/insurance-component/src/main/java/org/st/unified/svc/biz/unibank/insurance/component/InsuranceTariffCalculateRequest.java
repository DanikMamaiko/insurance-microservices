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
@Schema(description = "Request model to calculate insurance tariff")
public class InsuranceTariffCalculateRequest implements Serializable {

    @Schema(description = "Insurance condition id", requiredMode = Schema.RequiredMode.REQUIRED, example = "101")
    private Long conditionId;

    @Schema(description = "Sum to be insured", requiredMode = Schema.RequiredMode.REQUIRED, example = "10000.00")
    private BigDecimal insuredSum;

    @Schema(description = "Policy duration in days", requiredMode = Schema.RequiredMode.REQUIRED, example = "365")
    private Integer durationDays;

    @Schema(description = "Client age in years", requiredMode = Schema.RequiredMode.REQUIRED, example = "35")
    private Integer clientAge;

    @Schema(description = "Additional risk options", example = "[\"SPORTS\",\"TRAVELLING\"]")
    private List<String> additionalOptions;
}