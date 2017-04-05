
import java.io.IOException;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

public class ZkTest {

	public static void main(String[] args) throws Exception {

		ZooKeeper zk = new ZooKeeper("localhost:2181", 6000, new Watcher() {

			public void process(WatchedEvent event) {
				System.out.println("监控所有被触发的事件:EVENT:" + event.getType());

			}
		});

		System.out.println("*******************************************************");
		// 查看根节点的子节点
		System.out.println("查看根节点的子节点:ls / => " + zk.getChildren("/", true));
		System.out.println("*******************************************************");

		
		
		// 关闭连接
		zk.close();

	}

}
