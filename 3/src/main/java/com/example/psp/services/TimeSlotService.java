package com.example.psp.services;

import com.example.psp.dto.TimeSlotDTO;
import com.example.psp.mapper.TimeSlotMapper;
import com.example.psp.model.Employee;
import com.example.psp.model.TimeSlot;
import com.example.psp.repositories.EmployeeRepository;
import com.example.psp.repositories.LocationRepository;
import com.example.psp.repositories.ServiceRepository;
import com.example.psp.repositories.TimeSlotRepository;
import com.example.psp.security.SecurityUtils;
import com.example.psp.security.User;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class TimeSlotService {
    private final TimeSlotRepository timeSlotRepository;
    private final ServiceRepository serviceRepository;
    private final LocationRepository locationRepository;
    private final EmployeeRepository employeeRepository;
    private final TimeSlotMapper timeSlotMapper;

    public TimeSlotService(TimeSlotRepository timeSlotRepository, ServiceRepository serviceRepository, LocationRepository locationRepository,
            EmployeeRepository employeeRepository, TimeSlotMapper timeSlotMapper) {
        this.timeSlotRepository = timeSlotRepository;
        this.serviceRepository = serviceRepository;
        this.locationRepository = locationRepository;
        this.employeeRepository = employeeRepository;
        this.timeSlotMapper = timeSlotMapper;
    }

    public List<TimeSlotDTO> getSlotsByEmployeeId(Integer employeeId, User user) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow();
        SecurityUtils.checkTenantId(employee.getUser().getTenantId(), user);
        List<TimeSlot> timeslots = employee.getTimeslots();
        return timeSlotMapper.mapSlots(timeslots);
    }

    public List<TimeSlotDTO> getSlotsByInterval(OffsetDateTime fromDate, OffsetDateTime toDate, User user) {
        List<TimeSlot> slots = timeSlotRepository.findAllByStartTimeGreaterThanEqualAndEndTimeLessThanEqual(fromDate, toDate);
        return timeSlotMapper.mapSlots(slots);
    }

    public List<TimeSlotDTO> getSlotsByLocationId(Integer locationId, User user) {
        List<TimeSlot> slots = timeSlotRepository.findAllByLocationId(locationId);
        return timeSlotMapper.mapSlots(slots);
    }

    public List<TimeSlotDTO> getSlotsByServiceId(Integer serviceId, User user) {
        List<TimeSlot> slots = timeSlotRepository.findAllByServiceId(serviceId);
        return timeSlotMapper.mapSlots(slots);
    }

    public void createTimeSlot(TimeSlotDTO timeSlotDTO, User user) {
        TimeSlot timeSlot = new TimeSlot();
        applyUpdate(timeSlotDTO, timeSlot);
    }

    public void deleteSlot(Integer timeSlotId, User user) {
        TimeSlot timeSlot = timeSlotRepository.findById(timeSlotId).orElseThrow();
        checkTenantId(user, timeSlot);
        timeSlotRepository.delete(timeSlot);
    }

    public TimeSlotDTO getSlotById(Integer timeSlotId, User user) {
        TimeSlot timeSlot = timeSlotRepository.findById(timeSlotId).orElseThrow();
        checkTenantId(user, timeSlot);
        return timeSlotMapper.map(timeSlot);
    }

    public void updateSlot(Integer timeSlotId, TimeSlotDTO timeSlotDTO, User user) {
        TimeSlot timeSlot = timeSlotRepository.findById(timeSlotId).orElseThrow();
        checkTenantId(user, timeSlot);
        applyUpdate(timeSlotDTO, timeSlot);
    }

    private void applyUpdate(TimeSlotDTO timeSlotDTO, TimeSlot timeSlot) {
        timeSlotMapper.update(timeSlotDTO, timeSlot);
        timeSlot.setService(serviceRepository.findById(timeSlotDTO.getServiceId()).orElseThrow());
        timeSlot.setLocation(locationRepository.findById(timeSlotDTO.getLocationId()).orElseThrow());
        timeSlot.setEmployee(employeeRepository.findById(timeSlotDTO.getEmployeeId()).orElseThrow());
        timeSlotRepository.save(timeSlot);
    }

    private static void checkTenantId(User user, TimeSlot timeSlot) {
        Integer tenantId = timeSlot.getEmployee().getUser().getTenantId();
        SecurityUtils.checkTenantId(tenantId, user);
    }
}
