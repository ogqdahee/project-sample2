package com.example.demo.service.command;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AdminCommand {
    private String name;

    public AdminCommand(String name){
        this.name = name;
    }
}
