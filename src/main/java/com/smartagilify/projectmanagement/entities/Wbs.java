package com.smartagilify.projectmanagement.entities;

import com.smartagilify.core.entities.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name = "PMS$T_WBS")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Wbs extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
    private Date scheduleStartDate;
    private Date scheduleEndDate;
    private Date actualStartDate;
    private Date actualEndDate;
    private Integer weightPercent;
    private Integer progressPercent;

}
