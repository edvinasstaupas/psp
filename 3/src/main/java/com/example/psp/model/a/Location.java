package com.example.psp.model.a;

import com.example.psp.model.n.Tenant;
import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Tenant tenantId;

    @NotNull
    private String name;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

}

