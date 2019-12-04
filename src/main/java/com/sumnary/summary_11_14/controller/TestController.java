package com.sumnary.summary_11_14.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Auther: admin
 * @Date: 2019/12/4 14:32
 * @Description:
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "text";
    }

}
