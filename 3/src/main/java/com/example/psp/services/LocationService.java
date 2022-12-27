package com.example.psp.services;

import com.example.psp.model.Location;
import com.example.psp.dto.LocationDto;
import com.example.psp.security.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class LocationService {

//    private final LocationRepository locationRepository;
//    private final LocationMapper locationMapper;
//
//    public LocationService(LocationRepository locationRepository, LocationMapper locationMapper) {
//        this.locationRepository = locationRepository;
////        this.locationMapper = locationMapper;
//    }

    public void locationPost(LocationDto locationDto, User user) {
    }

    public List<Location> locationPageSizePageNumberGet(Integer pageSize, Integer pageNumber, User user) {
        return null;
    }

    public void locationIdPut(Integer id, LocationDto locationDto, User user) {
    }

    public LocationDto locationIdGet(Integer id, User user) {
//        Location location = locationRepository.findLocationById(id);
        return null;
//                locationMapper.toDto(location);
    }

    public void locationIdDelete(Integer id, User user) {
        if(id <= 0) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST
            );
        }
//        if(locationRepository.findLocationById(id) == null) {
//            throw new ResponseStatusException(
//                    HttpStatus.NOT_FOUND
//            );
//        }

//        locationRepository.deleteById(id);
    }
}

