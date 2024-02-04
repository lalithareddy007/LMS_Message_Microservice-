package com.numpyninja.lmsmessageservice.service;

import com.numpyninja.lmsmessageservice.dto.GroupRequestDto;
import com.numpyninja.lmsmessageservice.dto.GroupResponseDto;
import com.numpyninja.lmsmessageservice.model.Group;
import com.numpyninja.lmsmessageservice.repository.GroupRepository;
import com.numpyninja.lmsmessageservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class GroupService {
    private final GroupRepository groupRepository;
    private final UserRepository userRepository;
    /**
     *
     * @param groupRequestDto
     * creating new group of users
     * @return GroupResponseDto
     */
    public GroupResponseDto createNNGroup (GroupRequestDto groupRequestDto){
        var groupResponseDto = new GroupResponseDto();
        //groupResponseDto.setGroupId(UUID.randomUUID().node());
        groupResponseDto.setGroupName(groupRequestDto.getGroupName());
        groupResponseDto.setDescription(groupRequestDto.getDescription());
        groupResponseDto.setMembers(userRepository.findAll());
        var group = mapToGroup(groupResponseDto);
        groupRepository.save(group);
        groupResponseDto.setGroupId(group.getGroupId());
        return groupResponseDto;
    }
    private Group mapToGroup(GroupResponseDto groupResponseDto){
        var group = new Group();
        group.setGroupName(groupResponseDto.getGroupName());
        group.setDescription(groupResponseDto.getDescription());
        group.setMembers(groupResponseDto.getMembers());
        return  group;
    }
}
