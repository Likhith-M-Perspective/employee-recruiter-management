package com.example.demo.controller;

import com.example.demo.entity.Recruiter;
import com.example.demo.repository.RecruiterRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/recruiters")
public class RecruiterController {
    private final RecruiterRepository repo;
    public RecruiterController(RecruiterRepository repo) { this.repo = repo; }

    @PostMapping
    public ResponseEntity<Recruiter> add(@RequestBody Recruiter r) {
        return ResponseEntity.ok(repo.save(r));
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<Recruiter> getByEmail(@PathVariable String email) {
        Optional<Recruiter> opt = repo.findByEmail(email);
        return opt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
