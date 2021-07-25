package com.example.study.repository;

import com.example.study.model.entity.Settlement;
import com.example.study.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SettlementRepositoryTest {

    @Autowired
    private SettlementRepository settlementRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        User user = userRepository.getById(1L);
        Settlement settlement = Settlement.builder().userId(user.getId()).price(new BigDecimal(1)).build();
        Settlement newSettlement = settlementRepository.save(settlement);
        System.out.println(newSettlement);
    }
}