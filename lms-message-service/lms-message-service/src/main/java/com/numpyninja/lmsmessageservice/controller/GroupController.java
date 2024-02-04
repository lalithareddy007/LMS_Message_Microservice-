package com.numpyninja.lmsmessageservice.controller;

import com.numpyninja.lmsmessageservice.dto.GroupRequestDto;
import com.numpyninja.lmsmessageservice.dto.GroupResponseDto;
import com.numpyninja.lmsmessageservice.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/group")
public class GroupController {
    private final GroupService groupService;
    @PostMapping(path = "/masterGroup")
    @ResponseStatus(HttpStatus.CREATED)
    public GroupResponseDto createNNGroup (@RequestBody GroupRequestDto groupRequestDto){
        return groupService.createNNGroup(groupRequestDto);


    }
}
