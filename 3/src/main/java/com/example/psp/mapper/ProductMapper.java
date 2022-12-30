package com.example.psp.mapper;

import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.ProductDTO;
import com.example.psp.dto.ProductMaterialDTO;
import com.example.psp.model.Product;
import com.example.psp.model.ProductMaterial;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = DefaultMapperConfig.class)
public interface ProductMapper {

    ProductDTO map(Product source);
    Product map(ProductDTO source);

    List<Product> mapProductDTOs(List<ProductDTO> source);
    List<ProductDTO> mapProducts(List<Product> source);

    ProductMaterialDTO mapProductMaterial(ProductMaterial source);
    ProductMaterial mapProductMaterialDTO(ProductMaterialDTO source);
    List<ProductMaterialDTO> mapProductMaterials(List<ProductMaterial> source);
}
