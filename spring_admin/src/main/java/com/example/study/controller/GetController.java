package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // Localhost:8080/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod") // Localhost:8080/api/getMethod
    public String getRequest() {
        return "Hi getMethod";
    }

    @GetMapping("/getParameter") // Localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd) {
        System.out.println("id : " + id);
        System.out.println("password : " + pwd);

        return id+pwd;
    }

    // localhost:8080/api/multiParameter?account=abcd&email=study@gmail.com&page=10
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam) { // 객체로 리턴은 json 리턴을 의미
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        // json 회신
        return searchParam;
    }
}
