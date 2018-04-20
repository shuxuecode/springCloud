package org.hystrix.filter;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;

@Activate(group = Constants.CONSUMER)
public class DubboHystrixFilter implements Filter {

	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
		System.out.println(7788);
		
		DubboHystrixCommand command = new DubboHystrixCommand(invoker, invocation);
		
		return command.execute();
	}

//	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
//		System.out.println("8899");
////		DubboHystrixCommand command = new DubboHystrixCommand(invoker, invocation);
//
////		DubboHystrixCommand command = new DubboHystrixCommand(invoker, invocation);
//		
////		return command.execute();
//		return invoke(invoker, invocation);
//	}

}
