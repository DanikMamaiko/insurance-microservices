package org.st.unified.svc.biz.unibank.insurance.model;

import lombok.Data;

@Data
public class InsuranceComparisonResult {
    private boolean match;
    private String comments;
}