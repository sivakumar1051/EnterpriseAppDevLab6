package com.siva.assignment4.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.siva.assignment4.Models.Registration;
import com.siva.assignment4.Repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepository;

	public Registration saveRegistration(Registration request) {
	   Registration savedRegistration=registrationRepository.save(request);
	   return savedRegistration;
	}

}
