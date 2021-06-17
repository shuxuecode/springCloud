package com.zsx.controller;

import com.zsx.client.dto.RequestDto;
import com.zsx.client.dto.ResponseDto;
import com.zsx.client.service.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zsx
 */
@RestController
public class DemoController {


    @Autowired
    private DubboService dubboService;

    @GetMapping("/")
    public String get() {
        String uuid = dubboService.uuid("");
        return uuid;
    }


    @GetMapping("/map")
    public Map<String, Object> testMap(String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("names", name);
        Map<String, Object> result = dubboService.testMap(map);
        return result;
    }


    @GetMapping("/data")
    public ResponseDto testDto(String name) {
        RequestDto requestDto = new RequestDto();

        requestDto.setId(123L);
        requestDto.setName(name);
        requestDto.setAge(30);
        requestDto.setBirthday(new Date());

        ResponseDto result = dubboService.testDto(requestDto);
        return result;
    }
}
