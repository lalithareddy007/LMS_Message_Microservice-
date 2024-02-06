package com.numpyninja.lmsmessageservice.service;

import com.numpyninja.lmsmessageservice.dto.AnnouncementRequestDto;
import com.numpyninja.lmsmessageservice.dto.AnnouncementResponseDto;
import com.numpyninja.lmsmessageservice.model.Announcement;
import com.numpyninja.lmsmessageservice.repository.AnnouncementRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class AnnouncementService {
    private final AnnouncementRepository announcementRepository;
    /**
     *
     * @param announcementRequestDto
     * creating new announcement to group users
     * @return announcementResponseDto
     */
    public AnnouncementResponseDto createAnnouncement(AnnouncementRequestDto announcementRequestDto){
        var announcementResponseDto = mapToAnnouncementResponseDto(announcementRequestDto);
        var announcement = mapToAnnouncement(announcementResponseDto);

        announcementRepository.save(announcement);
        return announcementResponseDto;

    }
    private AnnouncementResponseDto mapToAnnouncementResponseDto(AnnouncementRequestDto announcementRequestDto){
        var announcementResponseDto = new AnnouncementResponseDto();
        announcementResponseDto.setSender(announcementResponseDto.getSender());
        announcementResponseDto.setContent(announcementRequestDto.getContent());
        announcementResponseDto.setRecipients(announcementRequestDto.getRecipients());
        announcementResponseDto.setPostingTime(announcementRequestDto.getPostingTime());
        return announcementResponseDto;
    }
    private Announcement mapToAnnouncement(AnnouncementResponseDto announcementResponseDto){
        var announcement = new Announcement();
        announcement.setSender(announcementResponseDto.getSender());
        announcement.setContent(announcementResponseDto.getContent());
        announcement.setRecipients(announcementResponseDto.getRecipients());
        announcement.setPostingTime(announcementResponseDto.getPostingTime());
        return announcement;
    }
}
