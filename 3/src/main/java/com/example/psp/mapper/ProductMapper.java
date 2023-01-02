package com.example.psp.mapper;

import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.ProductDTO;
import com.example.psp.dto.ProductMaterialDTO;
import com.example.psp.model.Product;
import com.example.psp.model.ProductMaterial;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(config = DefaultMapperConfig.class)
public interface ProductMapper {

    @Mapping(source = "productMaterials", target = "materials")
    @Mapping(source = "brand.id", target = "brandId")
    @Mapping(source = "taxRate.id", target = "taxRateId")
    ProductDTO map(Product source);
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "materials", target = "productMaterials")
    @Mapping(source = "brandId", target = "brand.id")
    @Mapping(source = "taxRateId", target = "taxRate.id")
    Product map(ProductDTO source);

    @Mapping(source = "material.id", target = "materialId")
    @Mapping(source = "product.id", target = "productId")
    ProductMaterialDTO mapProductMaterial(ProductMaterial source);

    @Mapping(target = "id", ignore = true)
    @Mapping(source = "materialId", target = "material.id")
    @Mapping(source = "productId", target = "product.id")
    ProductMaterial mapProductMaterialDTO(ProductMaterialDTO source);
    List<ProductMaterialDTO> mapProductMaterials(List<ProductMaterial> source);
}
