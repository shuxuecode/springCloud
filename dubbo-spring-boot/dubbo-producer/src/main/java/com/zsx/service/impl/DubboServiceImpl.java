package com.zsx.service.impl;

import com.zsx.client.dto.RequestDto;
import com.zsx.client.dto.ResponseDto;
import com.zsx.client.service.DubboService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.UUID;

/**
 * @author zsx
 */
@Service
public class DubboServiceImpl implements DubboService {

    @Override
    public String uuid(String str) {
        System.out.println(str);
        return UUID.randomUUID().toString();
    }

    @Override
    public Map<String, Object> testMap(Map<String, Object> params) {

        if (params != null) {
            params.put("return", "ok");
        }

        return params;
    }

    @Override
    public ResponseDto testDto(RequestDto requestDto) {

        System.out.println(requestDto);
        if (requestDto != null) {
            System.out.println(requestDto.getId());
            System.out.println(requestDto.getName());
            System.out.println(requestDto.getAge());
            System.out.println(requestDto.getBirthday());
        }

        ResponseDto responseDto = new ResponseDto();

        responseDto.setCode(1);
        responseDto.setMsg("msg");

        return responseDto;
    }
}
