package com.smartagilify.projectmanagement.models;

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
public class ProjectMember {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    private Date startDate;
    private Date endDate;

}
