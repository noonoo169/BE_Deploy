package com.example.thetelephoneappbe.controller;


import com.example.thetelephoneappbe.model.Role;
import com.example.thetelephoneappbe.service.RoleService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
//@RestController
//@Slf4j
//@AllArgsConstructor
//@RequestMapping("/home")
public class HomeController {
    private RoleService roleService;

    @Autowired
    public void setCertificationService(RoleService roleService) {
        this.roleService = roleService;
    }

//    @GetMapping("/roller")
//    public ResponseEntity<List<Role>> creat() {
//        return ResponseEntity<List<Role>>(roleService.getAllRole(),HttpStatus.OK);
//    }

//    @PostMapping("/roller")
//    public List<Role> start() {
//        log.info("start funtion");
//        return roleService.getAllRole();
//    }

    @GetMapping("/start")
    public ResponseEntity<List<Role>> start() {
        System.out.println("start function");
        return ResponseEntity.ok(roleService.getAllRole());
    }

}
