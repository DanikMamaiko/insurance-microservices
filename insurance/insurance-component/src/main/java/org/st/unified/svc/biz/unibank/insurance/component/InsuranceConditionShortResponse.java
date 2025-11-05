package org.st.unified.svc.biz.unibank.insurance.component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Data
@NoArgsConstructor
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Schema(description = "Short info model about insurance condition")
public class InsuranceConditionShortResponse implements Serializable {

    @Schema(description = "Identifier of insurance condition", example = "101", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long id;

    @Schema(description = "Name of the insurance condition", example = "Standard Life Insurance", requiredMode = Schema.RequiredMode.REQUIRED)
    private String name;

    @Schema(description = "Brief description of the insurance condition", example = "Base policy for life insurance")
    private String briefDescription;

    @Schema(description = "Whether the policy is currently active and available", example = "true")
    private Boolean active;

    @Schema(description = "Type of insurance", example = "LIFE")
    private String type;
}