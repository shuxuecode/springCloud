package com.zsx.config;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.cluster.loadbalance.AbstractLoadBalance;

import java.util.List;
import java.util.Random;

/**
 * 自定义负载均衡
 *
 * @author zsx
 * <p>
 * todo  怎么使用
 */
public class MyLoadBalance extends AbstractLoadBalance {

    private final Random random = new Random();

    @Override
    protected <T> Invoker<T> doSelect(List<Invoker<T>> invokers, URL url, Invocation invocation) {

        Invoker<T> invoker = null;

        int size = invokers.size();

        System.out.println("生产者总个数" + size);

        for (int i = 0; i < size; i++) {

            invoker = invokers.get(i);

//            if (random.nextInt(i + 1) % 2 == 0) {
//                invoker = invokers.get(i);
//                break;
//            }
        }

        return invoker;
    }
}
