package com.example.psp.mapper;

import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.LocationDto;
import com.example.psp.model.Location;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = DefaultMapperConfig.class)
public interface LocationMapper {

    LocationDto map(Location location);

    List<LocationDto> mapList(List<Location> locations);
}