package com.example.demo.service.dto;

import com.example.demo.model.Admin;
import lombok.Getter;

@Getter
public class AdminNameDTO {
    private String name;

    public AdminNameDTO(Admin admin) {
        this.name = admin.getName();
    }

    public String getName() {
        return name;
    }
}
