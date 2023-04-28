package com.smartagilify.projectmanagement.models;

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
public class PerformanceReport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

}
