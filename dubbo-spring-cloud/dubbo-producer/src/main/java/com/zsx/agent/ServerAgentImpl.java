package com.zsx.agent;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Created by ZSX on 2018/9/12.
 *
 * @author ZSX
 */

// 第一种写法
//@com.alibaba.dubbo.config.annotation.Service(interfaceClass = ServerAgent.class)
//@Service

// 第二种写法
@Service(interfaceClass = ServerAgent.class)
@Component
public class ServerAgentImpl implements ServerAgent {

    @Override
    public String formatUUID(String uuid) {
        return uuid.replace("-", "!@#");
    }
}
