package com.example.psp.services;

import com.example.psp.dto.AccountDetailsDTO;
import com.example.psp.dto.CartDTO;
import com.example.psp.dto.CreateAccountDTO;
import com.example.psp.dto.ReservationInformationDTO;
import com.example.psp.security.User;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class CustomerService {

    public void customerUserIdPut(Integer userId, CreateAccountDTO createAccountDTO, User user) {
    }

    public AccountDetailsDTO customerUserIdGet(Integer userId, User user) {
        return null;
    }

    @Deprecated
    public void customerPost(CreateAccountDTO createAccountDTO, User user) {
    }

    public List<AccountDetailsDTO> customerGet(String email, String name, Integer pageSize, Integer page, User user) {
        return null;
    }

    public List<ReservationInformationDTO> customerCustomerIdReservationListGet(Integer customerId, OffsetDateTime from, OffsetDateTime to, User user) {
        return null;
    }

    public CartDTO customerCustomerIdReservationGet(Integer customerId, User user) {
        return null;
    }
}
