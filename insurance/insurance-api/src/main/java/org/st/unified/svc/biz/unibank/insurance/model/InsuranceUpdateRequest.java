package org.st.unified.svc.biz.unibank.insurance.model;

import lombok.Data;

@Data
public class InsuranceUpdateRequest {
    private String id;
    private String name;
    private String type;
}