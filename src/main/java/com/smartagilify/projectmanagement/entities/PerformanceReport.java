package com.smartagilify.projectmanagement.entities;

import com.smartagilify.core.entities.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "PMS$T_PERFORMANCE_REPORT")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PerformanceReport extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

}
