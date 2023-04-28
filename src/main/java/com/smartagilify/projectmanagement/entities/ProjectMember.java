package com.smartagilify.projectmanagement.entities;

import com.smartagilify.core.entities.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name = "PMS$T_PROJECT_MEMBER")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectMember extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    private Date startDate;
    private Date endDate;

}
