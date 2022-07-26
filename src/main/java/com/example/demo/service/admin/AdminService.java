package com.example.demo.service.admin;


import com.example.demo.service.command.AdminCommand;
import com.example.demo.service.dto.AdminNameDTO;

public interface AdminService {

    AdminNameDTO searchName(AdminCommand command);
}
