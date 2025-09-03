package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeRepository repo;
    public EmployeeController(EmployeeRepository repo) { this.repo = repo; }

    @PostMapping
    public ResponseEntity<Employee> add(@RequestBody Employee e) {
        return ResponseEntity.ok(repo.save(e));
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<Employee> getByEmail(@PathVariable String email) {
        Optional<Employee> opt = repo.findByEmail(email);
        return opt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
