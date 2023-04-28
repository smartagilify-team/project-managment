package com.smartagilify.projectmanagement.entities;

import com.smartagilify.core.entities.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "PMS$T_PROJECT")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project extends BaseEntity {

    private String title;
    private Date startDate;
    private Date endDate;
    private BigDecimal budget;


}
