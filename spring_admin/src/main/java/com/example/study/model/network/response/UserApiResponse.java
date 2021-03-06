package com.example.study.model.network.response;

import com.example.study.model.enumclass.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserApiResponse {

    private Long id;

    private String account;

    private String password;

    private String phoneNumber;

    private UserStatus status;

    private String email;

    private LocalDateTime registeredAt;

    private LocalDateTime unRegisteredAt;

    private List<OrderGroupApiResponse> orderGroupApiResponseList;
}
