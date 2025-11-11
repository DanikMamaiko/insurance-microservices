package org.st.unified.svc.biz.unibank.insurance.dal.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.st.unified.svc.biz.unibank.insurance.dal.entity.InsuranceEntity;
import org.st.unified.svc.biz.unibank.insurance.dal.mapper.InsuranceMapper;
import org.st.unified.svc.biz.unibank.insurance.dal.repository.InsuranceRepository;
import org.st.unified.svc.biz.unibank.insurance.model.InsuranceAddRequest;
import org.st.unified.svc.biz.unibank.insurance.model.InsuranceUpdateRequest;
import org.st.unified.svc.biz.unibank.insurance.model.InsuranceView;

@Service
@Transactional
public class InsuranceService {

    private final InsuranceRepository repository;
    private final InsuranceMapper mapper;

    public InsuranceService(InsuranceRepository repository, InsuranceMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public InsuranceView create(InsuranceAddRequest request) {
        InsuranceEntity entity = mapper.toEntity(request);
        InsuranceEntity saved = repository.save(entity);
        return mapper.toView(saved);
    }

    public InsuranceView update(InsuranceUpdateRequest request) {
        InsuranceEntity existing = repository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("Insurance not found"));

        existing.setName(request.getName());
        existing.setType(request.getType());

        InsuranceEntity updated = repository.save(existing);
        return mapper.toView(updated);
    }

    public InsuranceView read(String id) {
        return repository.findById(id)
                .map(mapper::toView)
                .orElseThrow(() -> new RuntimeException("Insurance not found"));
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public Page<InsuranceView> find(Pageable pageable) {
        Page<InsuranceEntity> page = repository.findAll(pageable);
        return page.map(mapper::toView);
    }
}