package com.fastcampus.javaallinone.project3.mycontact.domain;

import com.fastcampus.javaallinone.project3.mycontact.domain.dto.Birthday;
import lombok.*;

import javax.persistence.*;
import javax.validation.Valid;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Person {
    @Id
    @GeneratedValue // 자동 생성
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private Integer age;

    private String hobby;

    @NonNull
    private String bloodType;

    private String address;

    @Valid
    @Embedded
    private Birthday birthday;

    private String job;

    @ToString.Exclude
    private String phoneNumber;

//    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
//    @OneToOne(cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.EAGER, optional = false)
    @OneToOne(cascade = {CascadeType.ALL}, orphanRemoval = true)
    @ToString.Exclude
    private Block block;
}
