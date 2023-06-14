package com.example.thetelephoneappbe.service;


import com.example.thetelephoneappbe.model.Role;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

public interface RoleService {
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    List<Role> getAllRole();
}

