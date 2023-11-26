package com.example.umc_study.mapping;

import com.example.umc_study.Common.BaseEntity;
import com.example.umc_study.enums.MissionStatus;
import com.example.umc_study.enums.Status;
import com.example.umc_study.member.domain.Member;
import com.example.umc_study.mission.domain.Mission;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberMission extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "misson_id")
    private Mission mission;
    @Column(nullable = false, length = 15)
    @Enumerated(EnumType.STRING)
    private MissionStatus status;
}
