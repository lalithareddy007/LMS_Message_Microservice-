package com.numpyninja.lmsmessageservice.dto;

import com.numpyninja.lmsmessageservice.model.Group;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnnouncementRequestDto {
    private String sender;
    private Group recipients;
    private String content;
    private Timestamp postingTime;
}
