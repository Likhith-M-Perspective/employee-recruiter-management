package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "recruiter")
public class Recruiter {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String email; // link to users.email

    public String name;
    public String phone;
    public String company;
    public String designation;

    public Recruiter() {}
    public Recruiter(String email, String name, String phone, String company, String designation) {
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.company = company;
        this.designation = designation;
    }
}
