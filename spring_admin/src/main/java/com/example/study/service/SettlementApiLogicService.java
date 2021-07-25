package com.example.study.service;

import com.example.study.model.entity.OrderGroup;
import com.example.study.model.entity.Settlement;
import com.example.study.model.entity.User;
import com.example.study.model.network.request.SettlementApiRequest;
import com.example.study.model.network.response.SettlementApiResponse;
import com.example.study.repository.SettlementRepository;
import com.example.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class SettlementApiLogicService {

    @Autowired
    private SettlementRepository settlementRepository;

    @Autowired
    private UserRepository userRepository;

    public SettlementApiResponse create(Long id) {
        User user = userRepository.getById(id);
        BigDecimal totalPrice = new BigDecimal(0);
        if(user == null) {
            return null;
        }
        for(OrderGroup orderGroup: user.getOrderGroupList()) {
            totalPrice = totalPrice.add(orderGroup.getTotalPrice());
        }
        BigDecimal finalTotalPrice = totalPrice;
        BigDecimal finalTotalPrice1 = totalPrice;
        Settlement settlement = settlementRepository.findById(id)
                .map(settle -> {
                    settle.setPrice(finalTotalPrice);
                    return settle;
                }).orElseGet(() -> Settlement.builder().userId(id).price(finalTotalPrice1).build());

        Settlement newSettlement = settlementRepository.save(settlement);
        SettlementApiResponse settlementApiResponse = SettlementApiResponse.builder()
                .userId(newSettlement.getUserId())
                .price(newSettlement.getPrice())
                .build();
        return settlementApiResponse;
    }
}
