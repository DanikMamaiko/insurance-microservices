package org.st.unified.svc.biz.unibank.insurance.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.st.unified.svc.biz.unibank.insurance.dal.entity.InsuranceEntity;

public interface InsuranceRepository extends JpaRepository<InsuranceEntity, String> {

    boolean existsByPolicyNumber(String policyNumber);
}