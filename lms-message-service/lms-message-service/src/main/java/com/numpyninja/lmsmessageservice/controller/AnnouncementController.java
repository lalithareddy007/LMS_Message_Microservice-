package com.numpyninja.lmsmessageservice.controller;

import com.numpyninja.lmsmessageservice.dto.AnnouncementRequestDto;
import com.numpyninja.lmsmessageservice.service.AnnouncementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lms/announcement")
public class AnnouncementController {
    private final AnnouncementService announcementService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String postAnnouncement (@RequestBody AnnouncementRequestDto announcementRequestDto ){
         announcementService.createAnnouncement(announcementRequestDto);
         return "Announcement posted successfully";

    }
}
