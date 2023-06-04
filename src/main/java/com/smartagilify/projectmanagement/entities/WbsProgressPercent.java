package com.smartagilify.projectmanagement.entities;

import com.smartagilify.core.entities.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Table(name = "PMS$T_WBS_PROGRESS_PERCENT")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WbsProgressPercent extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "PERFORMANCE_REPORT_ID")
    private PerformanceReport performanceReport;

    @ManyToOne
    @JoinColumn(name = "wbs")
    private Wbs wbs;

    @Column(name = "PROGRESS_PERCENT")
    @Min(0)
    @Max(100)
    private Float progressPercent;

}
