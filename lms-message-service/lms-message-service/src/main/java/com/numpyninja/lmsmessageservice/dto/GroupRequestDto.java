package com.numpyninja.lmsmessageservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupRequestDto {
    private String groupName;
    private String description;

}
