package com.zsx.filter;

import org.apache.dubbo.rpc.*;

/**
 * 自定义过滤器
 */
public class DemoFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        return null;
    }
}
