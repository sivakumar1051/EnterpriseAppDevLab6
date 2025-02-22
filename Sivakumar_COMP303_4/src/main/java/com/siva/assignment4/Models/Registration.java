package com.siva.assignment4.Models;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "Registration")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "firstname is manadatory")
    @Size(min = 2, max = 50, message = "first name must be between 2 and 50 characters")
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotBlank(message = "lastname is required")
    @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @NotBlank(message = "Company name is manadatory")
    @Column(name = "company_institution", nullable = false)
    @Size(min=3,max=100)
    private String companyInstitution;

    @NotBlank(message = "Address is mandatory")
    @Size(max = 255, message = "Address should be max of 255 characters")
    @Column(name = "address", nullable = false)
    private String address;

    @NotBlank(message = "City is required")
    @Column(name = "city", nullable = false)
    private String city;

    @NotBlank(message = "State is manadatory")
    @Column(name = "state", nullable = false)
    private String state;

    @NotBlank(message = "Country is required")
    @Column(name = "country", nullable = false)
    private String country;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid Email format")
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @NotBlank(message = "Phone Number is required")
    @Pattern(regexp = "^\\+?[0-9]{10,15}$", message = "Invalid contact number format")
    @Column(name = "phone_number", nullable = false, unique = true)
    private String phoneNumber;

    @NotNull(message = "Meal Preference is required")
    @Column(name = "meal_preference", nullable = false)
    private String mealPreference;

    @NotNull(message = "Payment Mode is mandatory")
    @Column(name = "payment_mode", nullable = false)
    private String paymentMode;

    @Column(name = "cheque_number",nullable =false)
    private String chequeNumber;

    @Column(name = "bank_name",nullable=false)
    private String bankName;

    @Column(name = "payable_at")
    private String payableAt;
}
