package net.javaguides.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     @Column(name = "disaster_type")
     private String disasterType;

     @Column(name = "date")
     private String Date;

     @Column(name = "day_count")
     private String dayCount;

     @Column(name = "death_count")
     private String deathCount;
}
