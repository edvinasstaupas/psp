package com.example.psp.services;

import com.example.psp.mapper.AddressMapper;
import com.example.psp.mapper.LocationMapper;
import com.example.psp.model.Address;
import com.example.psp.model.Location;
import com.example.psp.dto.LocationDto;
import com.example.psp.repositories.AddressRepository;
import com.example.psp.repositories.LocationRepository;
import com.example.psp.security.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService {

    private final LocationRepository locationRepository;
    private final LocationMapper locationMapper;
    private final AddressMapper addressMapper;
    private final AddressRepository addressRepository;

    public LocationService(LocationRepository locationRepository, LocationMapper locationMapper, AddressMapper addressMapper, AddressRepository addressRepository) {
        this.locationRepository = locationRepository;
        this.locationMapper = locationMapper;
        this.addressMapper = addressMapper;
        this.addressRepository = addressRepository;
    }

    public void locationPost(LocationDto locationDto, User user) {
        Location location = new Location();
        Address address = addressMapper.toAddress(locationDto.getAddress());
        addressRepository.save(address);
        location.setAddress(address);
        location.setName(locationDto.getName().orElse("No Name"));
        locationRepository.save(location);
    }

    public List<LocationDto> locationPageSizePageNumberGet(Integer pageSize, Integer pageNumber, User user) {
        List<Location> originalList = locationRepository.findAllLocations();
        List<List<Location>> sublists = new ArrayList<>();

        for (int i = 0; i < originalList.size(); i += pageSize) {
            List<Location> sublist = new ArrayList<>(originalList.subList(i, Math.min(i + pageSize, originalList.size())));
            sublists.add(sublist);
        }
        if(pageNumber > sublists.size()) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST
            );
        }
        return locationMapper.mapList(sublists.get(pageNumber-1));
    }

    public void locationIdPut(Integer id, LocationDto locationDto, User user) {
        Location location = locationRepository.findLocationById(id);
        if(location == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        Address address = addressMapper.toAddress(locationDto.getAddress());
        addressRepository.save(address);
        location.setAddress(address);
        location.setName(locationDto.getName().orElse("No Name"));
        locationRepository.save(location);
    }

    public LocationDto locationIdGet(Integer id, User user) {
        Location location = locationRepository.findLocationById(id);
        if(location == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        return locationMapper.map(location);
    }

    public void locationIdDelete(Integer id, User user) {
        Location location = locationRepository.findLocationById(id);
        if(location == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        locationRepository.delete(location);
    }
}

