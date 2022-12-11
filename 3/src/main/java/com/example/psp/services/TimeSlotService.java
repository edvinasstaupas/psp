package com.example.psp.services;

import com.example.psp.dto.TimeSlotDTO;
import com.example.psp.security.User;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class TimeSlotService {

    public List<TimeSlotDTO> timeSlotEmployeeIdGet(Integer employeeId, User user) {
        return null;
    }

    public List<TimeSlotDTO> timeSlotGet(OffsetDateTime fromDate, OffsetDateTime toDate, User user) {
        return null;
    }

    public List<TimeSlotDTO> timeSlotLocationIdGet(Integer locationId, User user) {
        return null;
    }

    public void timeSlotPost(TimeSlotDTO timeSlotDTO, User user)  {
    }

    public List<TimeSlotDTO> timeSlotServiceIdGet(Integer serviceId, User user) {
        return null;
    }

    public void timeSlotTimeSlotIdDelete(Integer timeSlotId, User user)  {
    }

    public TimeSlotDTO timeSlotTimeSlotIdGet(Integer timeSlotId, User user) {
        return null;
    }

    public void timeSlotTimeSlotIdPut(Integer timeSlotId, TimeSlotDTO timeSlotDTO, User user)  {
    }
}
