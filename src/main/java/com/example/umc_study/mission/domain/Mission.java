package com.example.umc_study.mission.domain;

import com.example.umc_study.Common.BaseEntity;
import com.example.umc_study.Store.domain.Store;
import com.example.umc_study.mapping.MemberMission;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Mission extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;
    @Column(nullable = false)
    private Integer reward;
    @Column(nullable = false)
    private LocalDateTime deadline;
    @Column(nullable = false)
    private String missonSpec;
    @OneToMany(mappedBy = "mission", cascade = CascadeType.ALL)
    private List<MemberMission> memberAgreeList = new ArrayList<>();
}
