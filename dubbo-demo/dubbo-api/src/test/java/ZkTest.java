
import java.io.IOException;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

public class ZkTest {

	public static void main(String[] args) throws Exception {

		ZooKeeper zk = new ZooKeeper("127.0.0.1:2181", 60000, new Watcher() {

			public void process(WatchedEvent event) {
				System.out.println("监控所有被触发的事件:EVENT:" + event.getType());

			}
		});
		
		
		// 关闭连接
        zk.close();

	}

}
