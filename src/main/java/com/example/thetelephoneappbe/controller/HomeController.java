package com.example.thetelephoneappbe.controller;


import com.example.thetelephoneappbe.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    private RoleService roleService;

    @Autowired
    public void setCertificationService(RoleService roleService) {
        this.roleService = roleService;
    }




}
