package com.food.ordering.zinger.controller;


import com.food.ordering.zinger.column.UserColumn;
import com.food.ordering.zinger.model.ConfigurationModel;
import com.food.ordering.zinger.service.ConfigurationService;
import com.food.ordering.zinger.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.Configuration;

@RestController
@RequestMapping("/config")
public class ConfigurationController {

    @Autowired
    ConfigurationService configurationService;

    @PatchMapping(value = "")
    Response<String> updateConfiguration(@RequestBody ConfigurationModel configurationModel, @RequestHeader(value = UserColumn.oauthId) String oauthId, @RequestHeader(value = UserColumn.mobile) String mobile, @RequestHeader(value = UserColumn.role) String role){
        return configurationService.updateConfiguration(configurationModel,oauthId,mobile,role);
    }
}
