package com.smartagilify.projectmanagement.entities;

import com.smartagilify.core.entities.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "PMS$T_PROJECT_SETTING")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectSetting extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "PROJECT")
    private Project project;

    @Column(name = "ROLE_ID")
    private Long roleId;

}
