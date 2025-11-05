package org.st.unified.svc.biz.unibank.insurance.component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Schema(description = "Response model for calculated insurance tariff")
public class InsuranceTariffCalculateResponse implements Serializable {

    @Schema(description = "Calculated insurance tariff amount", example = "125.37", requiredMode = Schema.RequiredMode.REQUIRED)
    private BigDecimal calculatedTariff;

    @Schema(description = "Currency of calculated tariff", example = "USD", requiredMode = Schema.RequiredMode.REQUIRED)
    private String currency;

    @Schema(description = "Recommended insurance period in days", example = "365")
    private Integer recommendedPeriod;

    @Schema(description = "Comments or additional info for calculation", example = "Tariff includes accident risk")
    private String comment;

    @Schema(description = "Final insured sum", example = "12000.00")
    private BigDecimal insuredSum;
}
