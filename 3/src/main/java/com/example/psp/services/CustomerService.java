package com.example.psp.services;

import com.example.psp.dto.AccountDetailsDTO;
import com.example.psp.dto.CartDTO;
import com.example.psp.dto.CreateAccountDTO;
import com.example.psp.dto.ReservationInformationDTO;
import com.example.psp.mapper.CartMapper;
import com.example.psp.mapper.CustomerMapper;
import com.example.psp.mapper.ReservationMapper;
import com.example.psp.model.Cart;
import com.example.psp.model.Customer;
import com.example.psp.model.Reservation;
import com.example.psp.repositories.CartRepository;
import com.example.psp.repositories.CustomerRepository;
import com.example.psp.repositories.ReservationRepository;
import com.example.psp.security.SecurityUtils;
import com.example.psp.security.User;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class CustomerService {
    private final CartRepository cartRepository;
    private final ReservationRepository reservationRepository;
    private final CustomerRepository customerRepository;
    private final CartMapper cartMapper;
    private final ReservationMapper reservationMapper;
    private final CustomerMapper customerMapper;

    public CustomerService(CartRepository cartRepository, ReservationRepository reservationRepository, CustomerRepository customerRepository,
            CartMapper cartMapper,
            ReservationMapper reservationMapper, CustomerMapper customerMapper) {
        this.cartRepository = cartRepository;
        this.reservationRepository = reservationRepository;
        this.customerRepository = customerRepository;
        this.cartMapper = cartMapper;
        this.reservationMapper = reservationMapper;
        this.customerMapper = customerMapper;
    }

    public void updateAccountDetails(Integer userId, CreateAccountDTO createAccountDTO, User user) {
        Customer customer = customerRepository.findById(userId).orElseThrow();
        SecurityUtils.checkTenantId(customer.getUser().getTenantId(), user);
        customerMapper.update(createAccountDTO, customer);
        customerRepository.save(customer);
    }

    public AccountDetailsDTO getAccountDetails(Integer userId, User user) {
        Customer customer = customerRepository.findById(userId).orElseThrow();
        SecurityUtils.checkTenantId(customer.getUser().getTenantId(), user);
        return customerMapper.map(customer);
    }

    @Deprecated
    public void customerPost(CreateAccountDTO createAccountDTO, User user) {
    }

    public List<AccountDetailsDTO> getAccountDetails(String email, String name, Integer pageSize, Integer page, User user) {
        PageRequest pageRequest = PageRequest.of(page, pageSize);
        List<Customer> customers = customerRepository.findAllByEmailAndName(email, name, pageRequest);
        return customerMapper.mapCustomers(customers);
    }

    public List<ReservationInformationDTO> getReservations(Integer customerId, OffsetDateTime from, OffsetDateTime to, User user) {
        List<Reservation> reservations = reservationRepository.findAllByCustomerIdAndTimeSlotStartTimeGreaterThanEqualAndTimeSlotEndTimeLessThanEqual(customerId, from, to);
        return reservationMapper.mapReservations(reservations);
    }

    public CartDTO getCustomerCart(Integer customerId, User user) {
        Cart cart = cartRepository.findCartByCustomerId(customerId);
        SecurityUtils.checkTenantId(cart.getCustomer().getUser().getTenantId(), user);
        return cartMapper.map(cart);
    }
}
