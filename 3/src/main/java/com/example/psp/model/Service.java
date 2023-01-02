package com.example.psp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Tenant tenant;

    @NotNull
    private String name;

    private Integer durationMins;

    @NotNull
    @ColumnDefault("true")
    private Boolean isAvailable;

    @ManyToOne
    @JoinColumn(name = "tax_rate")
    private TaxRate taxRate;

    @OneToMany(mappedBy = "service")
    private List<TimeSlot> timeSlots;

    @PreRemove
    private void preRemove() {
        timeSlots.forEach(slot -> slot.setService(null));
    }
}