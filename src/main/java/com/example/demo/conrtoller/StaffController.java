package com.example.demo.conrtoller;



import com.example.demo.service.command.AdminCommand;
import com.example.demo.service.admin.AdminServiceImpl;
import com.example.demo.service.dto.AdminNameDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class StaffController {

    private final AdminServiceImpl adminService;

    public StaffController(AdminServiceImpl adminService) {
        this.adminService = adminService;
    }

    @GetMapping("{name}")
    public AdminNameDTO searchName(
            @PathVariable String name
    ){
        return adminService.searchName(new AdminCommand(name));
    }
}
