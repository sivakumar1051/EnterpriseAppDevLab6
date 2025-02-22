package com.siva.assignment4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siva.assignment4.Models.Registration;

@Repository
public interface RegistrationRepository  extends JpaRepository<Registration,Long>{

}
