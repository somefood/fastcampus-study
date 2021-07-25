package com.example.study.controller.api;

// 테이블 create sql
// create table settlement
//(
//	user_id int not null,
//	price decimal(12,4) default 0.0 not null,
//	constraint settlement_pk
//		primary key (user_id)
//);


import com.example.study.model.network.response.SettlementApiResponse;
import com.example.study.service.SettlementApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/settlement")
public class SettlementApiController {

    @Autowired
    SettlementApiLogicService settlementApiLogicService;

    @GetMapping("{id}")
    public SettlementApiResponse test(@PathVariable Long id) {
        return settlementApiLogicService.create(id);
    }
}
