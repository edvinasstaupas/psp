package com.example.psp.mapper;

import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.AccountDetailsDTO;
import com.example.psp.dto.CreateAccountDTO;
import com.example.psp.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(config = DefaultMapperConfig.class)
public interface CustomerMapper {

    List<AccountDetailsDTO> mapCustomers(List<Customer> customer);

    AccountDetailsDTO map(Customer customer);

    void update(CreateAccountDTO createAccountDTO, @MappingTarget Customer customer);
}
