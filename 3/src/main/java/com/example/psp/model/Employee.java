package com.example.psp.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String role;

    @NotNull
    private OffsetDateTime dateHired;

    @NotNull
    private OffsetDateTime dateDeleted;

    @OneToMany(mappedBy = "employee")
    private List<Order> orders;

    @OneToMany(mappedBy = "employee")
    private List<TimeSlot> timeslots;

}
