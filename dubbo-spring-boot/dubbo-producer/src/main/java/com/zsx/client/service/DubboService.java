package com.zsx.client.service;

import com.zsx.client.dto.RequestDto;
import com.zsx.client.dto.ResponseDto;

import java.util.Map;

public interface DubboService {


    String uuid(String str);


    Map<String, Object> testMap(Map<String, Object> params);


    ResponseDto testDto(RequestDto requestDto);
}
