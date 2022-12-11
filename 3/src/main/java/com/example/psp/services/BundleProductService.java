package com.example.psp.services;

import com.example.psp.dto.BundleProduct;
import com.example.psp.security.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BundleProductService {

    public void bundleProductPost(BundleProduct bundleProduct, User user)  {}

    public void bundleProductBundleIdProductIdPut(Integer bundleId, Integer productId, BundleProduct bundleProduct, User user)  {}

    public BundleProduct bundleProductBundleIdProductIdGet(Integer bundleId, Integer productId, User user)  {return null;}

    public void bundleProductBundleIdProductIdDelete(Integer bundleId, Integer productId, User user)  {}

    public List<BundleProduct> bundleProductBundleIdGet(Integer bundleId, User user)  {return null;}
}

