



自定义FIlter实现方法很简单，分为3个步骤：
1、自定义Filter，必须继承com.apache.dubbo.rpc.Filter接口
2、在resources目录下添加纯文本文件META-INF/dubbo/com.apache.dubbo.rpc.Filter，内容写成 xxx=xxx.xxx.xxxFilter
3、在dubbo配置xml中添加 <dubbo:provider filter="xxxFilter" /> 或者 <dubbo:consumer filter="xxxFilter" /> 使Filter生效。

