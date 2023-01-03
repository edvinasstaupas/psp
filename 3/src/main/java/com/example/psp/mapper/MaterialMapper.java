package com.example.psp.mapper;

import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.MaterialDTO;
import com.example.psp.model.Material;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(config = DefaultMapperConfig.class)
public interface MaterialMapper {

    MaterialDTO map(Material source);
    @Mapping(target = "id", ignore = true)
    Material map(MaterialDTO source);

    List<MaterialDTO> mapMaterials(List<Material> source);
    List<Material> mapMaterialDTOs(List<MaterialDTO> source);

}
