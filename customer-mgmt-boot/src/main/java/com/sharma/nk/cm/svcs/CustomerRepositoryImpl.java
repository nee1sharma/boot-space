package com.sharma.nk.cm.svcs;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sharma.nk.cm.models.Customer;

@Repository
@Profile("mysql")
public interface CustomerRepositoryImpl extends JpaRepository<Customer, String> {

}