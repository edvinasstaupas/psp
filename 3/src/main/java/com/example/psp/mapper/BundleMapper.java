package com.example.psp.mapper;

import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.BundleDTO;
import com.example.psp.dto.BundleProductDTO;
import com.example.psp.model.Bundle;
import com.example.psp.model.BundleProduct;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(config = DefaultMapperConfig.class)
public interface BundleMapper {

    @Mapping(source = "bundleProducts", target = "products")
    BundleDTO map(Bundle source);

    List<BundleProductDTO> mapBundleProducts(List<BundleProduct> bundleProducts);
    List<BundleProduct> mapBundleProductDTOs(List<BundleProductDTO> bundleProductDTOs);

    @Mapping(source = "bundle.id", target = "bundleId")
    @Mapping(source = "product.id", target = "productId")
    BundleProductDTO mapBundleProduct(BundleProduct bundleProduct);

    @Mapping(source = "bundleId", target = "bundle.id")
    @Mapping(source = "productId", target = "product.id")
    BundleProduct mapBundleProductDTO(BundleProductDTO bundleProductDTO);
}
