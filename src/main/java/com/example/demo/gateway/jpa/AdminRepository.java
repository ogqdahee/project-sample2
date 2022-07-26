package com.example.demo.gateway.jpa;

import com.example.demo.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepository extends JpaRepository<Admin, Long> {

    @Query("select a from Admin as a where a.name = ?1")
    Admin findByName(String name);
}
