package com.example.psp.mapper;

import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.TimeSlotDTO;
import com.example.psp.model.TimeSlot;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(config = DefaultMapperConfig.class)
public interface TimeSlotMapper {

    List<TimeSlotDTO> mapSlots(List<TimeSlot> slots);

    @Mapping(source = "service.id", target = "serviceId")
    @Mapping(source = "employee.id", target = "employeeId")
    @Mapping(source = "location.id", target = "locationId")
    TimeSlotDTO map(TimeSlot slot);

    void update(TimeSlotDTO dto, @MappingTarget TimeSlot source);
}
