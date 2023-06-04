package com.smartagilify.projectmanagement.entities;

import com.smartagilify.core.entities.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;

@Table(name = "PMS$T_WBS")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Wbs extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "PROJECT_ID", foreignKey = @ForeignKey(name = "FK_PROJECT_WBS"))
    private Project project;

    @Column(name = "WBS_TITLE")
    private String wbsTitle;

    @Column(name = "SCHEDULE_START_DATE")
    private Date scheduleStartDate;

    @Column(name = "SCHEDULE_END_DATE")
    private Date scheduleEndDate;

    @Column(name = "ACTUAL_START_DATE")
    private Date actualStartDate;

    @Column(name = "ACTUAL_END_DATE")
    private Date actualEndDate;

    @Column(name = "WEIGHT_PERCENT")
    @Min(0)
    @Max(100)
    private Float weightPercent;

    @Min(0)
    @Max(100)
    @Column(name = "PROGRESS_PERCENT")
    private Float progressPercent;

}
