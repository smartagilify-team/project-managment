package com.smartagilify.projectmanagement.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table(name = "PMS$T_PROJECT_SETTING")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectSetting {
    @Id
    private Long id;
    @ManyToMany
    @JoinColumn(name = "project")
    private List<Project> projects;

}
