package com.example.study.controller.api;

import com.example.study.model.entity.User;
import com.example.study.model.network.Header;
import com.example.study.model.network.request.UserApiRequest;
import com.example.study.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Slf4j // logging system
@RestController
@RequestMapping("/api/user2")
public class UserApiController2{

    @Autowired
    private UserRepository userRepository;

    @PostMapping("")        // /api/user
    public ResponseEntity create(@RequestBody Header<UserApiRequest> request) {
        log.info("{}", request);
        UserApiRequest userApiRequest = request.getData();
        User user = userRepository.findFirstByEmail(userApiRequest.getEmail());
        if (user != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("이메일 중복");
        } else {
            user = User.builder()
                    .account(userApiRequest.getAccount())
                    .password(userApiRequest.getPassword())
                    .status("REGISTERED")
                    .phoneNumber(userApiRequest.getPhoneNumber())
                    .email(userApiRequest.getEmail())
                    .registeredAt(LocalDateTime.now())
                    .build();
            User newUser = userRepository.save(user);
            return ResponseEntity.status(HttpStatus.OK).body("계정 생성 성공");
        }
    }
}
