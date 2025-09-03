package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String email; // link to users.email

    public String name;
    public String phone;
    public String designation;
    public String qualification;

    public Employee() {}
    public Employee(String email, String name, String phone, String designation, String qualification) {
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.designation = designation;
        this.qualification = qualification;
    }
}
