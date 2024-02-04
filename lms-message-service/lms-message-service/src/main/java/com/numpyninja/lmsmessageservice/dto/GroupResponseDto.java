package com.numpyninja.lmsmessageservice.dto;

import com.numpyninja.lmsmessageservice.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupResponseDto {
    private Long groupId;
    private String groupName;
    private String description;
    private List<User> members;
}
