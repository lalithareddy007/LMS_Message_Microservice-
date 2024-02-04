package com.numpyninja.lmsmessageservice.service;

import com.numpyninja.lmsmessageservice.config.WebClientConfig;
import com.numpyninja.lmsmessageservice.model.User;
import com.numpyninja.lmsmessageservice.model.UserRoleProgramBatchMap;
import com.numpyninja.lmsmessageservice.repository.UserRoleProgramBatchMapRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserRoleProgramBatchMapService {
    private final UserRoleProgramBatchMapRepository userRoleProgramBatchMapRepository;
    private final WebClient webClient;

    public List<UserRoleProgramBatchMap> getUserRoleProgramBatchMap() {
        List<UserRoleProgramBatchMap> userRoleProgramBatchMapList = webClient.get()
                .uri("http://localhost:1234/lms/userRoleProgramBatchMap")
                .retrieve()
                .bodyToFlux(UserRoleProgramBatchMap.class)
                .collectList()
                .block();
        log.info("in Lms application");
        if (userRoleProgramBatchMapList!=null && !userRoleProgramBatchMapList.isEmpty()){
            log.info(userRoleProgramBatchMapList.toString());
            userRoleProgramBatchMapRepository.saveAll(userRoleProgramBatchMapList);
        }
        return userRoleProgramBatchMapList;
    }
}
