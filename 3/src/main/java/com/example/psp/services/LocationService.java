package com.example.psp.services;

import com.example.psp.dto.Location;
import com.example.psp.dto.LocationDto;
import com.example.psp.security.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    public void locationPost(LocationDto locationDto, User user)  {}

    public List<Location> locationPageSizePageNumberGet(Integer pageSize, Integer pageNumber, User user)  {return null;}

    public void locationIdPut(Integer id, LocationDto locationDto, User user)  {}

    public LocationDto locationIdGet(Integer id, User user)  {return null;}

    public void locationIdDelete(Integer id, User user)  {}
}

