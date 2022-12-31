package com.bootcamp.pos.EzyPOS.service;

import com.bootcamp.pos.EzyPOS.dto.request.CustomerRequestDto;
import com.bootcamp.pos.EzyPOS.dto.response.CustomerResponseDto;
import com.bootcamp.pos.EzyPOS.dto.response.paginate.PaginateCustomerResponseDto;

import java.util.List;

public interface CustomerService {
    public String saveCustomer(CustomerRequestDto dto);
    public CustomerResponseDto findCustomer(String id) throws ClassNotFoundException;
    public String updateCustomer(CustomerRequestDto dto, String id) throws ClassNotFoundException;
    public String deleteCustomer(String id);
    public PaginateCustomerResponseDto findAllCustomers(
            String searchText, int page, int size
    );
}
