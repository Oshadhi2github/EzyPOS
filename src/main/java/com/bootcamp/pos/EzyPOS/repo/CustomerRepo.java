package com.bootcamp.pos.EzyPOS.repo;

import com.bootcamp.pos.EzyPOS.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, String> {
}
