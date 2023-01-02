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
public class TimeSlot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @OneToMany(mappedBy = "timeSlot")
    private List<Reservation> reservations;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;

    @PreRemove
    private void preRemove() {
        reservations.forEach(reservation -> reservation.setTimeSlot(null));
    }
}
