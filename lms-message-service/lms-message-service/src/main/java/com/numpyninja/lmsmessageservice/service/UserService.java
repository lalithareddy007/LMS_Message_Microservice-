package com.numpyninja.lmsmessageservice.service;

import com.numpyninja.lmsmessageservice.model.User;
import com.numpyninja.lmsmessageservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final WebClient webClient;

    public List<User> getUser(){
        List<User> userList = webClient.get()
                .uri("http://localhost:1234/lms/users")
                .retrieve()
                .bodyToFlux(User.class)
                .collectList()
                .block();
        log.info("in Lms application");
        if (userList!=null && !userList.isEmpty()){
           log.info(userList.toString());
            userRepository.saveAll(userList);
       }
        return userList;

    }
}
