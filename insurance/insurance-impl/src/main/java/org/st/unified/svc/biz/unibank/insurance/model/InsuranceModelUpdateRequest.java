package org.st.unified.svc.biz.unibank.insurance.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InsuranceModelUpdateRequest {

    private String id;

    private String policyNumber;

    private String holderName;

    private LocalDate startDate;

    private LocalDate endDate;

    private String details;
}