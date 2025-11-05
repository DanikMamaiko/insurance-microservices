package org.st.unified.svc.biz.unibank.insurance.dal.mapper;

import org.mapstruct.Mapper;
import org.st.unified.svc.biz.unibank.insurance.dal.entity.InsuranceEntity;
import org.st.unified.svc.biz.unibank.insurance.model.InsuranceAddRequest;
import org.st.unified.svc.biz.unibank.insurance.model.InsuranceModelUpdateRequest;
import org.st.unified.svc.biz.unibank.insurance.model.InsuranceView;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InsuranceMapper {

    InsuranceEntity toEntity(InsuranceAddRequest dto);

    InsuranceEntity toEntity(InsuranceModelUpdateRequest dto);

    InsuranceView toView(InsuranceEntity entity);

    List<InsuranceView> toViewList(List<InsuranceEntity> entities);

}