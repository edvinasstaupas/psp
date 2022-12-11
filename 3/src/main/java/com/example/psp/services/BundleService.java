package com.example.psp.services;

import com.example.psp.dto.BundleDTO;
import com.example.psp.security.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BundleService {

    public void bundleBundleIdDelete(Integer bundleId, User user)  {}

    public BundleDTO bundleBundleIdGet(Integer bundleId, User user)  {return null;}

    public void bundleBundleIdPut(Integer bundleId, BundleDTO bundleDTO, User user)  {}

    public List<BundleDTO> bundleGet(Integer pageSize, Integer page, User user)  {return null;}

    public void bundlePost(BundleDTO bundleDTO, User user)  {}
}
