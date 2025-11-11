package org.st.unified.svc.biz.unibank.insurance.dal.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "insurance")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InsuranceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false, unique = true)
    private String policy;

    @Column(nullable = false)
    private String coverageAmount;

    private LocalDate startDate;

    private LocalDate endDate;

    @Column(length = 2048)
    private String details;
}
