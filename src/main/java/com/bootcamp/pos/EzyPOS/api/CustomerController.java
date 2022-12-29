package com.bootcamp.pos.EzyPOS.api;

import com.bootcamp.pos.EzyPOS.dto.request.CustomerDto;
import com.bootcamp.pos.EzyPOS.dto.response.CustomerResponseDto;
import com.bootcamp.pos.EzyPOS.service.CustomerService;
import com.bootcamp.pos.EzyPOS.util.StandardResponse;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    //standard response entities
    //custom queries
    //transaction

    @Autowired
    private CustomerService customerService;

    @PostMapping(
            value = "/create",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {"text/xml",MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}
    ) //http://localhost:8000/api/v1/customer/create (POST)
    public ResponseEntity<StandardResponse> save(@RequestBody CustomerDto dto){
        return new ResponseEntity<>(
                new StandardResponse(
                        201,
                        customerService.saveCustomer(dto),
                        null
                ), HttpStatus.CREATED
        );

    }

   /* @GetMapping("/{id}") //http://localhost:8000/api/v1/customer/15 (GET)
    public ResponseEntity<StandardResponse> findCustomer(@PathVariable String id){
        return customerService.findCustomer(id);
    }

    @PutMapping(value = "/modify",params = {"id"}) //http://localhost:8000/api/v1/customer/modify?id=15 (PUT)
    public ResponseEntity<StandardResponse> updateCustomer(@RequestBody CustomerDto dto, @RequestParam String id){
        return customerService.updateCustomer(dto, id);
    }

    @DeleteMapping("/remove/{id}")//http://localhost:8000/api/v1/customer/remove/15 (DELETE)
    public ResponseEntity<StandardResponse> deleteCustomer(@PathVariable String id){
        return customerService.deleteCustomer(id);
    }

    @GetMapping("/list")//http://localhost:8000/api/v1/customer/list (GET)
    public ResponseEntity<StandardResponse> findAllCustomers(){
        return customerService.findAllCustomers();
    }*/
}
