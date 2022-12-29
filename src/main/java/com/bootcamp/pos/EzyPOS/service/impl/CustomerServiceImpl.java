package com.bootcamp.pos.EzyPOS.service.impl;

import com.bootcamp.pos.EzyPOS.dto.request.CustomerRequestDto;
import com.bootcamp.pos.EzyPOS.dto.response.CustomerResponseDto;
import com.bootcamp.pos.EzyPOS.entity.Customer;
import com.bootcamp.pos.EzyPOS.repo.CustomerRepo;
import com.bootcamp.pos.EzyPOS.service.CustomerService;
import com.bootcamp.pos.EzyPOS.util.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    //Exception


    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private IdGenerator idGenerator;


    @Override
    public String saveCustomer(CustomerRequestDto dto) {
        // dto => entity ==> save
        //id generate
        Customer c1 = new Customer(
                idGenerator.generateId(10),dto.getName(),dto.getAddress(),dto.getSalary()
        );
        customerRepo.save(c1);
        return c1.getId()+"Saved!";
    }

    @Override
    public CustomerResponseDto findCustomer(String id) throws ClassNotFoundException {
        Customer c = customerRepo.findById(id).orElse(null);
        if (c==null){
            throw new ClassNotFoundException("Not Found");
        }
        return new CustomerResponseDto(
                c.getId(),c.getName(),c.getAddress(),c.getSalary()
        );

    }

    @Override
    public String updateCustomer(CustomerRequestDto dto, String id) {
        Customer c = customerRepo.findById(id).orElse(null);
        if (null==c) return "Not found";
        c.setName(dto.getName());
        c.setAddress(dto.getAddress());
        c.setSalary(dto.getSalary());
        customerRepo.save(c); //update
        return c.getName()+"was updated!";
    }

    @Override
    public String deleteCustomer(String id) {
        customerRepo.deleteById(id);
        return id+ "was deleted!";
    }

    @Override
    public List<CustomerResponseDto> findAllCustomers() {

        //modalMapper (http://modelmapper.org/)
        //mapstruct (http://mapstruct.org/)
        List<CustomerResponseDto> dtoList = new ArrayList<>();
        List<Customer> list = customerRepo.findAll();
        for (Customer c: list
             ) {
            dtoList.add(new CustomerResponseDto(
                    c.getId(),c.getName(),c.getAddress(),c.getSalary()
            ));
        }
        return dtoList;
    }
}
