package com.bootcamp.pos.EzyPOS.util.mapper;

import com.bootcamp.pos.EzyPOS.dto.request.CustomerDto;
import com.bootcamp.pos.EzyPOS.dto.response.CustomerResponseDto;
import com.bootcamp.pos.EzyPOS.entity.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer toCustomer(CustomerDto dto);
    CustomerResponseDto toCustomerResponseDto(Customer customer);
    List<CustomerResponseDto> toCustomerResponseDtoList(List<Customer> list);
}
