package com.numpyninja.lmsmessageservice.controller;

import com.numpyninja.lmsmessageservice.model.UserRoleProgramBatchMap;
import com.numpyninja.lmsmessageservice.service.UserRoleProgramBatchMapService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userRoleProgramBatchMap")
@RequiredArgsConstructor
public class UserRoleProgramBatchMapController {
    private final UserRoleProgramBatchMapService userRoleProgramBatchMapService;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserRoleProgramBatchMap> getUserRoleProgramBatchMap (){
        return userRoleProgramBatchMapService.getUserRoleProgramBatchMap();
    }


}
