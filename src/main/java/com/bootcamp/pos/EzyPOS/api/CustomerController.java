package com.bootcamp.pos.EzyPOS.api;

import com.bootcamp.pos.EzyPOS.dto.request.CustomerDto;
import com.bootcamp.pos.EzyPOS.service.CustomerService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/create") //http://localhost:8000/api/v1/customer/create (POST)
    public String save(@RequestBody CustomerDto dto){
        return customerService.saveCustomer(dto);
    }

    @GetMapping("/{id}") //http://localhost:8000/api/v1/customer/15 (GET)
    public String findCustomer(@PathVariable String id){
        return customerService.findCustomer(id);
    }

    @PutMapping(value = "/modify",params = {"id"}) //http://localhost:8000/api/v1/customer/modify?id=15 (PUT)
    public String updateCustomer(@RequestBody CustomerDto dto, @RequestParam String id){
        return dto+"-"+id;
    }

    @DeleteMapping("/remove/{id}")//http://localhost:8000/api/v1/customer/remove/15 (DELETE)
    public String deleteCustomer(@PathVariable String id){
        return id+" - customer";
    }

    @GetMapping("/list")//http://localhost:8000/api/v1/customer/list (GET)
    public String findAllCustomers(){
        return "all customers";
    }
}
