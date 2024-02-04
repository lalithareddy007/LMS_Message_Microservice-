package com.numpyninja.lmsmessageservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String userId;
    private String userFirstName;
    private String userLastName;
    private String userMiddleName;
    private Long userPhoneNumber;

}
