package com.example.study.model.entity;

import com.example.study.model.enumclass.UserStatus;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor // 모든 매개변수 가지는 생성자
@NoArgsConstructor
@Entity // == table
@ToString(exclude = {"orderGroupList"})
@EntityListeners(AuditingEntityListener.class)
@Builder
@Accessors(chain = true)
// @Table (동일하면 설정 안해도 됨)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "account") // 동일하면 안해도 됨
    private String account;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserStatus status;
    private String email;
    private String phoneNumber;
    private LocalDateTime registeredAt;
    private LocalDateTime unregisteredAt;
    @CreatedDate
    private LocalDateTime createdAt;
    @CreatedBy
    private String createdBy;
    @LastModifiedDate
    private LocalDateTime updatedAt;
    @LastModifiedBy
    private String updatedBy;

    // User(1) : OrderGroup(N)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<OrderGroup> orderGroupList;
}
