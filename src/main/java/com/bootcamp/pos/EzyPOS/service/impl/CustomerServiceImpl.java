package com.bootcamp.pos.EzyPOS.service.impl;

import com.bootcamp.pos.EzyPOS.dto.request.CustomerDto;
import com.bootcamp.pos.EzyPOS.repo.CustomerRepo;
import com.bootcamp.pos.EzyPOS.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public String saveCustomer(CustomerDto dto) {
        customerRepo.save();
        return null;
    }

    @Override
    public String findCustomer(String id) {
        return null;
    }

    @Override
    public String updateCustomer(CustomerDto dto, String id) {
        return null;
    }

    @Override
    public String deleteCustomer(String id) {
        return null;
    }

    @Override
    public String findAllCustomers() {
        return null;
    }
}
