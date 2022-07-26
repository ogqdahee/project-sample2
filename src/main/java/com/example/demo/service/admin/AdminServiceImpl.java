package com.example.demo.service.admin;

import com.example.demo.gateway.jpa.AdminRepository;
import com.example.demo.service.command.AdminCommand;
import com.example.demo.service.dto.AdminNameDTO;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{

    private final AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public AdminNameDTO searchName(AdminCommand command) {
        return new AdminNameDTO(adminRepository.findByName(command.getName()));
    }
}
