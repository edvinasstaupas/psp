package com.example.psp.services;

import com.example.psp.dto.MaterialDTO;
import com.example.psp.security.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {

    public void materialPost(MaterialDTO materialDTO, User user)  {}

    public void materialMaterialIdPut(Integer materialId, MaterialDTO materialDTO, User user)  {}

    public MaterialDTO materialMaterialIdGet(Integer materialId, User user)  {return null;}

    public void materialMaterialIdDelete(Integer materialId, User user)  {}

    public List<MaterialDTO> materialGet(Integer pageSize, Integer page, User user)  {return null;}
}
